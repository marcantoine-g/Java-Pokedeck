package app;
import java.util.ArrayList;

public class Paquet {

    private ArrayList<Carte> paquet_carte = new ArrayList<Carte>();

    public Paquet (){
    }

    public void ajout_carte(Carte ma_carte){
        paquet_carte.add(ma_carte);
    }

    public boolean supprimer_carte(int numero){
        for (Carte carte : paquet_carte) {
            if(carte.getNumero() == numero) {
                return paquet_carte.remove(carte);
            }
        }
        return false;
    }

    public int getNbCarte(){
        return paquet_carte.size();
    }

    public ArrayList<Carte> getPaquet_carte() {
        return paquet_carte;
    }

    public String liste_paquet(){
        String str ="Liste des pokémons : \n -------------- \n";
        for (Carte carte : paquet_carte){
            str+=carte.getNom()+"\n";
        }
        return str;
    }

    public Carte getCarte_nom(String nom){
        for (Carte carte : paquet_carte) {
            if(carte.getNom() == nom) {
                return carte;
            }
        }
        return null;      
    }

    public Carte getCarte_numero(int numero){
        for (Carte carte : paquet_carte) {
            if(carte.getNumero() == numero) {
                return carte;
            }
        }
        return null;      
    }


}
