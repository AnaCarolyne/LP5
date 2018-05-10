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
                <th  colspan="18" bgcolor="#d4d4d4"> <h1>Lista de Medicos</h1></th>
            </tr>
            <tr>
                <th class="title"> Nome </th>
                <th class="title"> CPF</th>
                <th class="title"> Numero</th>
                <th class="title"> Complemento</th>
                <th class="title"> Bairro</th>
                <th class="title"> Cidade</th>
                <th class="title"> Estado</th>
                <th class="title"> Email</th>
                <th class="title"> Data Nasc.</th>
                <th class="title"> Sexo</th>

                <th class="title"> Celular</th>
                <th class="title"> Especialização</th>
                <th class="title"> CRM</th>
                <th class="title"> Status</th>

                <th class="title" colspan="3"> Ação</th>  
            </tr>
            <c:forEach items="${medicos}" var="medico">
                <tr>
                    <td> <c:out value="${medico.nome}" />
                    <td> <c:out value="${medico.cpf}" />
                    <td> <c:out value="${medico.numero}" />
                    <td> <c:out value="${medico.complemento}" />
                    <td> <c:out value="${medico.bairro}" />
                    <td> <c:out value="${medico.cidade}" />
                    <td> <c:out value="${medico.estado}" />
                    <td> <c:out value="${medico.email}" />
                    <td> <c:out value="${medico.dataNasc}" />
                    <td> <c:out value="${medico.sexo}" />

                    <td> <c:out value="${medico.cel}" />
                    <td> <c:out value="${medico.especializacao}" />
                    <td> <c:out value="${medico.crm}" />
                    <td><c:out value="${medico.status}" />
                    <td >
                        <a href="FrontController?action=EditarMedico&acao=prepararEditar&codigo=<c:out value="${medico.id}" />"><input type="submit" value="Editar"></a>
                    </td>
                    <td>
                        <a href="FrontController?action=ApagarMedico&codigo=<c:out value="${medico.id}" />"><input type="submit" value="Deletar"></a>
                    </td>
                    <td>
                        <a href="FrontController?action=RefazerMedico&codigo=<c:out value="${medico.id}" />"><input type="submit" value="Refazer"></a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td bgcolor="#d4d4d4" colspan="19">
                    <a  href="index.jsp"><input type="submit" value="Inicio"></a>
                </td>
            </tr>
        </table>
    </body>
</html>