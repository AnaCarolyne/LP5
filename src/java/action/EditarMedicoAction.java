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
public class EditarMedicoAction implements Action {

    public EditarMedicoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nome = request.getParameter("txtNome");;
            String cpf = request.getParameter("txtCPF");
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
            String cel = request.getParameter("txtCel");
            String esp = request.getParameter("txtEsp");
            String crm = request.getParameter("txtCRM");
            String status = request.getParameter("txtStatus");

            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Medico medico = new Medico(codigo, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel, esp, crm, status);

                MedicoDAO.alterar(medico);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerMedico");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
