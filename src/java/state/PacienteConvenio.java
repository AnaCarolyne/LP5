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
public class PacienteConvenio extends Paciente{
 //PadraoTemplateMethod
    @Override
    public String getOrigem() {
        return"sus";
    }
}