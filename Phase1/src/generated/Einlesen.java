package generated;
import generated.Rezept.Kommentare.Kommentar;
import generated.Rezept.Zutaten.Zutat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class Einlesen {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Rezept.class);

		/*java.util.Date now = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		String ausgabe = sdf.format(now);
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(now);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		*/


		// Java objekte aus XML erstellen
		Unmarshaller um=context.createUnmarshaller();
		Rezept r=(Rezept) um.unmarshal(new FileInputStream("src/Aufgabe3Rezept.xml"));

		Scanner in= new Scanner(System.in);

		System.out.println("Zum ausgeben 1 drücken, neuer Kommentar mit 2");
		int a=in.nextInt();
		String nameAutor="";
		String eingegebenerKommentar="";

		//Mögl. 1: Ausgabe des Rezeptes
		if (a==1)
				{
			for (Zutat z:r.getZutaten().getZutat()){

				System.out.println(z.getMenge()+" "+z.getEinheit()+" "+z.getName());
			}

			System.out.println("für "+r.getPortionen().getAnzahl()+" Portionen");
			System.out.println("Arbeitszeit"+r.getZubereitung().getArbeitszeit());
			System.out.println("Schwierigkeitsgrad "+r.getZubereitung().getSchwierigkeitsgrad());
			System.out.println("Brennwert: "+r.getZubereitung().getBrennwert());
			System.out.println(r.getZubereitung().getBeschreibung());


			for(Kommentar k:r.getKommentare().getKommentar()){
				System.out.println(k.getAutor());
				System.out.println(k.getId());
				System.out.println(k.getDatum());
				System.out.println(k.getZeit());
				System.out.println(k.getValue());
					}
			}

		//Mögl. 2: Hinzufügen eines Kommentars
		else if (a==2){
			System.out.println("geben Sie ihren Namen ein:");
			nameAutor=in.next()+in.nextLine();
			System.out.println("geben Sie ihren den Kommentar ein:");
			eingegebenerKommentar=in.next()+in.nextLine();

			Date now = new Date();
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(now);                                        // aktuelle Zeit und Datum als XML Calendar
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c); 
			//neuen Kommentar erstellen
			Kommentar k = new Kommentar();

			k.setAutor(nameAutor);
			k.setDatum(date2);		
			k.setId((new Integer((int)(Math.random()*42*42))).toString());
			//k.setZeit(r.getKommentare().getKommentar().get(0).getZeit());
			k.setValue(eingegebenerKommentar);

			r.getKommentare().getKommentar().add(k);
		}
		else {
			System.out.println("Fehler!");
			return;
		}



		//Speichern in XML
		Marshaller ma=context.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ma.marshal(r, new FileOutputStream("src/Aufgabe3Rezept.xml"));

	}

}