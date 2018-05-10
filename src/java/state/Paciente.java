/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author anacarolyne.franca
 */
public abstract class Paciente {

    private String nome;
    private String instituicaoOrigem;

    public abstract String getOrigem();

    public String getDadosPaciente() {

        return "Paciente: " + getNome() + " - Origem: " + getOrigem() + getInstituicaoOrigem();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }

}


