/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Enfermeiro;
import model.Paciente;

/**
 *
 * @author Ana
 */
public class PacienteCadastrado implements PacienteEstado{

    @Override
    public String getEstado(Paciente p) {
        return "Cadastrado";
    }

    @Override
    public String getCadastrar(Paciente p) {
        return"Cadstro não realizado uma vez que Cadastrado";
    }

    @Override
    public String getTransferido(Paciente p) {
        return"Paciente pode ser Transferido";
    }

}
