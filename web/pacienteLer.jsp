<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Pesquisar paciente</title>
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <link rel="script" href="js/js.js"/>
    </head>
    <body onload="msg()">
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
                        <li><a href="FrontController?action=LerPaciente" class="pesqat">Paciente</a></li>
                        <li><a href="FrontController?action=LerConsulta&acao=LerDados" class="pesqt">Consulta</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCorConsulta">
                <tr>
                    <td colspan="18" class="tbTituloNome">Lista de Pacientes</td>
                </tr>
                <tr>
                    <td class="titleP"> Nome</td>
                    <td class="titleP"> Email</td>
                    <td class="titleP"> Data Nasc.</td>
                    <td class="titleP"> Sexo</td>
                    <td class="titleP"> Telefone</td>
                    <td class="titleP"> Convenio</td>
                    <td class="titleP"> Status</td>
                    <td class="acao" colspan="3"> Ação</td>  
                </tr>
                <c:forEach items="${pacientes}" var="paciente">
                    <tr>
                        <td class="title"> <c:out value="${paciente.nome}" />
                        <td class="title"> <c:out value="${paciente.email}" />
                        <td class="title"> <c:out value="${paciente.dataNasc}" />
                        <td class="title"> <c:out value="${paciente.sexo}" />
                        <td class="title"> <c:out value="${paciente.tel}" />
                        <td class="title"> <c:out value="${paciente.convenio}" />
                        <td class="title"> <c:out value="${paciente.status}" />
                        <td class="acao">
                            <a href="FrontController?action=PrepararEditarPaciente&codigo=<c:out value="${paciente.id}" />"><input type="submit" value="" class="btnOpEditar"></a>
                            <a href="FrontController?action=ApagarPaciente&codigo=<c:out value="${paciente.id}" />"><input type="submit" value="" class="btnOpDeletar"></a>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="18">
                        <a  href="index.jsp"><input type="submit" value="Inicio" class="btnOpMenu"></a>
                        <a  href=""><input type="submit" value="Notificação" class="btnOpMenu" onclick="fechar(1)"></a>
                    </td>
                </tr>
            </table>
            <div id="mensagem">
                <table class="msg">
                    <tr>
                        <td class="tbTituloNome">Notificação</td>
                    </tr>
                    <c:forEach items="${consultas}" var="consulta">
                        <tr>
                            <td class="descMsg">
                                <c:out value="${consulta.paciente}" /><c:out value="${paciente}" /><c:out value="${consulta.medico}" />
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td >
                            <input type="submit" value="Fechar" class="btnOpMenu" onclick="fechar(0)">
                        </td>
                    </tr>
                </table>
                <div>
                </div>
                <script language="javascript">
                    function msg() {
                        document.getElementById('mensagem').style.display = "block";

                    }
                    function fechar(n) {
                        if (n == 0) {
                            document.getElementById('mensagem').style.display = "none";
                        } else {
                            document.getElementById('mensagem').style.display = "block";
                        }

                    }
                </script>
                </body>
                </html>