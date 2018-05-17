<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Pesquisa consulta</title>
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
                    <li class="mc"><a href="consultaCadastro.jsp">Consulta</a></li>
                </ul>
                <div id="pesq">
                    <ul id="menuPesquisas">
                        <li class="pesqTitulo">Pesquisa:</li>
                        <li><a href="FrontController?action=LerMedico" class="pesqt">Medico</a></li>
                        <li><a href="FrontController?action=LerEnfermeiro" class="pesqt">Enfermeiro</a></li>
                        <li><a href="FrontController?action=LerPaciente" class="pesqt">Paciente</a></li>
                        <li><a href="FrontController?action=LerConsulta" class="pesqat">Consulta</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCorConsulta">
                <tr>
                    <td  colspan="18" class="tbTituloNome">Lista de Consultas</td>
                </tr>
                <tr>
                    <td class="titleP"> Medico </td>
                    <td class="titleP"> Paciente</td>
                    <td class="titleP"> Data</td>
                    <td class="titleP"> Hora de Inicio</td>
                    <td class="titleP"> Hora de Termino</td>
                    <td class="titleP"> Observaçãoo</td>
                    <td class="acao" colspan="2"> Ação</td>  
                </tr>
                <c:forEach items="${consultas}" var="consulta">
                    <tr>
                        <td class="title"> <c:out value="${consulta.medico}" /></td>
                        <td class="title"> <c:out value="${consulta.paciente}" /></td>
                        <td class="title"> <c:out value="${consulta.horaTerminio}" /></td>
                        <td class="title"> <c:out value="${consulta.horaInicio}" /></td>
                        <td class="title"> <c:out value="${consulta.data}" /></td>
                        <td class="title"> <c:out value="${consulta.observacao}" /></td>

                        <td class="acao" >
                            <a href="FrontController?action=PrepararEditarConsulta&codigo=<c:out value="${consulta.id}" />"><input type="" value="" class="btnOpEditar"></a>
                            <a href="FrontController?action=ApagarConsulta&codigo=<c:out value="${consulta.id}" />"><input type="submit" value="" class="btnOpDeletar"></a>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="18">
                        <a  href="index.jsp"><input type="submit" value="Inicio" class="btnOpMenu"></a>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>