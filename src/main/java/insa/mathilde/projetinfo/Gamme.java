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

}
