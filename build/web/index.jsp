<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    
    <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    <!-- <link rel="stylesheet" href="/Inventario/public/css/all.min.css"> -->
    <!-- <link rel="stylesheet" href="/Inventario/public/css/fontawesome.min.css"> -->
    <title>Inicio de sesión</title>
    <link rel="stylesheet" href="/Inventario/public/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/Inventario/public/css/style.css">
    <link href="/Inventario/public/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>

<body>
    <img class="wave" src="public/img/wave.png">
    <div class="container">
        <div class="img">
            <!-- <img src="img/bg.svg"> -->
            <img src="public/img/logo-ddc.png">
        </div>
        <div class="login-content">
            <form method="POST" action="">
                <!-- <img src="img/avatar.svg"> -->
                <h2 class="title">BIENVENIDO</h2>
                
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div class="div">
                        <h5>Usuario</h5>
                        <input id="usuario" type="text" class="input" name="usuario" value="">
                    </div>
                </div>
                <div class="input-div pass">
                    <div class="i">
                        <i class="fas fa-lock"></i>
                    </div>
                    <div class="div">
                        <h5>Contraseña</h5>
                        <input type="password" id="input" class="input" name="password">
                    </div>
                </div>
                <div class="view">
                    <div class="fas fa-eye verPassword" onclick="vista()" id="verPassword"></div>
                </div>
                <input name="btningresar" class="bton" title="click para ingresar" type="submit" value="INICIAR SESION">
            </form>
        </div>
    </div>
    <script src="public/js/fontawesome.js"></script>
    <script src="public/js/main.js"></script>
    <script src="public/js/main2.js"></script>
    <script src="public/js/jquery.min.js"></script>
    <script src="public/js/bootstrap.js"></script>
    <script src="public/js/bootstrap.bundle.js"></script>

</body>

</html>
