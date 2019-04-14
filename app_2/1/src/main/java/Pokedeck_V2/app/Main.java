package Pokedeck_V2.app;
class Main {

    public static void main(String[] args) {

          Serialisation save = new Serialisation();
          paquet = save.charger_paquet("ma_sauvegarde.serial");
          Menu menu = new Menu(paquet);
          menu.implementer_paquet(paquet);
          menu.lancer_menu();    
    }

}
