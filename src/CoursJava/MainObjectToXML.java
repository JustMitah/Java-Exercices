/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import jakarta.xml.bind.*;
/**
 *
 * @author Kazwell
 */
public class MainObjectToXML {

   public static void marshal() throws JAXBException, IOException {
	    Livre book = new Livre();
	    book.setId(1L);
	    book.settitre("FES A FES");
	    book.setauthor("Hatim");
	    book.setDate(new Date()); 
	    JAXBContext context = JAXBContext.newInstance(Livre.class);
            Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    mar.marshal(book, new File("./livre.xml"));
	}
    public static void main(String[] args) throws JAXBException, IOException {
            marshal();
    }
}
