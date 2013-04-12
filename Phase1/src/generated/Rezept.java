
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import generated.Rezept.Bild;
import generated.Rezept.Kommentare;
import generated.Rezept.Kommentare.Kommentar;
import generated.Rezept.Portionen;
import generated.Rezept.Zubereitung;
import generated.Rezept.Zutaten;
import generated.Rezept.Zutaten.Zutat;


/**
 * <p>Java class for rezept element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="rezept">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="bild">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="zutaten">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="zutat" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                             &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="portionen">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="anzahl" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="zubereitung">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="kommentare">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="kommentar" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="autor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                             &lt;attribute name="zeit" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titel",
    "bild",
    "zutaten",
    "portionen",
    "zubereitung",
    "kommentare"
})
@XmlRootElement(name = "rezept")
public class Rezept {

    @XmlElement(required = true)
    protected String titel;
    @XmlElement(required = true)
    protected Bild bild;
    @XmlElement(required = true)
    protected Zutaten zutaten;
    @XmlElement(required = true)
    protected Portionen portionen;
    @XmlElement(required = true)
    protected Zubereitung zubereitung;
    @XmlElement(required = true)
    protected Kommentare kommentare;

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the bild property.
     * 
     * @return
     *     possible object is
     *     {@link Bild }
     *     
     */
    public Bild getBild() {
        return bild;
    }

    /**
     * Sets the value of the bild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bild }
     *     
     */
    public void setBild(Bild value) {
        this.bild = value;
    }

    /**
     * Gets the value of the zutaten property.
     * 
     * @return
     *     possible object is
     *     {@link Zutaten }
     *     
     */
    public Zutaten getZutaten() {
        return zutaten;
    }

    /**
     * Sets the value of the zutaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zutaten }
     *     
     */
    public void setZutaten(Zutaten value) {
        this.zutaten = value;
    }

    /**
     * Gets the value of the portionen property.
     * 
     * @return
     *     possible object is
     *     {@link Portionen }
     *     
     */
    public Portionen getPortionen() {
        return portionen;
    }

    /**
     * Sets the value of the portionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portionen }
     *     
     */
    public void setPortionen(Portionen value) {
        this.portionen = value;
    }

    /**
     * Gets the value of the zubereitung property.
     * 
     * @return
     *     possible object is
     *     {@link Zubereitung }
     *     
     */
    public Zubereitung getZubereitung() {
        return zubereitung;
    }

    /**
     * Sets the value of the zubereitung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zubereitung }
     *     
     */
    public void setZubereitung(Zubereitung value) {
        this.zubereitung = value;
    }

    /**
     * Gets the value of the kommentare property.
     * 
     * @return
     *     possible object is
     *     {@link Kommentare }
     *     
     */
    public Kommentare getKommentare() {
        return kommentare;
    }

    /**
     * Sets the value of the kommentare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kommentare }
     *     
     */
    public void setKommentare(Kommentare value) {
        this.kommentare = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Bild {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected String url;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="kommentar" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="autor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="zeit" type="{http://www.w3.org/2001/XMLSchema}time" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "kommentar"
    })
    public static class Kommentare {

        @XmlElement(required = true)
        protected List<Kommentar> kommentar;

        /**
         * Gets the value of the kommentar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kommentar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKommentar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Kommentar }
         * 
         * 
         */
        public List<Kommentar> getKommentar() {
            if (kommentar == null) {
                kommentar = new ArrayList<Kommentar>();
            }
            return this.kommentar;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="autor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="zeit" type="{http://www.w3.org/2001/XMLSchema}time" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Kommentar {

            @XmlValue
            protected String value;
            @XmlAttribute
            protected String autor;
            @XmlAttribute
            protected XMLGregorianCalendar datum;
            @XmlAttribute
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            protected String id;
            @XmlAttribute
            protected XMLGregorianCalendar zeit;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the autor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutor() {
                return autor;
            }

            /**
             * Sets the value of the autor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutor(String value) {
                this.autor = value;
            }

            /**
             * Gets the value of the datum property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatum() {
                return datum;
            }

            /**
             * Sets the value of the datum property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatum(XMLGregorianCalendar value) {
                this.datum = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the zeit property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getZeit() {
                return zeit;
            }

            /**
             * Sets the value of the zeit property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setZeit(XMLGregorianCalendar value) {
                this.zeit = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="anzahl" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Portionen {

        @XmlAttribute(required = true)
        protected float anzahl;

        /**
         * Gets the value of the anzahl property.
         * 
         */
        public float getAnzahl() {
            return anzahl;
        }

        /**
         * Sets the value of the anzahl property.
         * 
         */
        public void setAnzahl(float value) {
            this.anzahl = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "arbeitszeit",
        "schwierigkeitsgrad",
        "brennwert",
        "beschreibung"
    })
    public static class Zubereitung {

        @XmlElement(required = true)
        protected String arbeitszeit;
        @XmlElement(required = true)
        protected String schwierigkeitsgrad;
        @XmlElement(required = true)
        protected String brennwert;
        @XmlElement(required = true)
        protected String beschreibung;

        /**
         * Gets the value of the arbeitszeit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArbeitszeit() {
            return arbeitszeit;
        }

        /**
         * Sets the value of the arbeitszeit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArbeitszeit(String value) {
            this.arbeitszeit = value;
        }

        /**
         * Gets the value of the schwierigkeitsgrad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchwierigkeitsgrad() {
            return schwierigkeitsgrad;
        }

        /**
         * Sets the value of the schwierigkeitsgrad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchwierigkeitsgrad(String value) {
            this.schwierigkeitsgrad = value;
        }

        /**
         * Gets the value of the brennwert property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrennwert() {
            return brennwert;
        }

        /**
         * Sets the value of the brennwert property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrennwert(String value) {
            this.brennwert = value;
        }

        /**
         * Gets the value of the beschreibung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Sets the value of the beschreibung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zutat" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "zutat"
    })
    public static class Zutaten {

        @XmlElement(required = true)
        protected List<Zutat> zutat;

        /**
         * Gets the value of the zutat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zutat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZutat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Zutat }
         * 
         * 
         */
        public List<Zutat> getZutat() {
            if (zutat == null) {
                zutat = new ArrayList<Zutat>();
            }
            return this.zutat;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Zutat {

            @XmlAttribute
            protected String einheit;
            @XmlAttribute(required = true)
            protected float menge;
            @XmlAttribute(required = true)
            protected String name;

            /**
             * Gets the value of the einheit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEinheit() {
                return einheit;
            }

            /**
             * Sets the value of the einheit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEinheit(String value) {
                this.einheit = value;
            }

            /**
             * Gets the value of the menge property.
             * 
             */
            public float getMenge() {
                return menge;
            }

            /**
             * Sets the value of the menge property.
             * 
             */
            public void setMenge(float value) {
                this.menge = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}