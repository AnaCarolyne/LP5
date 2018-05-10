/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import chainofresponsability.RolReceita;

/**
 *
 * @author anacarolyne.franca
 */
public class MedicoSecretario extends Medico{
     public MedicoSecretario(Medico superior) {
        listaDocumentos.add(RolReceita.getIntace().getTipoReceitaMedicamento());
        setMedicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {

        return "Secretario";
    }

   
}

