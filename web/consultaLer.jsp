<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" bgcolor="#f9f9f9" cellspacing="0" cellpadding="5" style="width: 700px">
            <tr>
                <th  colspan="18" bgcolor="#d4d4d4"> <h1>Lista de Consultas</h1></th>
            </tr>
            <tr>
                <th class="title"> Medico </th>
                <th class="title"> Paciente</th>
                <th class="title"> Data</th>
                <th class="title"> Hora de Inicio</th>
                <th class="title"> Hora de Termino</th>
                <th class="title"> Observaçãoo</th>
                

                <th class="title" colspan="2"> Ação</th>  
            </tr>
            <c:forEach items="${consultas}" var="consulta">
                <tr>
                    <td> <c:out value="${consulta.medico}" /></td>
                    <td> <c:out value="${consulta.paciente}" /></td>
                    <td> <c:out value="${consulta.horaTerminio}" /></td>
                    <td> <c:out value="${consulta.horaInicio}" /></td>
                    <td> <c:out value="${consulta.data}" /></td>
                    <td> <c:out value="${consulta.observacao}" /></td>
                   
                    <td >
                        <a href="FrontController?action=EditarConsulta&acao=prepararEditar&codigo=<c:out value="${consulta.id}" />"><input type="submit" value="Editar"></a>
                    </td>
                    <td>
                        <a href="FrontController?action=ApagarConsulta&codigo=<c:out value="${consulta.id}" />"><input type="submit" value="Deletar"></a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td bgcolor="#d4d4d4" colspan="18">
                    <a  href="index.jsp"><input type="submit" value="Inicio"></a>
                </td>
            </tr>
        </table>

    </body>
</html>