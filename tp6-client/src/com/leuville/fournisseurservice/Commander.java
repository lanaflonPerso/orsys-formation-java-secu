
package com.leuville.fournisseurservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commande">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ligne-produit" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code-produit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "commande"
})
@XmlRootElement(name = "commander")
public class Commander {

    @XmlElement(required = true)
    protected Commander.Commande commande;

    /**
     * Obtient la valeur de la propriété commande.
     * 
     * @return
     *     possible object is
     *     {@link Commander.Commande }
     *     
     */
    public Commander.Commande getCommande() {
        return commande;
    }

    /**
     * Définit la valeur de la propriété commande.
     * 
     * @param value
     *     allowed object is
     *     {@link Commander.Commande }
     *     
     */
    public void setCommande(Commander.Commande value) {
        this.commande = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ligne-produit" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code-produit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "ligneProduit"
    })
    public static class Commande {

        @XmlElement(name = "ligne-produit", required = true)
        protected List<Commander.Commande.LigneProduit> ligneProduit;

        /**
         * Gets the value of the ligneProduit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ligneProduit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLigneProduit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Commander.Commande.LigneProduit }
         * 
         * 
         */
        public List<Commander.Commande.LigneProduit> getLigneProduit() {
            if (ligneProduit == null) {
                ligneProduit = new ArrayList<Commander.Commande.LigneProduit>();
            }
            return this.ligneProduit;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code-produit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "codeProduit",
            "quantite"
        })
        public static class LigneProduit {

            @XmlElement(name = "code-produit", required = true)
            protected String codeProduit;
            protected int quantite;

            /**
             * Obtient la valeur de la propriété codeProduit.
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
             * Définit la valeur de la propriété codeProduit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeProduit(String value) {
                this.codeProduit = value;
            }

            /**
             * Obtient la valeur de la propriété quantite.
             * 
             */
            public int getQuantite() {
                return quantite;
            }

            /**
             * Définit la valeur de la propriété quantite.
             * 
             */
            public void setQuantite(int value) {
                this.quantite = value;
            }

        }

    }

}
