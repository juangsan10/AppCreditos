
package co.com.poli.appcredito.controller;

import co.com.poli.appcredito.business.implementation.CreditoBusinessImpl;
import co.com.poli.appcredito.model.Credito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CreditoBusinessImpl cBusinessImpl = new CreditoBusinessImpl() {
            @Override
            public String crearCurso(Credito curso) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String idCredito = request.getParameter("txtnumcredito");
                String documento = request.getParameter("txtdocumento");
                String nombreyapellido = request.getParameter("txtnombreapellido");
                String monto = request.getParameter("txtmonto");
                String tipotrabajador = request.getParameter("txttrabajador");
                String tipocredito = request.getParameter("txttipocredito");
                String trabaja = request.getParameter("txtTrabaja");
                
                Credito credito = new Credito(idCredito, documento, nombreyapellido, monto, tipotrabajador,tipocredito,trabaja);
                String mensaje = cBusinessImpl.crearCredito(credito);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "Eliminar":
           
                break;
            case "actualizar":
              
                break;
            case "listar":
                List<Credito> listaCredito = cBusinessImpl.ObtenerListaCursos();
                session.setAttribute("LISTADO", listaCredito);
                rd = request.getRequestDispatcher("/views/creditolista.jsp");
                break;
            default:
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
        processRequest(request, response);
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
        processRequest(request, response);
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
