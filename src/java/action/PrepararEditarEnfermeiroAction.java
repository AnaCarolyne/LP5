
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
public class PrepararEditarEnfermeiroAction implements Action {

    public PrepararEditarEnfermeiroAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
}
