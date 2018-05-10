<%-- 
    Document   : pacienteCadastro
    Created on : 02/05/2018, 19:35:37
    Author     : Ana
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FrontController?action=GravarPaciente" method="post">
            <table border="0" bgcolor="#f9f9f9">
                <tr>
                    <th colspan="5" bgcolor="#d4d4d4"><h2>CADASTRO DE PACIENTE</h2></th>
                </tr>
                <tr>
                    <td colspan="4">
                        Nome<br/>
                        <input type="text" size="98" name="txtNome">
                    </td>
                    <td>
                        CPF<br/>
                        <input type="text" name="txtCPF">
                    </td>
                </tr>
                <tr>   
                    <td>
                        CEP<br/>
                        <input type="text" name="txtCEP">
                    </td>
                    <td colspan="4">
                        Endere�o<br/>
                        <input type="text" size="98" name="txtEndereco">
                    </td>

                </tr
                <tr>
                    <td>
                        Numero<br/>
                        <input type="text" name="txtNumero">
                    </td>
                    <td>
                        Complemento<br/>
                        <input type="text" name="txtComplemento">
                    </td>
                    <td>
                        Bairro<br/>
                        <input type="text" name="txtBairro">
                    </td>
                    <td>
                        Cidade<br/>
                        <select  style="width: 150px" name="txtCidade">
                            <option>Selecione</option>
                            <option value="BC">Bicas</option>
                            <option value="JF">Juiz de Fora</option>
                        </select>
                    </td>
                    <td>
                        Estado<br/>
                        <select name="txtEstado"> 
                            <option value="estado">Selecione o Estado</option> 
                            <option value="ac">Acre</option> 
                            <option value="al">Alagoas</option> 
                            <option value="am">Amazonas</option> 
                            <option value="ap">Amap�</option> 
                            <option value="ba">Bahia</option> 
                            <option value="ce">Cear�</option> 
                            <option value="df">Distrito Federal</option> 
                            <option value="es">Esp�rito Santo</option> 
                            <option value="go">Goi�s</option> 
                            <option value="ma">Maranh�o</option> 
                            <option value="mt">Mato Grosso</option> 
                            <option value="ms">Mato Grosso do Sul</option> 
                            <option value="mg">Minas Gerais</option> 
                            <option value="pa">Par�</option> 
                            <option value="pb">Para�ba</option> 
                            <option value="pr">Paran�</option> 
                            <option value="pe">Pernambuco</option> 
                            <option value="pi">Piau�</option> 
                            <option value="rj">Rio de Janeiro</option> 
                            <option value="rn">Rio Grande do Norte</option> 
                            <option value="ro">Rond�nia</option> 
                            <option value="rs">Rio Grande do Sul</option> 
                            <option value="rr">Roraima</option> 
                            <option value="sc">Santa Catarina</option> 
                            <option value="se">Sergipe</option> 
                            <option value="sp">S�o Paulo</option> 
                            <option value="to">Tocantins</option> 
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        Email<br/>
                        <input type="text" size="98" name="txtEmail">
                    </td>
                    <td>
                        Data Nascimento<br/>
                        <input type="text" name="txtDataNasc">
                    </td>
                </tr>
                <tr>
                    <td>
                        Genero<br/>
                        <select  style="width: 150px" name="txtSexo">
                            <option>Sexo</option>
                            <option value="M">Masculino</option>
                            <option value="F">Feminino</option>
                        </select>
                    </td>
                    <td>
                        Telefone<br/>
                        <input type="text" name="txtTel">
                    </td>
                    <td>
                        Celular<br/>
                        <input type="text" name="txtCel">
                    </td>
                    <td colspan="2">
                        Convenio<br/>
                        <select  style="width: 300px" name="txtConvenio">
                            <option>Selecione</option>
                            <option value="SUS">SUS</option>
                            <option value="Out">OUTRO</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        Estado<br/>
                        <select  style="width: 300px" name="txtStatus">
                            <option>Selecione</option>
                            <option value="Cadastrado">Cadastrado</option>
                            <option value="Trasnferido">Transferido</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>

                        <input type="submit" value="Cadastrar">
                    </td>
                </tr>

            </table>
        </form>
        <table>
            <tr>
                <td>
                    <a href="index.jsp"><input type="submit" value="Inicio"></a>
                </td>
            </tr>
        </table>

    </body>
</html>