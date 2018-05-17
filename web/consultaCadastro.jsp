<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro consulta</title>
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
                        <li><a href="FrontController?action=LerConsulta" class="pesqt">Consulta</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCor">
                <form action="FrontController?action=GravarConsulta" method="post">
                    <tr>
                        <td colspan="5" class="tbTituloNome">Cadastro de consuta</td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome do Medico<br/>
                            <select class="nomeSelect" name="txtNomeMedico">
                                <option>Selecione</option>
                                <c:forEach items="${medicos}" var="medico">   
                                    <option value="${medico.nome}"><c:out value="${medico.nome}" /></option> 
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome do Paciente<br/>
                            <select class="nomeSelect" name="txtNomePaciente">
                                <option>Selecione</option>
                                <c:forEach items="${pacientes}" var="paciente">   
                                    <option value="${paciente.nome}"><c:out value="${paciente.nome}" /></option> 
                                </c:forEach>
                            </select>
                        </td>
                    </tr>             
                    <tr>
                        <td>
                            Data<br/>
                            <input type="date" name="txtData">
                        </td>
                        <td>
                            Inicio<br/>
                            <select class="horaSelect" name="txtInicio">
                                <option>Selecione</option> 
                                <option value="05:30">05:30</option>
                                <option value="06:00">06:00</option>
                                <option value="06:30">06:30</option>
                                <option value="07:00">07:00</option>
                                <option value="07:30">07:30</option>
                                <option value="08:00">08:00</option>
                                <option value="08:30">08:30</option>
                                <option value="09:00">09:00</option>
                                <option value="09:30">09:30</option>
                                <option value="10:30">10:30</option>
                                <option value="11:00">11:00</option>
                                <option value="11:30">11:30</option>
                                <option value="02:30">02:30</option>
                                <option value="02:00">02:00</option>
                                <option value="03:30">03:30</option>
                                <option value="03:00">03:00</option>
                                <option value="04:30">04:30</option>
                                <option value="04:00">04:00</option>
                            </select>
                        </td>
                        <td>
                            Termino<br/>
                            <select class="horaSelect" name="txtTerminio">
                                <option>Selecione</option> 
                                <option value="05:30">05:30</option>
                                <option value="06:00">06:00</option>
                                <option value="06:30">06:30</option>
                                <option value="07:00">07:00</option>
                                <option value="07:30">07:30</option>
                                <option value="08:00">08:00</option>
                                <option value="08:30">08:30</option>
                                <option value="09:00">09:00</option>
                                <option value="09:30">09:30</option>
                                <option value="10:30">10:30</option>
                                <option value="11:00">11:00</option>
                                <option value="11:30">11:30</option>
                                <option value="02:30">02:30</option>
                                <option value="02:00">02:00</option>
                                <option value="03:30">03:30</option>
                                <option value="03:00">03:00</option>
                                <option value="04:30">04:30</option>
                                <option value="04:00">04:00</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Observação<br/>
                            <textarea rows="4" cols="65" name="txtObs" maxlength="100" class="obsconsulta"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="index.jsp" class="btnOptxt"> Inicio</a>
                            <input type="submit" value="Cadastrar" class="btnOpMenu">
                        </td>
                    </tr>
                </form>
            </table>
        </div>
    </body>
</html>
