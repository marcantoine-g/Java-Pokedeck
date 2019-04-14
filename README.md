## ATTENTION ! LA VERSION FINALE EST LA 'app_2/1' ! 


# Java-Pokedeck
Projet "Pokedeck" en JAVA


# Classe présentes et fonctionnalitées : 

Carte.java (abstraite) 
-----------------------

Carte_Pokemon.java (hérite de Carte.java)
-------------------------------------------

  -> Elle permet de créer une carte pokémon selon : son Type, son nom, son numero de carte, son nom d'extension, ses pv, son niveau, sa liste d'attaques.
  -> Elle présente les fonctions nécessaire pour accéder et modifier ces champs.
  
Carte_Energie.java (hérite de Carte.java)
-------------------------------------------

  -> Comme la classe précédente, sans les pv , niveau, et liste d'attaque.

Paquet.java
-------------------------------------------

  -> Elle contient une ArrayList de Carte
  -> Elle présente les fonctions permettant d'ajouter, supprimer, récupérer (selon le nom ou le numéro), et obtenir une liste de carte.
  
Serialisation.java
-------------------------------------------

  -> Elle permet de sauvegarger son paquet dans un fichier "ma_sauvegarde.serial"
  -> Elle permet de récupérer son paquet depuis un fichier "ma_sauvergarde.serial"
 
 Main.java 
 -------------------------------------------
 
  -> Une classe principale permettant de charger le précédent paquet et de lancer un menu
  
  Menu.java
  ------------------------------------------
  
  -> Il permet de faire un choix parmit 7 possibilitées : 'Afficher la collection' / 'Ajouter une carte' / 'Supprimer une carte' / 'Modifier une carte' / 'Chercher une carte précise' / 'Sauvegarder' / 'Charger' / 'Quitter' .
  
 
