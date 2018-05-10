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
import model.Paciente;
import persistence.PacienteDAO;

/**
 *
 * @author Aluno
 */
public class ApagarPacienteAction implements Action{

    public ApagarPacienteAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Paciente paciente = new Paciente(id);
            try {
                PacienteDAO.getInstance().delete(paciente);
                response.sendRedirect("FrontController?action=LerPaciente");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("pacienteErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
