/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import state.Medico;

/**
 *
 * @author anacarolyne.franca
 */
public class MedicoDiretor extends Medico{
    public MedicoDiretor(Medico superior) {
        listaDocumentos.add(RolReceita.getIntace().getTipoReceitaTransferido());
        setMedicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {

        return "Ditetor";
    }

   
}
