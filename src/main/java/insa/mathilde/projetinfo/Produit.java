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
public class Produit {
    private int codeProduit ; 
    private String dproduit ; 
    private ArrayList<Produit> listProduit ;
    
    public Produit(int codeProduit, String dproduit, ArrayList listProduit) {
        this.codeProduit = codeProduit ;
        this.dproduit = dproduit ;
        this.listProduit = new ArrayList() ;
        
    }  
    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDproduit() {
        return dproduit;
    }

    public void setDproduit(String dproduit) {
        this.dproduit = dproduit;
    }
    
    public void afficheProduit() {
        System.out.println("le code du produit est "+this.codeProduit) ;
        System.out.println("la désignation du produit est "+this.dproduit) ;
    }
    
    public void modifierProduit(int codeProduit, String dproduit) {
        this.codeProduit = codeProduit ;
        this.dproduit = dproduit ;
    }
    
    public void supprimerProduit(String dproduit, int codeProduit){
        
    }
}
