
package com.leuville.fournisseurservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code-produit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeProduit"
})
@XmlRootElement(name = "getPrix")
public class GetPrix {

    @XmlElement(name = "code-produit", required = true)
    protected String codeProduit;

    /**
     * Obtient la valeur de la propri�t� codeProduit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeProduit() {
        return codeProduit;
    }

    /**
     * D�finit la valeur de la propri�t� codeProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeProduit(String value) {
        this.codeProduit = value;
    }

}
