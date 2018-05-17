/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import chainOfResponsability.Receita;
import java.util.ArrayList;

/**
 *
 * @author anacarolyne.franca
 */

   public abstract class Medico {
    protected ArrayList listaDocumentos = new ArrayList();
    private Medico medicoSuperior;

    public Medico getEnfermeiroSuperior() {
        return medicoSuperior;
    }

    public void setMedicoSuperior(Medico medicoSuperior) {
        this.medicoSuperior = medicoSuperior;
    }
    public abstract String getDescricaoCargo();
    public  String assinarReceita(Receita receita){
        if(listaDocumentos.contains(receita.getTipoReceita())){
            return getDescricaoCargo();
        }else{
            if(medicoSuperior != null){
                return medicoSuperior.assinarReceita(receita);
        }else{
                return "Sem assinatura";
            }
        }
    }
}     

