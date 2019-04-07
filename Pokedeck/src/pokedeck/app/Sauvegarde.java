package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

public class Sauvegarde {
    
    public void sauvegarder_paquet(Paquet paquet){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("ma_sauvegarde.json")) {
            gson.toJson(paquet, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Paquet charger_paquet(){
        Gson gson = new Gson();
        Paquet paquet = null;
        try (Reader reader = new FileReader("ma_sauvegarde.json")) {
            paquet = gson.fromJson(reader, Paquet.class);
            System.out.println(paquet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paquet;
    }
    
}