/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import chainofresponsability.MedicoDemitido;
import model.Medico;

/**
 *
 * @author Ana
 */
public class MedicoCadastrado implements MedicoEstado{

    @Override
    public String getEstado() {
        return"Cadastrado";
    }

    @Override
    public String getCadastrar(Medico e) {
        return "Cadastro não realizado uma vez que Cadastrado";
    }

    @Override
    public String getDemitido(Medico e) {
        e.setState(new MedicoDemitido());
        return "Medico(a) pode ser demitido";
    }

    @Override
    public String getSubstituto(Medico e) {
        return "Medico(a) não pode ser substituto";
    }
        @Override
    public String getTransferido(Medico e) {
        e.setState(new MedicoTransferido());
        return "Medico(a) pode ser substituto";
    }
}
