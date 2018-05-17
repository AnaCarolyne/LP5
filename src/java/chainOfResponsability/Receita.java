/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsability;

/**
 *
 * @author anacarolyne.franca
 */
public class Receita {
    
    private TipoReceita tipoReceita;
     
     public Receita (TipoReceita tipoReceita){
         this.tipoReceita=tipoReceita;
        
    }

    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
     
}


