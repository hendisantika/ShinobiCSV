package com.hendi.tes.shinobi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Senju Hashirama
 */
public class ReadCsv {

    /**
     */
        // TODO code application logic here
    public void readCsv() throws IOException {
        String csvFileToRead = "src/main/resources/csvToRead2.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                String[] shinobi = line.split(splitBy);
                System.out.println("SHINOBI [ID =" + shinobi[0] + " , Nama ="
                        + shinobi[1] + " , Level =" + shinobi[2] + " , Jutsu ="
                        + shinobi[3] + " , Desa =" + shinobi[4] + "]");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done with reading CSV");
    }
}

