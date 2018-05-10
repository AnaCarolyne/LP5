/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Enfermeiro;
import persistence.EnfermeiroDAO;

/**
 *
 * @author Aluno
 */
public class ApagarEnfermeiroAction implements Action{

    public ApagarEnfermeiroAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Enfermeiro enfermeiro = new Enfermeiro(id);
            try {
                EnfermeiroDAO.getInstance().delete(enfermeiro);
                response.sendRedirect("FrontController?action=LerEnfermeiro");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("enfermeiroErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
