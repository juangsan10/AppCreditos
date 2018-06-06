package co.com.poli.appcredito.controller;

import co.com.poli.appcredito.business.implementation.CreditoBusinessImpl;
import co.com.poli.appcredito.jpacontroller.exceptions.Credito_1JpaController;
import co.com.poli.appcredito.model.Credito_1;
import co.com.poli.appcredito.util.JPAFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreditoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        HttpSession session = request.getSession(true);
        RequestDispatcher rd = null;
        //CreditoBusinessImpl cBusinessImpl = new CreditoBusinessImpl();

        String accion = request.getParameter("accion");
        System.out.println(accion);

        String idCredito = request.getParameter("txtnumcredito");
        String documento = request.getParameter("txtdocumento");
        String nombreyapellido = request.getParameter("txtnombreapellido");
        String monto = request.getParameter("txtmonto");
        String tipotrabajador = request.getParameter("txttrabajador");
        String tipocredito = request.getParameter("txttipocredito");
        String trabaja = request.getParameter("txtTrabaja");

        Credito_1JpaController jpaController = new Credito_1JpaController(JPAFactory.getFACTORY());

        Credito_1 credito;
        switch (accion) {
            case "crear":

                credito = new Credito_1(idCredito);
                credito.setDocumento(documento);
                credito.setNombreApellido(nombreyapellido);
                credito.setMonto(monto);
                credito.setTipotrabajador(tipotrabajador);
                credito.setTipocredito(tipocredito);
                credito.setTrabaja(trabaja);
                jpaController.create(credito);
                rd = request.getRequestDispatcher("index.jsp");
                String message = "Crédito creado corectamente.";
                session.setAttribute("MESSAGE", message);
                break;

            case "masutilizado":
                List<Credito_1> creditos = jpaController.findCredito_1Entities();
                int contvivienda = 0,
                 contestudio = 0,
                 contlibreinv = 0;
                for (Credito_1 credito1 : creditos) {

                    switch (credito1.getTipocredito()) {
                        case "Vivienda":
                            contvivienda++;
                            break;
                        case "Estudio":
                            contestudio++;
                            break;
                        case "Libre inversion":
                            contlibreinv++;
                            break;
                    }
                }
                int mayor = 0;

                mayor = (contvivienda > contestudio) ? contvivienda : contestudio;
                mayor = (contlibreinv > mayor) ? contlibreinv : mayor;
                String msg = "";
                if (contvivienda == mayor) {
                    msg = "El mayor es Vivienda";
                } else if (contestudio == mayor) {
                    msg = "El mayor es Estudio";
                } else if (contlibreinv == mayor) {
                    msg = "El mayor es Libre inversión";
                }
                session.setAttribute("CREDITO_MAS_UTILIZADO", msg);
                rd = request.getRequestDispatcher("views/creditomasutilizado.jsp");

                break;
            case "creditomayor":
              //  List<Credito_1> creditoss = jpaController.findCredito_1Entities();
                
                
                String idcredMayor = "";
                
                List<Credito_1> creditos2 = jpaController.findCredito_1Entities();
                double monto2;
                double mayorCred = 0;
                for (Credito_1 credito_1 : creditos2) {
                    monto2 = Double.valueOf(credito_1.getMonto());
                    if(monto2 > mayorCred)
                    {
                        mayorCred = monto2;
                        idcredMayor = credito_1.getNumerocredito();
                    }
                    
                }
                
                
                Credito_1 creditoss = jpaController.findCredito_1(idcredMayor);
        
                //System.out.println(creditoss);
              //  System.out.println(creditoss.getNumerocredito());
                    
               String numCredito = creditoss.getNumerocredito();
               String Documento=creditoss.getDocumento();
               String montos=creditoss.getMonto();
               String nombre= creditoss.getNombreApellido();
               session.setAttribute("NUM_CREDITO",numCredito);
                session.setAttribute("DOCUMENTO",Documento);
                   session.setAttribute("NOMBRE",nombre);
                 session.setAttribute("MONTO",montos);
               
                rd = request.getRequestDispatcher("views/creditomayor.jsp");
                
                break;

            case "quienesprestanmas":
                List<Credito_1> creditos1 = jpaController.findCredito_1Entities();
                int prestanmas = 0,
                 contdepend = 0,
                 contindep = 0;
                for (Credito_1 credito1 : creditos1) {

                    switch (credito1.getTipotrabajador()) {
                        case "Dependiente":
                            contdepend++;
                            break;
                        case "Independiente":
                            contindep++;
                            break;
                       
                    }
                }
                int mayortrab = 0;

                mayortrab = (contdepend > contindep) ? contdepend : contindep;
               
                String msgs = "";
                if (contdepend == mayortrab) {
                    msgs = "DEPENDIENTE";
                } else{
                    msgs = "INDEPENDIENTE";
                }
                session.setAttribute("PRESTAN", msgs);
                rd = request.getRequestDispatcher("views/prestanmas.jsp");

                break;

               
            case "listar":
                List<Credito_1> listado = jpaController.findCredito_1Entities();
                session.setAttribute("LISTADO", listado);
                rd = request.getRequestDispatcher("views/creditolista.jsp");
                break;

        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CreditoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CreditoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
