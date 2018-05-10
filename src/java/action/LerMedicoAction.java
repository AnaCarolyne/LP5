/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.MedicoDAO;
import chainofresponsability.MedicoCoordenador;
import chainofresponsability.MedicoDiretor;
import state.MedicoSecretario;
import chainofresponsability.Receita;
import chainofresponsability.RolReceita;
import chainofresponsability.TipoReceita;

/**
 *
 * @author Aluno
 */
public class LerMedicoAction implements Action {

    public LerMedicoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        
     
        MedicoDiretor diretor =new MedicoDiretor(null);
        MedicoCoordenador coordenador = new MedicoCoordenador(diretor);
        MedicoSecretario secretaria= new MedicoSecretario(coordenador);
        
        System.out.println(
                secretaria.assinarReceita(
                new Receita((TipoReceita) RolReceita.getIntace().getTipoReceitaExame())));
        
         System.out.println(
                secretaria.assinarReceita(
                new Receita((TipoReceita) RolReceita.getIntace().getTipoReceitaMedicamento())));
          System.out.println(
                secretaria.assinarReceita(
                new Receita((TipoReceita) RolReceita.getIntace().getTipoReceitaTransferido())));
        try {
        

        
            request.setAttribute("medicos", MedicoDAO.obterMedicos());
            RequestDispatcher view = request.getRequestDispatcher("medicoLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
