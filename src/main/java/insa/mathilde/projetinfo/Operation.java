/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.mathilde.projetinfo;

/**
 *
 * @author mpommier01
 */
public class Operation {
    private String idOperation;
    private String dOperation;
    private String refEquipement;
    private float dureeOperation;

    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    public String getRefEquipement() {
        return refEquipement;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public float getDureeOperation() {
        return dureeOperation;
    }

    public void setDureeOperation(float dureeOperation) {
        this.dureeOperation = dureeOperation;
    }

    public String getdOperation() {
        return dOperation;
    }

    public void setdOperation(String dOperation) {
        this.dOperation = dOperation;
    }
    
    public Operation (String idOperation, String dOperation, String refEquipement, float dureeOp){
        this.idOperation = idOperation;
        this.dOperation = dOperation;
        this.refEquipement = refEquipement;
        this.dureeOperation = dureeOp;
    }
}
// j'ai enlevé le refmachine car il est compris dans le refequipement
