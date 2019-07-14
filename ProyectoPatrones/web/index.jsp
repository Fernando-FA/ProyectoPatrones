
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
    </head>

    <body class="landing-page sidebar-collapse">

        <%@ include file="View/tpl/header.jsp" %>

        <div class="wrapper">
            <div class="page-header clear-filter" filter-color="primary">
                <div class="page-header-image" data-parallax="true" style="background-image:url('bootstrap/assets/img/panam.jpg');">
                </div>
                <br>
                <br>
                <div class="section section-contact-us text-right col-md-6">
                    <div class="container">
                        <br>
                        <h2 class="title" style="color: black">Tu opinion es valiosa para nosotros</h2>
                        <p class="description" style="color: black">Rellena el formulario con tus datos, realiza la encuesta y de esta forma permitenos mejorar con tu opinion.</p>
                        <div class="row">
                            <div class="col-lg-6 text-center col-md-8 ml-auto mr-auto">
                                <form method="post" action="user">
                                    <div class="input-group input-lg">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">
                                                <i class="fa fa-envelope"></i>
                                            </span>
                                        </div>
                                        <input name="user" id="user" type="email" required class="form-control" placeholder="Correo Electronico...">
                                    </div>
                                    <div class="input-group input-lg">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">
                                                <i class="fa fa-unlock"></i>
                                            </span>
                                        </div>
                                        <input name="pass"  id="pass" type="password" required class="form-control" placeholder="Contraseña...">
                                    </div>
                                    <p class="text-danger">${message}</p>
                                    <div class="send-button">
                                        <button type="submit" class="btn btn-primary btn-round btn-block btn-lg" style="background: #c913ed ">Iniciar Sesión</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="section section-about-us">
                <div class="container">
                    <div class="row">
                        <div class="col-md-8 ml-auto mr-auto text-center">
                            <h2 class="title">Who we are?</h2>
                            <h5 class="description">According to the National Oceanic and Atmospheric Administration, Ted, Scambos, NSIDClead scentist, puts the potentially record low maximum sea ice extent tihs year down to low ice extent in the Pacific and a late drop in ice extent in the Barents Sea.</h5>
                        </div>
                    </div>
                    <div class="separator separator-primary"></div>
                    <div class="section-story-overview">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="image-container image-left" style="background-image: url('bootstrap/assets/img/juegos-2019.jpg')">
                                    <!-- First image on the left side -->
                                    <p class="blockquote blockquote-primary">"Over the span of the satellite record, Arctic sea ice has been declining significantly, while sea ice in the Antarctichas increased very slightly"
                                        <br>
                                        <br>
                                        <small>-NOAA</small>
                                    </p>
                                </div>
                                <!-- Second image on the left side of the article -->
                                <div class="image-container" style="background-image: url('bootstrap/assets/img/jugams.png')"></div>
                            </div>
                            <div class="col-md-5">
                                <!-- First image on the right side, above the article -->
                                <div class="image-container image-right" style="background-image: url('bootstrap/assets/img/lima2019.jpg')"></div>
                                <h3>So what does the new record for the lowest level of winter ice actually mean</h3>
                                <p>The Arctic Ocean freezes every winter and much of the sea-ice then thaws every summer, and that process will continue whatever happens with climate change. Even if the Arctic continues to be one of the fastest-warming regions of the world, it will always be plunged into bitterly cold polar dark every winter. And year-by-year, for all kinds of natural reasons, there’s huge variety of the state of the ice.
                                </p>
                                <p>
                                    For a start, it does not automatically follow that a record amount of ice will melt this summer. More important for determining the size of the annual thaw is the state of the weather as the midnight sun approaches and temperatures rise. But over the more than 30 years of satellite records, scientists have observed a clear pattern of decline, decade-by-decade.
                                </p>
                                <p>The Arctic Ocean freezes every winter and much of the sea-ice then thaws every summer, and that process will continue whatever happens with climate change. Even if the Arctic continues to be one of the fastest-warming regions of the world, it will always be plunged into bitterly cold polar dark every winter. And year-by-year, for all kinds of natural reasons, there’s huge variety of the state of the ice.
                                </p>
                            </div>
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
        <script src="js/scrollNav" type="text/javascript"></script>
    </body>

</html>