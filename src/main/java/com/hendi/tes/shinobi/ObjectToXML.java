package com.hendi.tes.shinobi;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Senju Hashirama
 */
public class ObjectToXML {

    public void ObjectToXML() throws IOException, JAXBException {

        Shinobi shinobi = new Shinobi();
        shinobi.setID("1");
        shinobi.setNama("Uzumaki Naruto");
        shinobi.setLevel("Genin");
        shinobi.setJutsu("Rasengan");
        shinobi.setDesa("Konohagakure");

        File file = new File("target/hasil.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Shinobi.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // writing to a file
        jaxbMarshaller.marshal(shinobi, file);
        // writing to console
        jaxbMarshaller.marshal(shinobi, System.out);

    }

    public static void main(String args[]) throws IOException, JAXBException {
        ObjectToXML objectToXML = new ObjectToXML();
        objectToXML.ObjectToXML();
    }
}
