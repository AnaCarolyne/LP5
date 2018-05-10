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
public interface MedicoEstado {
    public String getEstado();
    public String getCadastrar(Medico p);
    public String getTransferido(Medico p);
    public String getSubstituto(Medico p);
    public String getDemitido(Medico p);
}
