/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hendi.tes.ba;

import com.hendi.tes.shinobi.Shinobi;
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
       con.printShinobiList(shinobiList);
        
        Shinobi shinobi = new Shinobi();
        shinobi.setID("1");
        shinobi.setNama("Uzumaki Naruto");
        shinobi.setLevel("Genin");
        shinobi.setJutsu("Rasengan");
        shinobi.setDesa("Konohagakure");
        
            
            File file = new File("E:OutputFile2.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Shinobi.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // writing to a file
            jaxbMarshaller.marshal(shinobi, file);
            // writing to console
            jaxbMarshaller.marshal(shinobi, System.out);
 
            
 }
        
    }
    
    public static void main(String args[]) throws IOException, JAXBException{
        ObjectToXML objectToXML = new ObjectToXML();
        objectToXML.ObjectToXML();
    }
    
    
}
