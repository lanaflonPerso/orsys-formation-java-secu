package com.leuville.handler;


import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Element;

public class LogHandler implements SOAPHandler<SOAPMessageContext> {

	public Set<QName> getHeaders() {
		return null;
	}

	public void close(MessageContext context) {
		System.out.println("...close...");
	}

	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("...fault...");
		return true;
	}

	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessage message = context.getMessage();
		
		try {
			System.out.println("----------------------------------");
			System.out.println(getClass().getName() + " - " + hashCode());
			System.out.println("----------------------------------");
			System.out.println(
					(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY) 
					? "Requête":"Réponse");
			System.out.println("----------------------------------");
			Element soapXML = message.getSOAPPart().getDocumentElement();
			
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer t = factory.newTransformer();
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.transform(new DOMSource(soapXML), new StreamResult(System.out));			
			
			Iterator<AttachmentPart> it = message.getAttachments();
			while (it.hasNext()) {
				AttachmentPart ap = it.next();
				System.out.println (ap.getContentType() + " " + ap.getRawContentBytes());
			}
			
			System.out.println("\n----------------------------------\n");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}

}
