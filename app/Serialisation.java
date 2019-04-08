package pokedeck_v2.app;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
    
    public void sauvegarder_paquet(Paquet paquet){
        try {
            FileOutputStream file_output = new FileOutputStream("C:\\Users\\licence\\Documents\\Marc-Antoine GERARDIN\\JAVA\\Pokedeck\\Java-Pokedeck\\Pokedeck_v2\\src\\pokedeck_v2\\ma_sauvegarde.serial");
            ObjectOutputStream object_output = new ObjectOutputStream(file_output);
            try {
                object_output.writeObject(paquet);
                object_output.flush();
		} finally {
		object_output.close();
		file_output.close();
                }
	}  catch(IOException e) {
            e.printStackTrace();
	}
    }
    
   public Paquet charger_paquet(){
        Paquet paquet = null;
        try {
            FileInputStream file_input = new FileInputStream("C:\\Users\\licence\\Documents\\Marc-Antoine GERARDIN\\JAVA\\Pokedeck\\Java-Pokedeck\\Pokedeck_v2\\src\\pokedeck_v2\\ma_sauvegarde.serial");
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
            return paquet;
            } catch(ClassNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
		e.printStackTrace();
            }
        return paquet;
    }
    
}