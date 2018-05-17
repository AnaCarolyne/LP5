<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Pesquisar enfermeiro</title>
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
                        <li><a href="FrontController?action=LerEnfermeiro" class="pesqat">Enfermeiro</a></li>
                        <li><a href="FrontController?action=LerPaciente" class="pesqt">Paciente</a></li>
                        <li><a href="FrontController?action=LerConsulta" class="pesqt">Consulta</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCorConsulta">
                <tr>
                    <td colspan="18" class="tbTituloNome">Lista de Enfermeiros</td>
                </tr>
                <tr>
                    <td class="titleP"> Nome </td>
                    <td class="titleP"> Email</td>
                    <td class="titleP"> Sexo</td>
                    <td class="titleP"> Celular</td>
                    <td class="titleP"> Status</td>
                    <td class="acao" colspan="2"> Ação</td>  
                </tr>
                <c:forEach items="${enfermeiros}" var="enfermeiro">
                    <tr>
                        <td class="title"> <c:out value="${enfermeiro.nome}" />
                        <td class="title"> <c:out value="${enfermeiro.email}" />
                        <td class="title"> <c:out value="${enfermeiro.sexo}" />
                        <td class="title"> <c:out value="${enfermeiro.cel}" />
                        <td class="title"> <c:out value="${enfermeiro.status}"/>
                        <td class="acao">
                            <a href="FrontController?action=PrepararEditarEnfermeiro&codigo=<c:out value="${enfermeiro.id}" />"><input type="submit" value="" class="btnOpEditar"></a>
                            <a href="FrontController?action=ApagarEnfermeiro&codigo=<c:out value="${enfermeiro.id}" />"><input type="submit" value="" class="btnOpDeletar"></a>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td bgcolor="#d4d4d4" colspan="18">
                        <a  href="index.jsp"><input type="submit" value="Inicio" class="btnOpMenu"></a>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>