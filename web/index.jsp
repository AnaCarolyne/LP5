<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>SPS</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/css.css">
    </head>
    <body>
        <div id="top">
            <div id="titulo">
                <img src="img/logo.png" class="imgLogo">
                <div id="logo">
                    <h1 id="nomeTitulo">Posto de Saúde</h1>
                    <h1 id="subTitulo">Linguagem de programação 5</h1>
                </div>
                <ul id="menuCadastros">
                    <li>Cadastro:</li>
                    <li class="mc"><a href="medicoCadastro.jsp">Medico</a></li>
                    <li class="mc"><a href="enfermeiroCadastro.jsp">Enfermeiro</a></li>
                    <li class="mc"><a href="pacienteCadastro.jsp">Paciente</a></li>
                    <li class="mc"><a href="FrontController?action=PrepararLerConsulta">Consulta</a></li>
                </ul>
                <div id="pesq">
                     <ul id="menuPesquisas">
                    <li class="pesqTitulo">Pesquisa:</li>
                    <li><a href="FrontController?action=LerMedico" class="pesqt">Medico</a></li>
                    <li><a href="FrontController?action=LerEnfermeiro" class="pesqt">Enfermeiro</a></li>
                    <li><a href="FrontController?action=LerPaciente" class="pesqt">Paciente</a></li>
                    <li><a href="FrontController?action=LerConsulta" class="pesqt">Consulta</a></li>
                </ul>
                </div>
            </div>
        </div>
        <img src="img/si.png" id="imghome">
    </body>
</html>
