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
        <table border="1" bgcolor="#f9f9f9">
            <form action="FrontController?action=EditarConsulta&acao=confirmarEditar&codigo=<c:out value="${consulta.id}" />" method="post">
                <tr>
                    <th colspan="5" bgcolor="#d4d4d4"><h2>CADASTRO DE CONSULTA</h2></th>
                </tr>
                <tr>
                    <td colspan="3">
                        Nome do Medico<br/>
                        <input type="text" size="76" name="txtNomeMedico"value="${consulta.medico}">
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        Nome do Paciente<br/>
                        <input type="text" size="76" name="txtNomePaciente"value="${consulta.paciente}">
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
