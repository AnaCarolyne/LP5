<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="0" bgcolor="#f9f9f9" cellpadding="10" cellspacing="0" >
            <tr>
                <th bgcolor="#d4d4d4" colspan="8"> <h2>Sistema de Posto de Saúde</h2></th>      
            </tr>
            <tr>
                <td>
                    <a href="medicoCadastro.jsp"><input type="submit" value="Cadastrar Medico"></a>
                </td>
                <td>
                    <a href="enfermeiroCadastro.jsp"><input type="submit" value="Cadastrar Enfermeiro"></a>
                </td>
                <td>
                    <a href="pacienteCadastro.jsp"><input type="submit" value="Cadastrar Paciente"></a>
                </td>
                <td>
                    <a href="FrontController?action=LerConsulta&acao=prepararDados"><input type="submit" value="Cadastrar Consulta"></a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="FrontController?action=LerMedico"><input type="submit" value="Pesquisar Medico"></a>
                </td>
                <td>
                    <a href="FrontController?action=LerEnfermeiro"><input type="submit" value="Pesquisar Enfermeiro"></a>
                </td>
                <td>
                    <a href="FrontController?action=LerPaciente"><input type="submit" value="Pesquisar Paciente"></a>
                </td>
                <td>
                    <a href="FrontController?action=LerConsulta&acao=LerDados"><input type="submit" value="Pesquisar Consulta"></a>
                </td>
            </tr>

        </table>
        <br>

        <%--
        This example uses JSTL, uncomment the taglib directive above.
        To test, display the page like this: index.jsp?sayHello=true&name=Murphy
        --%>
        <%--
        <c:if test="${param.sayHello}">
            <!-- Let's welcome the user ${param.name} -->
            Hello ${param.name}!
        </c:if>
        --%>

    </body>
</html>
