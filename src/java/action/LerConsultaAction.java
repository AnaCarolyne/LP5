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
import persistence.ConsultaDAO;
import persistence.MedicoDAO;
import persistence.PacienteDAO;

/**
 *
 * @author Aluno
 */
public class LerConsultaAction implements Action {

    public LerConsultaAction() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String acao = request.getParameter("acao");
        if (acao.equals("prepararDados")) {
            prepararDados(request, response);
        }else{
            LerDados(request, response);
        }
    }

    public void prepararDados(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            request.setAttribute("medicos", MedicoDAO.obterMedicos());
            request.setAttribute("pacientes", PacienteDAO.obterPacientes());
            RequestDispatcher view = request.getRequestDispatcher("consultaCadastro.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void LerDados(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            request.setAttribute("consultas", ConsultaDAO.obterConsultas());
            RequestDispatcher view = request.getRequestDispatcher("consultaLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
