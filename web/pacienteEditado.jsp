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
        <form action="FrontController?action=EditarPaciente&acao=confirmarEditar&codigo=<c:out value="${paciente.id}" />" method="post">
            <table border="0" bgcolor="#f9f9f9">
                <tr>
                    <th colspan="5" bgcolor="#d4d4d4"><h2>CADASTRO DE PACIENTE</h2></th>
                </tr>
                <tr>
                    <td colspan="4">
                        Nome<br/>
                        <input type="text" size="98" name="txtNome" value="${paciente.nome}">
                    </td>
                    <td>
                        CPF<br/>
                        <input type="text" name="txtCPF" value="${paciente.cpf}">
                    </td>
                </tr>
                <tr>   
                    <td>
                        CEP<br/>
                        <input type="text" name="txtCEP" value="${paciente.cep}">
                    </td>
                    <td colspan="4">
                        Endereço<br/>
                        <input type="text" size="98" name="txtEndereco" value="${paciente.endereco}">
                    </td>

                </tr
                <tr>
                    <td>
                        Numero<br/>
                        <input type="text" name="txtNumero" value="${paciente.numero}">
                    </td>
                    <td>
                        Complemento<br/>
                        <input type="text" name="txtComplemento" value="${paciente.complemento}">
                    </td>
                    <td>
                        Bairro<br/>
                        <input type="text" name="txtBairro" value="${paciente.bairro}">
                    </td>
                    <td>
                        Cidade<br/>
                        <select  style="width: 150px" name="txtCidade">
                            <option > - - - -</option>
                            <option value="BC"  <c:if test="${paciente.cidade == 'BC'}"> selected</c:if>>Bicas</option>
                            <option value="JF"  <c:if test="${paciente.cidade == 'JF'}"> selected</c:if>>Juiz de Fora</option>
                            </select>
                        </td>
                        <td>
                            Estado<br/>
                            <select name="txtEstado"> 
                                <option value="estado">Selecione o Estado</option> 
                                <option value="ac"  <c:if test="${paciente.estado == 'ac'}"> selected</c:if>>Acre</option> 
                            <option value="al"  <c:if test="${paciente.estado == 'al'}"> selected</c:if>>Alagoas</option> 
                            <option value="am"  <c:if test="${paciente.estado == 'am'}"> selected</c:if>>Amazonas</option> 
                            <option value="ap"  <c:if test="${paciente.estado == 'ap'}"> selected</c:if>>Amapá</option> 
                            <option value="ba"  <c:if test="${paciente.estado == 'ba'}"> selected</c:if>>Bahia</option> 
                            <option value="ce"  <c:if test="${paciente.estado == 'ce'}"> selected</c:if>>Ceará</option> 
                            <option value="df"  <c:if test="${paciente.estado == 'df'}"> selected</c:if>>Distrito Federal</option> 
                            <option value="es"  <c:if test="${paciente.estado == 'es'}"> selected</c:if>>Espírito Santo</option> 
                            <option value="go"  <c:if test="${paciente.estado == 'go'}"> selected</c:if>>Goiás</option> 
                            <option value="ma"  <c:if test="${paciente.estado == 'ma'}"> selected</c:if>>Maranhão</option> 
                            <option value="mt"  <c:if test="${paciente.estado == 'mt'}"> selected</c:if>>Mato Grosso</option> 
                            <option value="ms"  <c:if test="${paciente.estado == 'ms'}"> selected</c:if>>Mato Grosso do Sul</option> 
                            <option value="mg"  <c:if test="${paciente.estado == 'mg'}"> selected</c:if>>Minas Gerais</option> 
                            <option value="pa"  <c:if test="${paciente.estado == 'pa'}"> selected</c:if>>Pará</option> 
                            <option value="pb"  <c:if test="${paciente.estado == 'pb'}"> selected</c:if>>Paraíba</option> 
                            <option value="pr"  <c:if test="${paciente.estado == 'pr'}"> selected</c:if>>Paraná</option> 
                            <option value="pe"  <c:if test="${paciente.estado == 'pe'}"> selected</c:if>>Pernambuco</option> 
                            <option value="pi"  <c:if test="${paciente.estado == 'pi'}"> selected</c:if>>Piauí</option> 
                            <option value="rj"  <c:if test="${paciente.estado == 'rj'}"> selected</c:if>>Rio de Janeiro</option> 
                            <option value="rn"  <c:if test="${paciente.estado == 'rn'}"> selected</c:if>>Rio Grande do Norte</option> 
                            <option value="ro"  <c:if test="${paciente.estado == 'ro'}"> selected</c:if>>Rondônia</option> 
                            <option value="rs"  <c:if test="${paciente.estado == 'rs'}"> selected</c:if>>Rio Grande do Sul</option> 
                            <option value="rr"  <c:if test="${paciente.estado == 'rr'}"> selected</c:if>>Roraima</option> 
                            <option value="sc"  <c:if test="${paciente.estado == 'sc'}"> selected</c:if>>Santa Catarina</option> 
                            <option value="se"  <c:if test="${paciente.estado == 'se'}"> selected</c:if>>Sergipe</option> 
                            <option value="sp"  <c:if test="${paciente.estado == 'sp'}"> selected</c:if>>São Paulo</option> 
                            <option value="to"  <c:if test="${paciente.estado == 'to'}"> selected</c:if>>Tocantins</option> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Email<br/>
                            <input type="text" size="98" name="txtEmail" value="${paciente.email}" >
                    </td>
                    <td>
                        Data Nascimento<br/>
                        <input type="text" name="txtDataNasc" value="${paciente.dataNasc}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Sexo<br/>
                        <select  style="width: 150px" name="txtSexo">
                            <option>Sexo</option>
                            <option value="M"  <c:if test="${paciente.sexo == 'M'}"> selected</c:if> >Masculino</option>
                            <option value="F"  <c:if test="${paciente.sexo == 'F'}"> selected</c:if>>Feminino</option>
                            </select>
                        </td>
                        <td>
                            Telefone<br/>
                            <input type="text" name="txtTel" value="${paciente.tel}">
                    </td>
                    <td>
                        Celular<br/>
                        <input type="text" name="txtCel" value="${paciente.cel}">
                    </td>
                    <td colspan="2">
                        Convenio<br/>
                        <select  style="width: 300px" name="txtConvenio">
                            <option> - - - - - </option>
                            <option value="SUS"  <c:if test="${paciente.convenio == 'SUS'}"> selected</c:if>>SUS</option>
                            <option value="OUT"  <c:if test="${paciente.convenio == 'OUT'}"> selected</c:if>>OUTRO</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Status<br/>
                            <select name="txtStatus">
                                <option>Selecione</option>
                                <option value="Cadastrado"  <c:if test="${paciente.status == 'Cadastrado'}"> selected</c:if> >Cadastrado</option>
                            <option value="Transferido"  <c:if test="${paciente.status == 'Transferido'}"> selected</c:if>>Transferido</option>
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
            <br/><br/>
        <c:out value="${r}" /><br/>
    </body>
</html>
