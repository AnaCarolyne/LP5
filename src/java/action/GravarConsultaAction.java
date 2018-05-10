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
public class GravarConsultaAction implements Action {

    public GravarConsultaAction() {
    }
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nomeMedico = request.getParameter("txtNomeMedico");
        String nomePaciente = request.getParameter("txtNomePaciente");
        String data = request.getParameter("txtData");
        String inicio = request.getParameter("txtInicio");
        String terminio = request.getParameter("txtTerminio");
        String obs = request.getParameter("txtObs");

        
        if (nomeMedico.equals("") || nomePaciente.equals((""))) {
            response.sendRedirect("index.jsp");
        } else {
            Consulta consulta = new Consulta(0, nomeMedico, nomePaciente, data,inicio, terminio, obs);
            try {
                ConsultaDAO.getInstance().save(consulta);
                response.sendRedirect("sucesso.jsp");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
