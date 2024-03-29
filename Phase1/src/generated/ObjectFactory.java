
package generated;

import javax.xml.bind.annotation.XmlRegistry;
import generated.Rezept.Bild;
import generated.Rezept.Kommentare;
import generated.Rezept.Kommentare.Kommentar;
import generated.Rezept.Portionen;
import generated.Rezept.Zubereitung;
import generated.Rezept.Zutaten;
import generated.Rezept.Zutaten.Zutat;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Zutaten }
     * 
     */
    public Zutaten createRezeptZutaten() {
        return new Zutaten();
    }

    /**
     * Create an instance of {@link Rezept }
     * 
     */
    public Rezept createRezept() {
        return new Rezept();
    }

    /**
     * Create an instance of {@link Kommentar }
     * 
     */
    public Kommentar createRezeptKommentareKommentar() {
        return new Kommentar();
    }

    /**
     * Create an instance of {@link Zutat }
     * 
     */
    public Zutat createRezeptZutatenZutat() {
        return new Zutat();
    }

    /**
     * Create an instance of {@link Kommentare }
     * 
     */
    public Kommentare createRezeptKommentare() {
        return new Kommentare();
    }

    /**
     * Create an instance of {@link Portionen }
     * 
     */
    public Portionen createRezeptPortionen() {
        return new Portionen();
    }

    /**
     * Create an instance of {@link Bild }
     * 
     */
    public Bild createRezeptBild() {
        return new Bild();
    }

    /**
     * Create an instance of {@link Zubereitung }
     * 
     */
    public Zubereitung createRezeptZubereitung() {
        return new Zubereitung();
    }

}