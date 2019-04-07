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
  
Sauvergarde.java
-------------------------------------------

  -> Elle permet de sauvegarger son paquet dans un fichier "ma_sauvegarde.json"
  -> La fonction de réupération de ce paquet ne fonctionne pas 
 
 Main.java 
 -------------------------------------------
 
  -> Une classe principale
