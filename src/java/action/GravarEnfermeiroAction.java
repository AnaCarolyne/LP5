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
import model.Enfermeiro;
import persistence.EnfermeiroDAO;

/**
 *
 * @author Aluno
 */
public class GravarEnfermeiroAction implements Action {

    public GravarEnfermeiroAction() {
    }
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("txtNome");;
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
        String status = request.getParameter("txtStatus");
        
        if (nome.equals("") || email.equals((""))) {
            response.sendRedirect("index.jsp");
        } else {
            Enfermeiro enfermeiro = new Enfermeiro(cel, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel,status);
            try {
                EnfermeiroDAO.getInstance().save(enfermeiro);
                response.sendRedirect("FrontController?action=LerEnfermeiro");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
