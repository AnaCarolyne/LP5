/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Paciente;

/**
 *
 * @author Ana
 */
public interface PacienteEstado {
    public String getEstado(Paciente p);
    public String getCadastrar(Paciente p);
    public String getTransferido(Paciente p);
}
