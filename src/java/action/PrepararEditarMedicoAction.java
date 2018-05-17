/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Medico;
import model.Paciente;
import persistence.MedicoDAO;
import persistence.PacienteDAO;
import state.MedicoCadastrado;
import state.MedicoDemitido;
import state.MedicoMemento;
import state.MedicoSubstituto;
import state.MedicoTransferido;

/**
 *
 * @author Aluno
 */
public class PrepararEditarMedicoAction implements Action {

    public PrepararEditarMedicoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Medico medico = MedicoDAO.obterMedico(codigo);
            String s = "" + medico.getStatus();

            if (s.equals("Cadastrado")) {
                medico.setState(new MedicoCadastrado());
                String r = medico.getNome() + " esta no estado " + medico.getState().getEstado() + " - " + medico.Demitido(medico);
                request.setAttribute("r", r);
            } else if (s.equals("Demitido")) {
                medico.setState(new MedicoDemitido());
                String r = medico.getNome() + " esta no estado " + medico.getState().getEstado() + " - " + medico.Demitido(medico);
                request.setAttribute("r", r);
            } else if (s.equals("Substituto")) {
                medico.setState(new MedicoSubstituto());
                String r = medico.getNome() + " esta no estado " + medico.getState().getEstado() + " - " + medico.Substituido(medico);
                request.setAttribute("r", r);
            } else if (s.equals("Transferido")) {
                medico.setState(new MedicoTransferido());
                String r = medico.getNome() + " esta no estado " + medico.getState().getEstado() + " - " + medico.Cadastrar(medico);
                request.setAttribute("r", r);
            }
            request.setAttribute("m", MedicoDAO.obterMedicos());
            request.setAttribute("medico", medico);
            RequestDispatcher view = request.getRequestDispatcher("medicoEditado.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}
