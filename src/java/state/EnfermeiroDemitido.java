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
public class EnfermeiroDemitido implements EnfermeiroEstado{


    public String getEstado(Enfermeiro e) {
        return"Demitido";
    }


    public String Cadastrado(Enfermeiro e) { 
        e.setEstado(new EnfermeiroCadastrado());
        return "Cadastro não realizado uma vez que demitido";
    }


    public String Demitido(Enfermeiro e) {
        return "Enfermeiro(a) não pode ser Demitido";
    }


    public String Substituto(Enfermeiro e) {
        e.setEstado(new EnfermeiroSubstituto());
        return "Enfermeiro pode ser substituto";
    }
}
