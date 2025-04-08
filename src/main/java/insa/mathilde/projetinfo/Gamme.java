/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.mathilde.projetinfo;
import java.util.ArrayList;
/**
 *
 * @author mpommier01
 */
public class Gamme {
    private String idGamme;
    private String refGamme;
    private ArrayList<Equipement> listEquipement;
    private ArrayList<Operation> listOp;

    public String getIdGamme() {
        return idGamme;
    }

    public void setIdGamme(String idGamme) {
        this.idGamme = idGamme;
    }

    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public ArrayList<Equipement> getListEquipement() {
        return listEquipement;
    }

    public void setListEquipement(ArrayList<Equipement> listEquipement) {
        this.listEquipement = listEquipement;
    }

    public ArrayList<Operation> getListOp() {
        return listOp;
    }

    public void setListOp(ArrayList<Operation> listOp) {
        this.listOp = listOp;
    }

    public Gamme(Produit prod, String idGamme, String refGamme){
        this.idGamme = idGamme;
        this.refGamme = refGamme;
        // this.listEquipement=; il faut trouver comment initialiser la liste de la classe mais en la mettant vide
        //this.listOp=[]; de même pour celle ci
        System.out.println("La nouvelle gamme a été créée avec succès !");
    }
    public void creerGamme(Produit prod){
        System.out.println("Vous allez pouvoir créer une nouvelle gamme pour la fabrication de :"+prod);
        System.out.println("Entrez le nom de l'opération ou entrez 0 si vous n'avez plus d'opération à ajouter :");
        
    }
    public void afficheGamme(){
        System.out.println("La référence de la gamme est : "+this.refGamme);
        System.out.println("Le code d'identification de cette gamme est : "+this.idGamme);
        System.out.println("Pour réaliser cette gamme les équipements suivant sont utilisés : "+this.getListEquipement());
    }
    public void ajouterOp (Operation op){
        if (op!=null && this.listOp.contains(op)!=true){
            this.listOp.add(op);
        }
    }
    public void ajouterEquipement(Equipement equipement){
        if (equipement!=null && this.listEquipement.contains(equipement)!=true){
            this.listEquipement.add(equipement);
        }
    }
            
    public void modifierGamme(Equipement equip, Operation op,boolean operation, boolean equipement){
        if (operation==true){
            ajouterOp(op);
        }
        if (equipement==true){
            ajouterEquipement(equip);
        }
    }  
    public void supprimerGamme(){
       // même problème que pour supprimerMachine() dans la classe machine et que supprimerPoste() dans la classe poste
    }
}
    
/*Classe Gamme de fabrication définie par: - une référence refGamme, (String) - une liste d’opérations nécessaires listeOperations - une liste d’équipements nécessaires listeEquipements, (machines ou 
postes).  - les méthodes de gestion de gammes suivantes : 
o creerGamme () ; 
o modifierGamme() ; 
o supprimerGamme() ; 
o afficheGamme() : permet d’afficher la liste des équipements de 
travail utilisés pour réaliser une gamme de fabrication; - Les méthodes de calcul suivantes : 
o coutGamme(), (retourne le coût d’une gamme donnée (float)  
o dureeGamme (), (calcule la durée d’exécution d’une gamme (float).*/
    
 /* gamme = agrégation d'operation : d'une liste d'opértions, arraylist (chaque opération a un nom)
    et liste de machine m1, m2 ect... chacune associée à une durée, et uun coup horaire
    chaque opération est produite sur une machine
    Manière dont le produit est fabriqué
    */
