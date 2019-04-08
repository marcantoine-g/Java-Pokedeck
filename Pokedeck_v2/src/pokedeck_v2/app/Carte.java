package app;

public abstract class Carte{

    private String nom;
    private String type;
    private String extension;
    private int numero;
    private String description;

    public Carte(String type, String nom, int numero, String extension) {
        this.type = type;
        this.nom = nom;
        this.numero = numero;
        this.extension = extension;
    }

    public String getNom() {
        return this.nom;
    }

    public String getType() {
        return type;
    }

    public String getExtension() {
        return extension;
    }

    public int getNumero() {
        return numero;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

}


  