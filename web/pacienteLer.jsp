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
        <table border="1" bgcolor="#f9f9f9" cellspacing="0" cellpadding="5">
            <tr>
                <th  colspan="18" bgcolor="#d4d4d4"> <h1>Lista de Pacientes</h1></th>
            </tr>
            <tr>
                <th class="title"> Nome </th>
                <th class="title"> CPF</th>
                <th class="title"> CEP</th>
                <th class="title"> Numero</th>
                <th class="title"> Complemento</th>
                <th class="title"> Endereço</th>
                <th class="title"> Bairro</th>
                <th class="title"> Cidade</th>
                <th class="title"> Estado</th>
                <th class="title"> Email</th>
                <th class="title"> Data Nasc.</th>
                <th class="title"> Sexo</th>
                <th class="title"> Telefone</th>
                <th class="title"> Celular</th>
                <th class="title"> Convenio</th>
                <th class="title"> Status</th>

                <th class="title" colspan="2"> Ação</th>  
            </tr>
            <c:forEach items="${pacientes}" var="paciente">
                <tr>
                    <td> <c:out value="${paciente.nome}" />
                    <td> <c:out value="${paciente.cpf}" />
                    <td> <c:out value="${paciente.cep}" />
                    <td> <c:out value="${paciente.numero}" />
                    <td> <c:out value="${paciente.complemento}" />
                    <td> <c:out value="${paciente.endereco}" />
                    <td> <c:out value="${paciente.bairro}" />
                    <td> <c:out value="${paciente.cidade}" />
                    <td> <c:out value="${paciente.estado}" />
                    <td> <c:out value="${paciente.email}" />
                    <td> <c:out value="${paciente.dataNasc}" />
                    <td> <c:out value="${paciente.sexo}" />
                    <td> <c:out value="${paciente.tel}" />
                    <td> <c:out value="${paciente.cel}" />
                    <td> <c:out value="${paciente.convenio}" />
                    <td> <c:out value="${paciente.status}" />
                    <td >
                        <a href="FrontController?action=EditarPaciente&acao=prepararEditar&codigo=<c:out value="${paciente.id}" />"><input type="submit" value="Editar"></a>
                    </td>
                    <td>
                        <a href="FrontController?action=ApagarPaciente&codigo=<c:out value="${paciente.id}" />"><input type="submit" value="Deletar"></a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td bgcolor="#d4d4d4" colspan="18">
                    <a  href="index.jsp"><input type="submit" value="Inicio"></a>
                </td>
            </tr>
        </table>
        <c:forEach items="${consultas}" var="consulta">
            <c:out value="${consulta.paciente}" /><c:out value="${paciente}" /><c:out value="${consulta.medico}" /><br/>
        </c:forEach>
    </body>
</html>