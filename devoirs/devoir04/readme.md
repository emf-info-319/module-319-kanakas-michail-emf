# Devoir04 – Date valable ?
## Objectifs
Révision des concepts vus en classe et identification des sujets pas compris. Réflexion algorithmique et mise en pratique des tests, switch, expressions et variables.

## Travail à réaliser
* Faites un nouveau programme Java dans le dossier `devoir04` nommé `devoir04`.
* Votre programme va commencer par déclarer 3 variables entières year, month et day.
* Donnez à ces 3 variables la date du jour.
* Votre programme va interpréter ces 3 variables year, month et day pour :
  * vérifier quelles respectent bien les limites prescrites (voir indications ci-dessous)
  * afficher une date plus lisible pour l’utilisateur (le mois en texte)
N’utilisez que des instructions « if », « else », « switch », « case », « default », « break », « sout » et variables et expressions pour résoudre cet exercice !

* Limites prescrites pour la date
  * L’année doit être entre 0 et 9999 compris
  * Le mois doit être un mois valable
  * Le jour doit être un jour valable (pensez aux mois qui ont 31 jours, ceux à 30 jours et ceux à 28 ou 29 jours !)

  ## Exemple d'affichage souhaité
```
  date entrée est le 12.9.2014
  La date formatée est le 12 septembre 2014
```
```
La date entrée est le 12.9.-400
L'année [-400] est hors limites !
```
```
La date entrée est le 32.9.2014
Le jour [32] est hors limites !
```
```
La date entrée est le 29.2.2014
Le jour [29] est hors limites !
```
```
La date entrée est le 29.2.2012
La date formatée est le 29 février 2012
```
```
La date entrée est le 31.4.2012
Le jour [31] est hors limites
```

## Restitution du devoir
Faites un commit/push avant la date limite fixée par votre enseignant.
package DEVOIR04.readme
public class readme
public static void main(String[] args) {
  System.out.println("coucou")
}
