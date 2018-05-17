/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsability;

import state.Medico;

/**
 *
 * @author anacarolyne.franca
 */
public class MedicoCoordenador extends Medico {


    public MedicoCoordenador(Medico superior) {
        listaDocumentos.add(RolReceita.getIntace().getTipoReceitaExame());
        setMedicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {

        return "Coordenador";
    }

   
}
