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
    private String name;
    private String idGamme;
    private String refGamme;
    private ArrayList<Equipement> listEquipement;
    private ArrayList<Operation> listOp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    
    public static void creerGamme(){
        
    }
//Classe Gamme de fabrication définie par: - une référence refGamme, (String) - une liste d’opérations nécessaires listeOperations - une liste d’équipements nécessaires listeEquipements, (machines ou 
//postes).  - les méthodes de gestion de gammes suivantes : 
//o creerGamme () ; 
//o modifierGamme() ; 
//o supprimerGamme() ; 
//o afficheGamme() : permet d’afficher la liste des équipements de 
//travail utilisés pour réaliser une gamme de fabrication; - Les méthodes de calcul suivantes : 
//o coutGamme(), (retourne le coût d’une gamme donnée (float)  
//o dureeGamme (), (calcule la durée d’exécution d’une gamme (float).
    
 /* gamme = agrégation d'operation : d'une liste d'opértions, arraylist (chaque opération a un nom)
    et liste de machine m1, m2 ect... chacune associée à une durée, et uun coup horaire
    chaque opération est produite sur une machine
    Manière dont le produit est fabriqué
    */
}
