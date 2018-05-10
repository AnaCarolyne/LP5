<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="0" bgcolor="#f9f9f9">
            <form action="FrontController?action=GravarConsulta" method="post">
                <tr>
                    <th colspan="5" bgcolor="#d4d4d4"><h2>CADASTRO DE CONSULTA</h2></th>
                </tr>
                <tr>
                    <td colspan="4">
                        Nome do Medico<br/>
                        <select style="width: 542px" name="txtNomeMedico">
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
                        <select style="width: 542px" name="txtNomePaciente">
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
                        <input type="txt" name="txtData">
                    </td>
                    <td>
                        Inicio<br/>
                        <select style="width: 150px" name="txtInicio">
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
                        Terminio<br/>
                        <select style="width: 150px" name="txtTerminio">
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
                        <textarea rows="4" cols="65" name="txtObs" maxlength="100"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Cadastrar">
                    </td>
                </tr>
            </form>
        </table>
        <table>
            <tr>
                <td>
                    <a href="index.jsp"><input type="submit" value="Inicio"></a>
                </td>
            </tr>

    </body>
</html>
