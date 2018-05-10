/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Medico;

/**
 *
 * @author Ana
 */
public class MedicoSubstituto implements MedicoEstado {

    public String getEstado() {
        return "Substituto";
    }

    public String getCadastrar(Medico e) {
        e.setState(new MedicoCadastrado());
        return "Cadastro não realizado uma vez que Cadastrado";
    }

    public String getDemitido(Medico e) {
        return "Medico(a) não pode ser Demitido";
    }

    public String getSubstituto(Medico e) {
        return "Medico não pode ser substituto";
    }

    public String getTransferido(Medico e) {
        return "Medico(a) não pode ser Transferido";
    }
}
