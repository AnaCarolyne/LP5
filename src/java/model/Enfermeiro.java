/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import state.EnfermeiroCadastrado;
import state.EnfermeiroEstado;

/**
 *
 * @author Ana
 */
public class Enfermeiro {

    private int id;
    private String nome;
    private int cpf;
    private int cep;
    private int numero;
    private String complemento;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String email;
    private String dataNasc;
    private String sexo;
    private int tel;
    private int cel;
    private String status;
    private EnfermeiroEstado estado;

    public Enfermeiro() {
        this.estado = new EnfermeiroCadastrado();
    }

    public Enfermeiro(Integer id) {
        this.id = id;
    }

    public Enfermeiro(int id, String nome, int cpf, int cep, int numero, String complemento, String endereco, String bairro, String cidade, String uf, String email, String dataNasc, String sexo, int tel, int cel, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.tel = tel;
        this.cel = cel;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public void setEstado(EnfermeiroEstado estado) {
        this.estado = estado;
    }

    public String Cadastrar(Enfermeiro e) {
        return estado.Cadastrado(e);
    }

    public String Demitido(Enfermeiro e) {
        return estado.Demitido(e);
    }

    public String Substituto(Enfermeiro e) {
        return estado.Substituto(e);
    }

    public EnfermeiroEstado getEstado() {
        return estado;
    }

    public EnfermeiroEstado getNomeEstado() {
        this.estado = estado;
        return estado;
    }
}
