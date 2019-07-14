

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="pe.edu.unmsm.model.Deporte"%>
<%@page import="pe.edu.unmsm.modelDAO.DeporteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="https://www.lima2019.pe/apple-icon-152x152.png">
        <link rel="icon" type="image/png" href="https://www.lima2019.pe/apple-icon-152x152.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>
            Juegos Panamericanos
        </title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
        <!-- CSS Files -->
        <link href="bootstrap/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="bootstrap/assets/css/now-ui-kit.css?v=1.3.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="bootstrap/assets/demo/demo.css" rel="stylesheet" />
        <link href="bootstrap/css/poll/pollCategories.css" rel="stylesheet" />

    </head>
    <body class="landing-page sidebar-collapse">

        <%@ include file="View/tpl/header.jsp" %>

        <div class="wrapper">
            <br>
            <br>
            <br>
            <div class="content pad-top">
                <div class="container">

                    <div class="title title-blue title-with-line title-wider">
                        <div class="title-text">${lista.get(0)}</div>
                    </div>

                    <div class="poll-title1 text-center">
                        <div>
                            <strong>Deportes que se realizaran en esta sede:</strong>
                        </div>
                        <div>
                            A continuacion se listaran los diferentes deportes y sus eventos.
                        </div>
                    </div>
                    <div class="container">
                        <div class="container text-center">
                            <%
                                DeporteDao deporteDao = new DeporteDao();
                                List<Deporte> deportes = deporteDao.findForIdSede(Integer.parseInt(request.getParameter("id")));
                                Iterator<Deporte> deporteiterator = deportes.iterator();
                                while (deporteiterator.hasNext()) {
                                    Deporte s = deporteiterator.next();
                            %>
                            <div class="title title-with-line title-wider" style="color: purple">
                                <div class="title-text"><%=s.getNombre()%></div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="img/deport/<%=s.getIddeporte()%>.png" alt="Image" class="rounded-pill img-raised" width="350" height="250">
                                </div>
                                <div class="col-md-8 ">
                                    <h4 class="text-left">eventos</h4>
                                </div>
                            </div>
                            <br>
                            <br>
                            <% }%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="View/tpl/footer.jsp" %>

        <!--   Core JS Files   -->
        <script src="bootstrap/assets/js/core/jquery.min.js" type="text/javascript"></script>
        <script src="bootstrap/assets/js/core/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap/assets/js/core/bootstrap.min.js" type="text/javascript"></script>
        <!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
        <script src="bootstrap/assets/js/plugins/bootstrap-switch.js"></script>
        <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
        <script src="bootstrap/assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
        <!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->
        <script src="bootstrap/assets/js/plugins/bootstrap-datepicker.js" type="text/javascript"></script>
        <!--  Google Maps Plugin    -->
        <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
        <!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->
        <script src="bootstrap/assets/js/now-ui-kit.js?v=1.3.0" type="text/javascript"></script>
        <script src="bootstrap/js/scrollNav" type="text/javascript"></script>
        <script src="bootstrap/js/app" type="text/javascript"></script>
    </body>
</html>
