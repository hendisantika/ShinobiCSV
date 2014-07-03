package com.hendi.tes.shinobi;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Senju Hashirama
 */
public class App {

    public static void main(String[] args) throws Exception {

        // reading data from a csv file and convert to java object  
        System.out.println("Reading data from csv and convert to java object:");
        CsvToJavaObject csvToJavaObject = new CsvToJavaObject();
        List<Shinobi> hasil = csvToJavaObject.convertCsvToJava();
        
        ShinobiGroup grp = new ShinobiGroup();
        grp.setShinobis(hasil);
        
        File file = new File("target/hasil.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(ShinobiGroup.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // writing to a file
        jaxbMarshaller.marshal(grp, file);
        // writing to console
        jaxbMarshaller.marshal(grp, System.out);
    }

}
