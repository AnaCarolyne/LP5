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
public class MedicoMemento {
private MedicoEstado estado;

public MedicoMemento(MedicoEstado estadoSalvar){
    estado=estadoSalvar;
}
public MedicoEstado getEstadoSalvo(){
    return estado;
}
public String toString(){
    return estado.getEstado();
}
}