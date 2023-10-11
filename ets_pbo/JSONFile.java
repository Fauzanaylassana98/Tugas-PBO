package com.mycompany.ets_pbo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class JSONFile {
    private String jsonFilePath;
    
    public JSONFile(String link) {
        this.jsonFilePath = link; // Ganti dengan path file JSON Anda
    }
    
    public void ReadJSONFile (){
        try (BufferedReader br = new BufferedReader(new FileReader(this.jsonFilePath)) ) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            // Sekarang Anda memiliki JSON sebagai string, Anda dapat memprosesnya sesuai kebutuhan
            String jsonString = jsonContent.toString();
            System.out.println("JSON Content: " + jsonString);

            // Di sini, Anda dapat mengurai JSON string secara manual sesuai dengan strukturnya.
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
