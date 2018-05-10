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
public class EnfermeiroCadastrado implements EnfermeiroEstado{

    @Override
    public String getEstado(Enfermeiro e) {
        return"Cadastrado";
    }

    @Override
    public String Cadastrado(Enfermeiro e) {
        return "Cadastro não realizado uma vez que demitido";
    }

    @Override
    public String Demitido(Enfermeiro e) {
        e.setEstado(new EnfermeiroDemitido());
        return "Enfermeiro(a) pode ser demitido";
    }

    @Override
    public String Substituto(Enfermeiro e) {
        return "Enfermeiro(a) pode ser substituto";
    }
    
}
