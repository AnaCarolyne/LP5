<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Consulta editar</title>   
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
                    <li><a href="consultaCadastro.jsp" class="mc2">Consulta</a></li>
                </ul>
                <div id="pesq">
                    <ul id="menuPesquisas">
                        <li class="pesqTitulo">Pesquisa:</li>
                        <li><a href="FrontController?action=LerMedico" class="pesqt">Medico</a></li>
                        <li><a href="FrontController?action=LerEnfermeiro" class="pesqt">Enfermeiro</a></li>
                        <li><a href="FrontController?action=LerPaciente" class="pesqt">Paciente</a></li>
                        <li><a href="FrontController?action=LerConsulta&acao=LerDados" class="pesqt">Consulta</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCor">
                <form action="FrontController?action=EditarConsulta&codigo=<c:out value="${consulta.id}" />" method="post">
                    <tr>
                        <th colspan="5"  class="tbTituloNome">Cadastro consulta</td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome do Medico<br/>
                            <input class="txt" type="text"  name="txtNomeMedico"value="${consulta.medico}">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome do Paciente<br/>
                            <input class="txt" type="text" name="txtNomePaciente"value="${consulta.paciente}">
                        </td>
                    </tr>             
                    <tr>
                        <td>
                            Data<br/>
                            <input type="text" name="txtData"value="${consulta.data}">
                        </td>
                        <td>
                            Inicio<br/>
                            <input type="text" name="txtInicio"value="${consulta.horaInicio}">
                        </td>
                        <td>
                            Terminio<br/>
                            <input type="text" name="txtTerminio"value="${consulta.horaTerminio}">
                        </td>
                        <td>
                            Observação<br/>
                            <input type="text" name="txtObs"value="${consulta.observacao}">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="index.jsp"><input type="submit" value="Inicio" class="btnOptxt2"></a>
                            <input type="submit" value="Cadastrar" class="btnOpMenu">
                        </td>
                    </tr>
                </form>
            </table>
        </div>
    </body>
</html>
