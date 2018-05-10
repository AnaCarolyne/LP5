/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import state.MedicoCadastrado;
import state.MedicoEstado;
import state.MedicoMemento;

/**
 *
 * @author Ana
 */
public class Medico {

    private int id;
    private String nome;
    private int cpf;
    private int cep;
    private int numero;
    private String complemento;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String dataNasc;
    private String sexo;
    private int tel;
    private int cel;
    private String especializacao;
    private String crm;
    private String status;
    MedicoEstado state;

    public Medico() {
        this.state = new MedicoCadastrado();
    }

    public Medico(Integer id) {
        this.id = id;
    }

    public Medico(int id, String nome, int cpf, int cep, int numero, String complemento, String endereco, String bairro, String cidade, String estado, String email, String dataNasc, String sexo, int tel, int cel, String especializacao, String crm, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.tel = tel;
        this.cel = cel;
        this.especializacao = especializacao;
        this.crm = crm;
        this.status = status;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String Cadastrar(Medico m) {
        return state.getCadastrar(m);
    }

    public String Demitido(Medico m) {
        return state.getDemitido(m);
    }

    public String Transferido(Medico m) {
        return state.getTransferido(m);
    }

    public String Substituido(Medico m) {
        return state.getSubstituto(m);
    }

    public MedicoEstado getState() {
        return state;
    }

    public MedicoEstado getNomeState() {
        this.state = state;
        return state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setState(MedicoEstado state) {
        this.state = state;
    }

    public MedicoMemento saveToMemento() {
        return new MedicoMemento(state);
    }

    public void restoreFromMemento(MedicoMemento memento) {
        state = memento.getEstadoSalvo();
    }
}
