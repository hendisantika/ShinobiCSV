package com.hendi.tes.shinobi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Senju Hashirama
 */
public class CsvToJavaObject {

    public void convertCsvToJava() {
        String csvFileToRead = "CsvFiles/csvToRead2.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        List<Shinobi> shinobiList = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                // split on comma(',')  
                String[] shinobi = line.split(splitBy);

                // create car object to store values  
                Shinobi shiObject = new Shinobi();

                // add values from csv to car object  
                shiObject.setID(shinobi[0]);
                shiObject.setNama(shinobi[1]);
                shiObject.setLevel(shinobi[2]);
                shiObject.setJutsu(shinobi[3]);
                shiObject.setDesa(shinobi[4]);

                // adding car objects to a list  
                shinobiList.add(shiObject);

            }
            // print values stored in carList  
            printShinobiList(shinobiList);

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }

    }
    
    public void printShinobiList(List<Shinobi> shinobiListToPrint) {
        for (int i = 0; i < shinobiListToPrint.size(); i++) {
            System.out.println("SHINOBIS [ID = " + shinobiListToPrint.get(i).getID()
                    + ", Nama = " + shinobiListToPrint.get(i).getNama()
                    + ", Level = " + shinobiListToPrint.get(i).getLevel()
                    + ", Jutsu = "
                    + shinobiListToPrint.get(i).getJutsu() + ", Desa = "
                    + shinobiListToPrint.get(i).getDesa() + "]");
        }
    }

}
