/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.mathilde.projetinfo;

/**
 *
 * @author mpommier01
 */
public class Machine extends Equipement {
 private String refMachine;
    private String dmachine;
    private int etat;
    private int disponibilite;
    private int x_pos;
    private int y_pos;
    private float c;
    private int t;

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    public String getRefMachine() {
        return refMachine;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }

    public String getDmachine() {
        return dmachine;
    }

    public void setDmachine(String dmachine) {
        this.dmachine = dmachine;
    }

    public int getX_pos() {
        return x_pos;
    }

    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    
    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }
    
    public void afficheMachine(){
        System.out.println("référence : "+this.refMachine);
        System.out.println("description : "+this.dmachine);
        System.out.println("état : "+this.etat);
        System.out.println("disponibilité : "+this.disponibilite);
        System.out.println("Cette machine se trouve à la position : "+this.x_pos+","+this.y_pos);
        System.out.println("Coût horaire d'utilisation : "+this.c);
        System.out.println("temps d'utilisation : "+this.t);
    }
    
    public void modifierMachine(String refMachine, String dmachine, int etat, int disponibilite, int x_pos, int y_pos, float c, int t){
        this.refMachine = refMachine;
        this.dmachine = dmachine;
        this.etat = etat;
        this.disponibilite = disponibilite;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.c = c;
        this.t = t;
    }
    
    public Machine(String refMachine, String dmachine, int etat, int disponibilite, int x_pos, int y_pos, float c, int t){
        this.refMachine = refMachine;
        this.dmachine = dmachine;
        this.etat = etat;
        this.disponibilite = disponibilite;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.c = c;
        this.t = t;
    }
    
    public Machine(String refMachine, String dmachine){
        this.refMachine = refMachine;
        this.dmachine = dmachine;
        this.etat = 1;
        this.disponibilite = 0;
        this.x_pos = 0;
        this.y_pos = 0;
        this.c = 0;
        this.t = 0;
    }
    public void supprimerMachine(){
        //faire une ArrayList
    }
}
