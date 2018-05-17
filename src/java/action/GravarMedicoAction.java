/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Medico;
import persistence.MedicoDAO;

/**
 *
 * @author Aluno
 */
public class GravarMedicoAction implements Action {

    public GravarMedicoAction() {
    }
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("txtNome");
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
        String especializacao = request.getParameter("txtEsp");
        String crm = request.getParameter("txtCRM");
        String status = request.getParameter("txtStatus");
        if (nome.equals("") || email.equals((""))) {
            response.sendRedirect("index.jsp");
        } else {
            Medico medico = new Medico(0, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel, especializacao,crm, status);
            try {
                MedicoDAO.getInstance().save(medico);
               response.sendRedirect("FrontController?action=LerMedico");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
