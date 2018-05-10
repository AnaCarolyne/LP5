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
import model.Enfermeiro;
import persistence.EnfermeiroDAO;
import state.EnfermeiroCadastrado;

/**
 *
 * @author Aluno
 */
public class LerEnfermeiroAction implements Action {

    public LerEnfermeiroAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
//            EnfermeiroDAO.obterEnfermeiros();
//            Enfermeiro enfermeiro = new Enfermeiro();
//            enfermeiro.setNome(enfermeiro.getNome());
//            enfermeiro.setEstado(new EnfermeiroCadastrado());
//            String r ="T: "+enfermeiro.getNomeEstado().getEstado();
//             request.setAttribute("r",r);
            request.setAttribute("enfermeiros", EnfermeiroDAO.obterEnfermeiros());
            RequestDispatcher view = request.getRequestDispatcher("enfermeiroLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void Status(){
        
    }
}
