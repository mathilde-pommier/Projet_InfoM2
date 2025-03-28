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
public class Poste extends Equipement {
    private int refPoste;
    private String dPoste;
    private ArrayList<Machine> listMachine;
    
    public void affichePoste(Poste poste){
        System.out.println("Le poste est"+poste);
    }
    public void modifierPoste(Poste poste){
        
    }
    
    // Méthode pour ajouter une machine au poste de travail
    public void ajouterMachine(Machine machine) {
        if (machine != null && !listMachine.contains(machine)) {
            listMachine.add(machine);
            System.out.println("Machine ajoutée avec succès.");
        } else {
            System.out.println("La machine est déjà présente ou invalide.");
        }
    }

    // Méthode pour supprimer une machine du poste de travail
    public void supprimerMachine(Machine machine) {
        if (listMachine.contains(machine)) {
            listMachine.remove(machine);
            System.out.println("Machine supprimée avec succès.");
        } else {
            System.out.println("La machine n'est pas présente dans la liste.");
        }
    }

    // Méthode pour modifier la composition du poste (ajouter ou supprimer des machines)
    public void modifierPoste(Machine machine, boolean ajouter) {
        if (ajouter) {
            ajouterMachine(machine);
        } else {
            supprimerMachine(machine);
        }
    }
}
