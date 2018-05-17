/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Observable;
import java.util.Observer;
import state.PacienteCadastrado;
import state.PacienteConvenio;
import state.PacienteEstado;

/**
 *
 * @author Ana
 */
public class Paciente implements Observer {

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
    private String convenio;
    private String status;
    private PacienteEstado state;
    private Observable consulta;
    private String msg;
    private String instituicao;
    private String origemIns;
    
    public Paciente() {
        this.state = new PacienteCadastrado();
    }

    public Paciente(Integer id) {
        this.id = id;
    }

    public Paciente(int id, String nome, int cpf, int cep, int numero, String complemento, String endereco, String bairro, String cidade, String estado, String email, String dataNasc, String sexo, int tel, int cel, String convenio, String status,String instituicao) {
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
        this.convenio = convenio;
        this.status = status;
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
     public String getOrigemIns() {
        return origemIns;
    }

    public void setOrigemIns(String o) {
        this.origemIns = o;
    }
    
    public void setInstituicaoOrigem(){
          PacienteConvenio paciente1 = new PacienteConvenio();
        paciente1.setNome(getNome());
        paciente1.setInstituicaoOrigem(getInstituicao());
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
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

    public void setState(PacienteEstado state) {
        this.state = state;
    }

    public String Cadastrar(Paciente p) {
        return state.getEstado(p);
    }

    public String Transferido(Paciente p) {
        return state.getTransferido(p);
    }

    public PacienteEstado getNomeEstado() {
        this.state = state;
        return state;
    }

    public PacienteEstado getState() {
        return state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMSG() {
        return msg;
    }

    public Paciente(Observable consulta) {
        this.consulta = consulta;
        consulta.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg1) {
        if (o instanceof Consulta) {
            Consulta consulta = (Consulta) o;
            msg = consulta.getMensagem();
        }
    }
}
