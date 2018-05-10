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
public class EnfermeiroSubstituto implements EnfermeiroEstado {

    @Override
    public String getEstado(Enfermeiro e) {
        return "Substituto";
    }

    @Override
    public String Cadastrado(Enfermeiro e) {
        e.setEstado(new EnfermeiroCadastrado());
        return "Cadastro não realizado uma vez que demitido";
    }

    @Override
    public String Demitido(Enfermeiro e) {
        e.setEstado(new EnfermeiroDemitido());
        return "Enfermeiro pode ser demitido";
    }

    @Override
    public String Substituto(Enfermeiro e) {
        return "Enfermeiro pode ser substituto";
    }

}
