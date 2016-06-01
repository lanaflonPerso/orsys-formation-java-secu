
package com.leuville.fournisseurservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.leuville.fournisseurservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.leuville.fournisseurservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Commander }
     * 
     */
    public Commander createCommander() {
        return new Commander();
    }

    /**
     * Create an instance of {@link Commander.Commande }
     * 
     */
    public Commander.Commande createCommanderCommande() {
        return new Commander.Commande();
    }

    /**
     * Create an instance of {@link GetPrix }
     * 
     */
    public GetPrix createGetPrix() {
        return new GetPrix();
    }

    /**
     * Create an instance of {@link CommanderResponse }
     * 
     */
    public CommanderResponse createCommanderResponse() {
        return new CommanderResponse();
    }

    /**
     * Create an instance of {@link GetPrixResponse }
     * 
     */
    public GetPrixResponse createGetPrixResponse() {
        return new GetPrixResponse();
    }

    /**
     * Create an instance of {@link Commander.Commande.LigneProduit }
     * 
     */
    public Commander.Commande.LigneProduit createCommanderCommandeLigneProduit() {
        return new Commander.Commande.LigneProduit();
    }

}
