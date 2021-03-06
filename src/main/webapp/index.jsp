
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>App Credito</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
       
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppCreditos</a>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/index.jsp">
                            Creditos<span class="sr-only">(current)</span></a>
                    </li>
                  
                     <li class="nav-item">
                        <a class="nav-link" href= "${pageContext.servletContext.contextPath}/CreditoServlet?accion=listar">Todos los creditos</a>
                    </li>
                     <li class="nav-item">
                        <a class="nav-link" href= "${pageContext.servletContext.contextPath}/CreditoServlet?accion=masutilizado">Credito mas utilizado</a>
                    </li>
                     <li class="nav-item">
                        <a class="nav-link" href= "${pageContext.servletContext.contextPath}/CreditoServlet?accion=creditomayor">Credito mayor</a>
                    </li>
                     <li class="nav-item">
                        <a class="nav-link" href= "${pageContext.servletContext.contextPath}/CreditoServlet?accion=quienesprestanmas">Quienes prestan mas</a>
                    </li>
                </ul>
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/CreditoServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnumcredito" type="text" 
                                       class="form-control" 
                                       placeholder="Numero de credito" required/>
                            </div>
                            <div class="col"></div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" 
                                       class="form-control" 
                                       placeholder="Documento"  required/>
                            </div>
                            <div class="col">
                                <input name="txtnombreapellido" type="text" 
                                       class="form-control" 
                                       placeholder="Nombre y Apellido"  required/>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtmonto" type="text" 
                                       class="form-control" 
                                       placeholder="monto"  required/>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <select name="txttrabajador" id="inputState" class="form-control">
                                    <option value="Independiente" selected>Independiente</option>
                                    <option value="Dependiente">Dependiente</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txttipocredito" id="inputState" class="form-control"  >
                                    <option value="Vivienda" selected>Vivienda</option>
                                    <option value="Estudio" >Estudio</option>
                                    <option value="Libreinversion" >Libre inversion</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txtTrabaja" id="inputState" class="form-control" >
                                    <option value="si" selected>SI</option>
                                    <option value="no" >NO</option>
          
                                </select>
                            </div>
                        </div>
                            
                            <div class="form-row">
                            
                            <div class="col">
                               
                                
                            </div>
                        </div>
                                       <button name="accion" value="crear" 
                                        type="submit" 
                                         class="btn btn-primary">Registrar</button>     
                           
                       
                    </form>
                       
                </div>
                           <p>
                            <div>
                     
                      
                                   </div>                     
                        </p>
            </div>
                        
                        <h5><c:out value="${sessionScope.MESSAGE}"/> </h5>

            <!-- Example row of columns -->

            <hr>

          <!--  </div> <!-- /container -->

        </main>

       

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->

    </body>
</html>
