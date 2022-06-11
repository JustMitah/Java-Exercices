/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;
import java.util.Date;
import jakarta.xml.bind.annotation.*;
/**
 *
 * @author Kazwell
 */
@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "titre", "date","author" })
// @XmlAccessorType(XmlAccessType.FIELD)   avec @XmlTransient pour les attribu
public class Livre {
    private Long id;
    private String titre;
    private String author;
    private Date date;
    public Livre() {
            super();
    }
    @XmlAttribute
    public Long getId() {
            return id;
    }

    public void setId(Long id) {
            this.id = id;
    }
    public String gettitre() {
            return titre;
    }
    @XmlElement(name = "titre_livre")
    public void settitre(String titre) {
            this.titre = titre;
    }
    public String getauthor() {
            return author;
    }
    //@XmlTransient
    public void setauthor(String author) {
            this.author = author;
    }
    public Date getDate() {
            return date;
    }
    public void setDate(Date date) {
            this.date = date;
    }
}