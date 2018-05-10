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
public class PacienteTransferido implements PacienteEstado{

    @Override
    public String getEstado(Paciente p) {
        return "Cadstrado";
    }

    @Override
    public String getCadastrar(Paciente p) {
        return"Cadstro não pode ser realizado";
    }

    @Override
    public String getTransferido(Paciente p) {
        return"Paciente não pode ser Transferido";
    }

}
