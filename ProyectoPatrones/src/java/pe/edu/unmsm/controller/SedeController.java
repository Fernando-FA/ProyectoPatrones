/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.unmsm.Factory.DaoFactory;
import pe.edu.unmsm.intefaces.ICrudDao;
import pe.edu.unmsm.model.Deporte;
import pe.edu.unmsm.model.Sede;
import pe.edu.unmsm.modelDAO.DeporteDao;
import pe.edu.unmsm.modelDAO.SedeDao;

/**
 *
 * @author ferna
 */
public class SedeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recibimos el parametro de accion, para ver que solicito el cliente.
        String action = request.getParameter("action");
        if ("ver".equals(action)) {
            try {
                this.verMenuSede(request, response);
            } catch (Exception ex) {
                System.out.println("Error en listado de deportes");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    private void verMenuSede(HttpServletRequest request, HttpServletResponse response)
            throws Exception, IOException {
        String nombreSede = "";
        int idSede = Integer.parseInt(request.getParameter("id"));
       //Patron Factory
        DaoFactory daofact =  new DaoFactory();
        ICrudDao sededao = daofact.getDao("SEDE");
        Sede sede =  (Sede) sededao.findForId(idSede);
        nombreSede = sede.getNombre();
        List<String> nombreId = new LinkedList<>();
        nombreId.add(0,nombreSede);
        nombreId.add(1,String.valueOf(idSede));
       request.setAttribute("lista",nombreId);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/deportes.jsp");
        rd.forward(request, response);
    }

}
