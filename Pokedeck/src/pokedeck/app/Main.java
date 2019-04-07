package app;
class Main {
    public static void main(String[] args) {

        String [] attaque = {"foudre", "vive attaque"};
        Carte carte1 = new Carte_Pokemon("Feu", "Pikafeu", 1, "Argent", 200, "1", attaque);
        Carte carte2 = new Carte_Pokemon("Electrique", "Pikachu", 3, "Bronze", 300, "3", attaque);

        System.out.println(carte1.getType());
        System.out.println(carte2.getType());

        Paquet paquet = new Paquet();
        paquet.ajout_carte(carte1);
        paquet.ajout_carte(carte2);

        System.out.println(paquet.getNbCarte());
        System.out.println(paquet.getNbCarte());

        carte1.setDescription("super pokemonstre");
        System.out.println(carte1.getDescription());

        System.out.println(paquet.liste_paquet());

        Sauvegarde save = new Sauvegarde();
        save.sauvegarder_paquet(paquet);
        // paquet = save.charger_paquet();

        // System.out.println(paquet.getCarte_nom("Pikafeu").getDescription());
    }

}