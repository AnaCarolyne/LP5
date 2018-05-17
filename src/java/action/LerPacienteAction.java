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
import model.Consulta;
import model.Paciente;
import persistence.ConsultaDAO;
import persistence.PacienteDAO;
import state.PacienteConvenio;

/**
 *
 * @author Aluno
 */
public class LerPacienteAction implements Action {

    public LerPacienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Consulta c = new Consulta();
            Paciente p = new Paciente(c);            
            c.setEdicao(" tem consulta marcada com medico(a) ");
               
            request.setAttribute("paciente",p.getMSG());
            request.setAttribute("consultas", ConsultaDAO.obterConsultas());
            request.setAttribute("pacientes", PacienteDAO.obterPacientes());
            RequestDispatcher view = request.getRequestDispatcher("pacienteLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
