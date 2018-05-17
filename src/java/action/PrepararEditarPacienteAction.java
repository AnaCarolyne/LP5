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
import model.Paciente;
import persistence.PacienteDAO;
import state.PacienteCadastrado;
import state.PacienteTransferido;

/**
 *
 * @author Aluno
 */
public class PrepararEditarPacienteAction implements Action {

    public PrepararEditarPacienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Paciente paciente = PacienteDAO.obterPaciente(codigo);
            String s = paciente.getStatus();

            if (s.equals("Cadastrado")) {
                paciente.setState(new PacienteCadastrado());
                String r = paciente.getNome() + " esta no estado " + paciente.getState().getEstado(paciente) + " - " + paciente.Transferido(paciente);
                request.setAttribute("r", r);
            }else if (s.equals("Transferido")) {
                paciente.setState(new PacienteTransferido());
                String r = paciente.getNome() + " esta no estado " + paciente.getState().getEstado(paciente) + " - " + paciente.Transferido(paciente);
                request.setAttribute("r", r);
            }

            request.setAttribute("paciente", paciente);
            RequestDispatcher view = request.getRequestDispatcher("pacienteEditado.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}
