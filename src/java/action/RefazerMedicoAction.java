/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Medico;
import persistence.MedicoDAO;
import state.MedicoCadastrado;
import chainofresponsability.MedicoDemitido;
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
        try {
            
           MedicoDAO.obterMedicos();
            Medico medico = new Medico();
            ArrayList<MedicoMemento> estadoSalvos = new ArrayList();
            
            medico.setState(new MedicoCadastrado());
            estadoSalvos.add(medico.saveToMemento());
            medico.setState(new MedicoDemitido());
            estadoSalvos.add(medico.saveToMemento());
            
            for (Iterator i = estadoSalvos.iterator(); i.hasNext();) {
                System.out.println(i.next());
            }
            medico.restoreFromMemento(estadoSalvos.get(1));
            System.out.println(medico.getNome());
            
            request.setAttribute("medicos", MedicoDAO.obterMedicos());
            RequestDispatcher view = request.getRequestDispatcher("medicoLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
