/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Observable;

/**
 *
 * @author Ana
 */
public class Consulta extends Observable {

    private int id;
    private String horaInicio;
    private String horaTerminio;
    private String data;
    private String observacao;
    private String medico;
    private String paciente;

    public Consulta(int id) {
        this.id = id;
    }

    public Consulta(int id, String medico, String paciente, String horaInicio, String horaTerminio, String data, String observacao) {
        this.medico = medico;
        this.paciente = paciente;
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaTerminio = horaTerminio;
        this.data = data;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTerminio() {
        return horaTerminio;
    }

    public void setHoraTerminio(String horaTerminio) {
        this.horaTerminio = horaTerminio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Consulta() {

    }
    
    private String mensagem;

    public void setEdicao(String novaMSG) {
        this.mensagem = novaMSG;
        setChanged();
        notifyObservers();
    }

    public String getMensagem() {
        return this.mensagem;

    }
}
