<%-- 
    Document   : creditomayor
    Created on : 4/06/2018, 01:58:05 PM
    Author     : JUAN G
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>APP CREDITOS</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppCredito</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
           
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/index.jsp">Creditos</a>
                    </li>
                     <
                </ul>
            </div>
        </nav>
                    
         
                   
                        
          <div class="col-12">

      
            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                  <caption>Lista de Creditos</caption>
                <div class="container">
                    <table class="table table-striped table-hover">
                      
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Numero Credito</th>
                                <th scope="col">Documento</th>
                                <th scope="col">NombreyApellidos</th>
                                <th scope="col">Monto</th>
                               
                         </tr>
                     
                        </tbody>   </thead>
                        <tbody>
                           
                            <!--Se crea form por cada fila para actualizar-->
                            <form method="post" 
                              
                                <tr>
                                     <td><c:out value="${sessionScope.NUM_CREDITO}"></c:out></td>
                                     <td><c:out value="${sessionScope.DOCUMENTO}"></c:out></td>
                                      <td><c:out value="${sessionScope.NOMBRE}"></c:out></td>
                                     <td><c:out value="${sessionScope.MONTO}"></c:out></td>
                                </tr>
                               </form>
                            
                        </tbody>
                    </table>
                </div>
           

            <!-- Example row of columns -->

                </div> <!-- /container -->
                    </div>

        
         <%@include  file = "/WEB-INF/jspf/footer.jspf" %>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    </body>
</html>

