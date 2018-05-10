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
import model.Consulta;
import persistence.ConsultaDAO;

/**
 *
 * @author Aluno
 */
public class ApagarConsultaAction implements Action{

    public ApagarConsultaAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Consulta consulta = new Consulta(id);
            try {
                ConsultaDAO.getInstance().delete(consulta);
                response.sendRedirect("FrontController?action=LerConsulta&acao=Lerdados");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("consultaErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
