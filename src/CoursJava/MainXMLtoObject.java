/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;
import java.io.FileReader;
import java.io.IOException;

import jakarta.xml.bind.*;
/**
 *
 * @author Kazwell
 */
public class MainXMLtoObject {
    
	public static Livre unmarshall() throws JAXBException, IOException {
	    JAXBContext context = JAXBContext.newInstance(Livre.class);
	    return (Livre) context.createUnmarshaller().unmarshal(new FileReader("./livre.xml"));
	}
	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		Livre test=unmarshall();
		System.out.println(test.getId());
		System.out.println(test.gettitre());
		System.out.println(test.getauthor());
		System.out.println(test.getDate());
	}
}
