
package com.leuville.fournisseurservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="commanderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "commanderResult"
})
@XmlRootElement(name = "commanderResponse")
public class CommanderResponse {

    protected boolean commanderResult;

    /**
     * Obtient la valeur de la propri�t� commanderResult.
     * 
     */
    public boolean isCommanderResult() {
        return commanderResult;
    }

    /**
     * D�finit la valeur de la propri�t� commanderResult.
     * 
     */
    public void setCommanderResult(boolean value) {
        this.commanderResult = value;
    }

}
