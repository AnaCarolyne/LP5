/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;
import persistence.ConsultaDAO;

/**
 *
 * @author Aluno
 */
public class EditarConsultaAction implements Action {

    public EditarConsultaAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String acao = request.getParameter("acao");
        if (acao.equals("prepararEditar")) {
            prepararEditar(request, response);
        } else if (acao.equals("confirmarEditar")) {
            confirmarEditar(request, response);
        }

    }

    public void prepararEditar(HttpServletRequest request, HttpServletResponse response) {
        try {
//            request.setAttribute("operacao", "Editar");
//            request.setAttribute("consultas", ConsultaDAO.obterConsultas());
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Consulta consulta = ConsultaDAO.obterConsulta(codigo);
            request.setAttribute("consulta", consulta);
            RequestDispatcher view = request.getRequestDispatcher("consultaEditado.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    private void confirmarEditar(HttpServletRequest request, HttpServletResponse response) {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nomeMedico = request.getParameter("txtNomeMedico");
            String nomePaciente = request.getParameter("txtNomePaciente");
            String data = request.getParameter("txtData");
            String inicio = request.getParameter("txtInicio");
            String terminio = request.getParameter("txtTerminio");
            String obs = request.getParameter("txtObs");

            if (nomeMedico.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Consulta consulta = new Consulta(codigo, nomeMedico, nomePaciente, inicio, terminio, data, obs);

                ConsultaDAO.alterar(consulta);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerConsulta");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
