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
import model.Medico;
import persistence.MedicoDAO;

/**
 *
 * @author Aluno
 */
public class ApagarMedicoAction implements Action{

    public ApagarMedicoAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Medico medico = new Medico(id);
            try {
                MedicoDAO.getInstance().delete(medico);
                response.sendRedirect("FrontController?action=LerMedico");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("medicoErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
