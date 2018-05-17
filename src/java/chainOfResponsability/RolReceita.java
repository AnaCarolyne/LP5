/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsability;

/**
 *
 * @author anacarolyne.franca
 */
public class RolReceita {

    private static RolReceita rolReceita = new RolReceita();
    private TipoReceitaExame tipoReceitaExame;
    private TipoReceitaMedicamento tipoReceitaMedicamento;
    private TipoReceitaTransferido tipoReceitaTransferido;


    public RolReceita() {
        tipoReceitaExame = new TipoReceitaExame();
        tipoReceitaMedicamento = new TipoReceitaMedicamento();
        tipoReceitaTransferido = new TipoReceitaTransferido();
       
    }
     public static RolReceita getIntace() {
        return rolReceita;
    }

    public TipoReceitaExame getTipoReceitaExame() {
        return tipoReceitaExame;
    }

    public void setTipoReceitaExame(TipoReceitaExame tipoReceitaExame) {
        this.tipoReceitaExame = tipoReceitaExame;
    }

    public TipoReceitaMedicamento getTipoReceitaMedicamento() {
        return tipoReceitaMedicamento;
    }

    public void setTipoReceitaMedicamento(TipoReceitaMedicamento tipoReceitaMedicamento) {
        this.tipoReceitaMedicamento = tipoReceitaMedicamento;
    }

    public TipoReceitaTransferido getTipoReceitaTransferido() {
        return tipoReceitaTransferido;
    }

    public void setTipoReceitaTransferido(TipoReceitaTransferido tipoReceitaTransferido) {
        this.tipoReceitaTransferido = tipoReceitaTransferido;
    }
    
}
