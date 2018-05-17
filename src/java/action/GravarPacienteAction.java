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
import model.Paciente;
import persistence.PacienteDAO;
import state.PacienteConvenio;

/**
 *
 * @author Aluno
 */
public class GravarPacienteAction implements Action {

    public GravarPacienteAction() {
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
        String convenio = request.getParameter("txtConvenio");
         String status = request.getParameter("txtStatus");
         String ins = request.getParameter("txtIns");
         
        PacienteConvenio p = new PacienteConvenio();
         p.setNome(nome);
         p.setInstituicaoOrigem(ins);
         
        if (nome.equals("") || email.equals((""))) {
            response.sendRedirect("index.jsp");
        } else {
            Paciente contato = new Paciente(cel, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel, convenio,status,ins);
            contato.setOrigemIns(p.getDadosPaciente());
            try {
                PacienteDAO.getInstance().save(contato);
               request.setAttribute("oc",contato.getOrigemIns());
              response.sendRedirect("FrontController?action=LerPaciente");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
