/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Enfermeiro;

/**
 *
 * @author Ana
 */
public interface EnfermeiroEstado {

    public String getEstado(Enfermeiro e);

    public String Cadastrado(Enfermeiro e);

    public String Demitido(Enfermeiro e);

    public String Substituto(Enfermeiro e);
}
