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
public class EditarPacienteAction implements Action {

    public EditarPacienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nome = request.getParameter("txtNome");
            int cpf = Integer.parseInt(request.getParameter("txtCPF"));
            int cep = Integer.parseInt(request.getParameter("txtCEP"));
            int numero = Integer.parseInt(request.getParameter("txtNumero"));
            String complemento = request.getParameter("txtComplemento");
            String endereco = request.getParameter("txtEndereco");
            String bairro = request.getParameter("txtBairro");
            String cidade = request.getParameter("txtCidade");
            String estado = request.getParameter("txtEstado");
            String email = request.getParameter("txtEmail");
            String data = request.getParameter("txtDataNasc");
            String sexo = request.getParameter("txtSexo");
            int tel = Integer.parseInt(request.getParameter("txtTel"));
            int cel = Integer.parseInt(request.getParameter("txtCel"));
            String convenio = request.getParameter("txtConvenio");
            String status = request.getParameter("txtStatus");
            String ins = request.getParameter("txtIns");

            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Paciente paciente = new Paciente(codigo, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel, convenio, status,ins);

                PacienteDAO.alterar(paciente);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerPaciente");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
