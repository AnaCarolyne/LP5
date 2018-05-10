/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;
import model.Paciente;
import persistence.ConsultaDAO;
import persistence.PacienteDAO;
import state.PacienteConvenio;
import state.PacienteConvenio1;

/**
 *
 * @author Aluno
 */
public class LerPacienteAction implements Action {

    public LerPacienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //PadraoTemplateMethod
        try {
        PacienteConvenio paciente1 = new PacienteConvenio();
        paciente1.setNome(" luiz ");
        paciente1.setInstituicaoOrigem(" publuco ");
        PacienteConvenio1 paciente2= new PacienteConvenio1();
        paciente2.setNome(" juliana ");
        paciente2.setInstituicaoOrigem(" unimed ");
        
        System.out.println(paciente1.getDadosPaciente());
         System.out.println(paciente2.getDadosPaciente());
      
            Consulta c = new Consulta();

            Paciente p = new Paciente(c);            
            c.setEdicao(" tem consulta marcada com medico(a) ");
               
            request.setAttribute("paciente",p.getMSG());
            request.setAttribute("consultas", ConsultaDAO.obterConsultas());
            request.setAttribute("pacientes", PacienteDAO.obterPacientes());
            RequestDispatcher view = request.getRequestDispatcher("pacienteLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
