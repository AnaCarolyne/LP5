package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Enfermeiro;
import model.Paciente;
import persistence.EnfermeiroDAO;
import persistence.PacienteDAO;
import state.EnfermeiroCadastrado;
import state.EnfermeiroDemitido;
import state.EnfermeiroSubstituto;

/**
 *
 * @author Aluno
 */
public class EditarEnfermeiroAction implements Action {

    public EditarEnfermeiroAction() {
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
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Enfermeiro enfermeiro = EnfermeiroDAO.obterEnfermeiro(codigo);
            String s = ""+enfermeiro.getStatus();
            
            if (s.equals("Cadastrado")) {
                enfermeiro.setEstado(new EnfermeiroCadastrado());
                String r = enfermeiro.getNome() + " esta no estado " + enfermeiro.getEstado().getEstado(enfermeiro) + " - " + enfermeiro.Demitido(enfermeiro);
                request.setAttribute("r", r);
            } else if (s.equals("Demitido")) {
                enfermeiro.setEstado(new EnfermeiroDemitido());
                String r = enfermeiro.getNome() + " esta no estado " + enfermeiro.getEstado().getEstado(enfermeiro) + " - " + enfermeiro.Demitido(enfermeiro);
                request.setAttribute("r", r);
            }else if(s.equals("Substituto")){
                enfermeiro.setEstado(new EnfermeiroSubstituto());
                String r = enfermeiro.getNome() + " esta no estado " + enfermeiro.getEstado().getEstado(enfermeiro) + " - " + enfermeiro.Demitido(enfermeiro);
                request.setAttribute("r", r);
            }
          
            request.setAttribute("enfermeiro", enfermeiro);
            RequestDispatcher view = request.getRequestDispatcher("enfermeiroEditado.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    private void confirmarEditar(HttpServletRequest request, HttpServletResponse response) {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
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

            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Enfermeiro enfermeiro = new Enfermeiro(codigo, nome, cpf, cep, numero, complemento, endereco, bairro, cidade, estado, email, data, sexo, tel, cel, status);

                EnfermeiroDAO.alterar(enfermeiro);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerEnfermeiro");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
