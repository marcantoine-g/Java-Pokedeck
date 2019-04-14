package Pokedeck_V2.app;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Paquet paquet = new Paquet();
    private int num;
    private String nom ="";
    private String type ="";
    private int numero_carte = 0;
    private String extention ="";
    private int pv = 0;
    private String niveau ="";
    private String [] attaques = new String [42];
    private String description = "";
    private Carte c;
    private String chemin="";
    private Serialisation s;
    
    public Menu (Paquet p){
        this.paquet = p;
        // this.lancer_menu();
    }
    
    public void implementer_paquet(Paquet p){
        this.paquet = p;
    }
    
    public void lancer_menu(){
        do 
        {
            System.out.println("MENU :\n----------------------- ");
            System.out.println("Faites votre choix entre ces différentes options :\n");
            System.out.println("0 -> Afficher la collection de carte\n");
            System.out.println("1 -> Ajouter une carte\n");
            System.out.println("2 -> Supprimer une carte\n");
            System.out.println("3 -> Modifier une carte\n");
            System.out.println("4 -> Chercher une carte précise\n");
            System.out.println("5 -> Sauvegarder votre collection\n");
            System.out.println("6 -> Charger votre collection\n");
            System.out.println("7 -> Quitter\n");
            num = Integer.parseInt(scanner.nextLine());
                switch(num) {
                    case 0:
                        System.out.println("\n Affichage de votre collection : \n");
                        for (Carte c: paquet.getPaquet_carte()){
                            System.out.println(c.getNom()+"\n");
                        };
                        break;
                    case 1:
                        System.out.println("1 -> Carte Pokémon\n");
                        System.out.println("2 -> Carte Energie\n");
                        num = Integer.parseInt(scanner.nextLine());
                        
                        if(num == 1){
                            System.out.println("Entrer le nom de la carte\n");
                            nom = scanner.nextLine();
                            System.out.println("Entrer son type\n");
                            type = scanner.nextLine();
                            System.out.println("Entrer son numéro\n");
                            numero_carte = Integer.parseInt(scanner.nextLine());
                            System.out.println("Entrer son extention\n");
                            extention = scanner.nextLine();
                            System.out.println("Entrer son montant de point de vie\n");
                            pv = Integer.parseInt(scanner.nextLine());
                            System.out.println("Entrer son niveau\n");
                            niveau = scanner.nextLine();
                            System.out.println("Entrer ses attaques\n");
                            attaques[0] = (scanner.nextLine());
                            
                            Carte c_p = new Carte_Pokemon(type, nom, numero_carte, extention, pv, niveau, attaques);
                            paquet.ajout_carte(c_p);
                        }
                        
                        if(num == 2){
                            System.out.println("Entrer son type\n");
                            type = scanner.nextLine();
                            System.out.println("Entrer son numéro\n");
                            numero_carte = Integer.parseInt(scanner.nextLine());
                            System.out.println("Entrer son extention\n");
                            extention = scanner.nextLine();
                            
                            Carte_Energie c_e = new Carte_Energie(type, numero_carte, extention);
                            paquet.ajout_carte(c_e);
                            
                        }
                        else { break; }
                        break;
                        
                    case 2:
                        System.out.println("Entrer le numéro de la carte à supprimer\n");
                        numero_carte = Integer.parseInt(scanner.nextLine());
                        if (!paquet.supprimer_carte(numero_carte)){
                            System.out.println("La carte n'a pas été trouvée\n");
                            break;
                        }
                        break;
                        
                    case 3:
                        System.out.println("Modifier par nom ou numéro ?\n 1 -> Nom \n 2 -> Numéro");
                        String num_nom = scanner.nextLine();
                        if (num_nom.equals("1")){ 
                            System.out.println("Entrez le nom de la carte à modifier");
                            nom = scanner.nextLine();
                            c = paquet.getCarte_nom(nom);
                        }
                        if (num_nom.equals("2")){
                            System.out.println("Entrez le numéro de la carte à modifier");
                            numero_carte = Integer.parseInt(scanner.nextLine());
                            c = paquet.getCarte_numero(numero_carte);
                        }
                        else {break;}
                        
                        System.out.println("Choisissez les informations à modifier:\n");
                        System.out.println("1 -> Nom\n");
                        System.out.println("2 -> Type\n");
                        System.out.println("3 -> Extention\n");
                        System.out.println("4 -> Numéro\n");
                        System.out.println("5 -> Description\n");

                        num = Integer.parseInt(scanner.nextLine());
                        
                        switch (num){
                            case 1:
                                nom = scanner.nextLine();
                                c.setNom(nom);
                                break;
                            case 2:
                                type = scanner.nextLine();
                                c.setType(type);
                                break;
                            case 3:
                                extention = scanner.nextLine();
                                c.setExtension(extention);
                                break;
                            case 4:
                                numero_carte = Integer.parseInt(scanner.nextLine());
                                c.setNumero(numero_carte);
                                break;
                            case 5:
                                description = scanner.nextLine();
                                c.setDescription(description);
                                break;                            
                        }
                        break;
                                
                    case 4:
                        System.out.println("Chercher par : \n 1 -> Nom \n 2 -> numéro\n");
                        num_nom = scanner.nextLine();
                        if (num_nom.equals("1")){ 
                            System.out.println("Entrez le nom de la carte à modifier");
                            nom = scanner.nextLine();
                            c = paquet.getCarte_nom(nom);
                            System.out.println(c.getNom());
                        }
                        if (num_nom.equals("2")){
                            System.out.println("Entrez le numéro de la carte à modifier");
                            numero_carte = Integer.parseInt(scanner.nextLine());
                            c = paquet.getCarte_numero(numero_carte);
                            System.out.println(c.getNom());
                        }
                        else {break;}
                        break;
                        
                    case 5:
                        System.out.println("Spécifiez un chemin valide pour sauvegarder votre collection\n");
                        chemin = scanner.nextLine();
                        s = new Serialisation();
                        s.sauvegarder_paquet(paquet, chemin);
                        break;
                        
                    case 6:
                        System.out.println("Spécifiez un chemin valide pour charger votre collection précédemment sauvegardée\n");
                        chemin = scanner.nextLine();
                        s = new Serialisation();
                        this.paquet = s.charger_paquet(chemin);
                        break;
                        
                    case 7:
                        System.out.println("Aurevoir ! \n");
                        return;
                }
        } while (num!=7);
    }
    
    
}
