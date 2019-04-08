package pokedeck_v2.app;
public class Carte_Pokemon extends Carte{

    private int pv;
    private String niveau;
    private String [] attaque;
    // CHANGER LE TYPE EN ARRAY ? VOIR POUR TABLEAU DE TABLEAU

    public Carte_Pokemon(String type, String nom, int numero, String extension, int pv, String niveau, String [] attaque){
        super(type, nom, numero, extension);
        this.pv       = pv;
        this.niveau   = niveau;
        this.attaque = attaque;
    }

    public int getPv() {
        return pv;
    }

    public String getNiveau() {
        return niveau;
    }

    public String[] getAttaque() {
        return attaque;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setAttaque(String[] attaque) {
        this.attaque = attaque;
    }
}

