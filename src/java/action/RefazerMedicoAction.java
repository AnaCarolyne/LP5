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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Medico;
import persistence.MedicoDAO;
import state.MedicoCadastrado;
import state.MedicoDemitido;
import state.MedicoMemento;

/**
 *
 * @author Aluno
 */
public class RefazerMedicoAction implements Action {

    public RefazerMedicoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        try {
//           int codigo = Integer.parseInt(request.getParameter("codigo"));
//            Medico m = MedicoDAO.obterMedico(codigo);
//            Medico obtermemento = MedicoDAO.obterMemento(m.getCrm());
//           Medico medico = new Medico(0, m.getNome(),m.getCpf(),m.getCep(),m.getNumero(),m.getComplemento(),m.getEndereco(), m.getBairro(),m.getCidade(),m.getEstado(),m.getEmail(),m.getDataNasc(), m.getSexo(), m.getTel(),m.getCel(),m.getEspecializacao(),m.getCrm(),obtermemento.getMemento());
//               // MedicoDAO.getInstance().alterar(medico,);
//                response.sendRedirect("sucesso.jsp");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            Logger.getLogger(RefazerMedicoAction.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
