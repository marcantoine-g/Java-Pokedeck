package Pokedeck_V2.app;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
    
    public void sauvegarder_paquet(Paquet paquet, String chemin){
        try {
            FileOutputStream file_output = new FileOutputStream(chemin);
            ObjectOutputStream object_output = new ObjectOutputStream(file_output);
            try {
                object_output.writeObject(paquet);
                object_output.flush();
		} finally {
		object_output.close();
        file_output.close();
        System.out.println("\nPaquet Sauvegardé\n");
        }
	}  catch(IOException e) {
            e.printStackTrace();
	}
    }
    
   public Paquet charger_paquet(String chemin){
        Paquet paquet = null;
        try {
            FileInputStream file_input = new FileInputStream(chemin);
            ObjectInputStream object_input = new ObjectInputStream(file_input);
            try {
		        paquet = (Paquet) object_input.readObject();
            } finally {
                try {
			object_input.close();
                } finally {
			file_input.close();
                }
            }
            System.out.println("\nPaquet Chargé\n");
            return paquet;
            } catch(ClassNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
		e.printStackTrace();
            }
        return paquet;
    }
    
}