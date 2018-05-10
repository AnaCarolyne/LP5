/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import model.Medico;
import state.MedicoEstado;

/**
 *
 * @author Ana
 */
public class MedicoDemitido implements MedicoEstado {

    public String getEstado() {
        return "Demitido";
    }

    public String getCadastrar(Medico e) {
        return "Cadastro n�o realizado uma vez que demitido";
    }

    public String getDemitido(Medico e) {
        e.setState(new MedicoDemitido());
        return "Medico(a) n�o pode ser  Demitido";
    }

    public String getSubstituto(Medico e) {
        return "Medico n�o pode ser substituto";
    }

    public String getTransferido(Medico e) {
        return "Medico(a) n�o pode ser Transferido";
    }
}
