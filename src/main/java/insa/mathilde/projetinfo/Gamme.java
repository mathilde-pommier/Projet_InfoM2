/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.mathilde.projetinfo;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Scanner;
/**
 *
 * @author mpommier01
 */
public class Gamme {
    public int i;
    private int ask_op;
    private Operation enter_op;
    private Equipement enter_equip;
    private int size_listOp;
    private float d_op;
    private float duree_gamme;
    private String idGamme;
    private String refGamme;
    private ArrayList<Equipement> listEquipement;
    private ArrayList<Operation> listOp;
    private HashMap<Operation,Equipement> gamme_op;

   // Scanner scanner_op = new Scanner(System.in); tests pour lire une varaible de la classe operation
    //Scanner scanner_equipement = new Scanner(System.in); tests pour lire une varaible de la classe equipement

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

    public HashMap<Operation, Equipement> getGamme_op() {
        return gamme_op;
    }

    public void setGamme_op(HashMap<Operation, Equipement> gamme_op) {
        this.gamme_op = gamme_op;
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
        while (ask_op!=0){
            System.out.println("Entrez 1 ou entrez 0 si vous n'avez plus d'opération à ajouter :");
            ask_op = Lire.i();
            if (ask_op !=0){
                System.out.println("Entrez l'opération que vous souhaitez ajouter à votre gamme :");
                enter_op = Lire.Operation();// probleme : lire une variable de la classe Operation
                this.listOp.add(enter_op);
                System.out.println("Entrez l'équipement que vous utiliserez pour cette opération :");
                enter_equip = Lire.Equipement();//probleme lire une variable de la classe Equipement 
                this.listEquipement.add(enter_equip);
                this.gamme_op.put(enter_op,enter_equip);
            }
        }   
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
    
    public void dureeGamme(){ //c'est la somme de toutes les durées d'opération
        size_listOp=this.listOp.size();
        for (i=0, i<=size_listOp,i++){
            d_op = getDureeOperation(this.listOp.get(i));
            this.duree_gamme=d_op+this.duree_gamme;   
        }
                
    /*this.listOp.forEach( this.duree_gamme = getDureeOperation(this.listOp.get()) + this.duree_gamme); essai en expression lambda mais pas réussi*/
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
