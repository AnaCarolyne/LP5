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
        <form action="FrontController?action=EditarMedico&acao=confirmarEditar&codigo=<c:out value="${medico.id}" />" method="post">
            <table border="0" bgcolor="#f9f9f9">
                <tr>
                    <th colspan="5" bgcolor="#d4d4d4"><h2>CADASTRO DE MEDICO</h2></th>
                </tr>
                <tr>
                    <td colspan="4">
                        Nome<br/>
                        <input type="text" size="98" name="txtNome" value="${medico.nome}">
                    </td>
                    <td>
                        CPF<br/>
                        <input type="text" name="txtCPF" value="${medico.cpf}">
                    </td>
                </tr>
                <tr>   
                    <td>
                        CEP<br/>
                        <input type="text" name="txtCEP" value="${medico.cep}">
                    </td>
                    <td colspan="4">
                        Endereço<br/>
                        <input type="text" size="98" name="txtEndereco" value="${medico.endereco}">
                    </td>

                </tr
                <tr>
                    <td>
                        Numero<br/>
                        <input type="text" name="txtNumero" value="${medico.numero}">
                    </td>
                    <td>
                        Complemento<br/>
                        <input type="text" name="txtComplemento" value="${medico.complemento}">
                    </td>
                    <td>
                        Bairro<br/>
                        <input type="text" name="txtBairro" value="${medico.bairro}">
                    </td>
                    <td>
                        Cidade<br/>
                        <select  style="width: 150px" name="txtCidade">
                            <option >Selecione</option>
                            <option value="BC"  <c:if test="${medico.cidade == 'BC'}"> selected</c:if>>Bicas</option>
                            <option value="JF"  <c:if test="${medico.cidade == 'JF'}"> selected</c:if>>Juiz de Fora</option>
                            </select>
                        </td>
                        <td>
                            Estado<br/>
                            <select name="txtEstado"> 
                                <option value="estado">Selecione o Estado</option> 
                                <option value="ac"  <c:if test="${medico.estado == 'ac'}"> selected</c:if>>Acre</option> 
                            <option value="al"  <c:if test="${medico.estado == 'al'}"> selected</c:if>>Alagoas</option> 
                            <option value="am"  <c:if test="${medico.estado == 'am'}"> selected</c:if>>Amazonas</option> 
                            <option value="ap"  <c:if test="${medico.estado == 'ap'}"> selected</c:if>>Amapá</option> 
                            <option value="ba"  <c:if test="${medico.estado == 'ba'}"> selected</c:if>>Bahia</option> 
                            <option value="ce"  <c:if test="${medico.estado == 'ce'}"> selected</c:if>>Ceará</option> 
                            <option value="df"  <c:if test="${medico.estado == 'df'}"> selected</c:if>>Distrito Federal</option> 
                            <option value="es"  <c:if test="${medico.estado == 'es'}"> selected</c:if>>Espírito Santo</option> 
                            <option value="go"  <c:if test="${medico.estado == 'go'}"> selected</c:if>>Goiás</option> 
                            <option value="ma"  <c:if test="${medico.estado == 'ma'}"> selected</c:if>>Maranhão</option> 
                            <option value="mt"  <c:if test="${medico.estado == 'mt'}"> selected</c:if>>Mato Grosso</option> 
                            <option value="ms"  <c:if test="${medico.estado == 'ms'}"> selected</c:if>>Mato Grosso do Sul</option> 
                            <option value="mg"  <c:if test="${medico.estado == 'mg'}"> selected</c:if>>Minas Gerais</option> 
                            <option value="pa"  <c:if test="${medico.estado == 'pa'}"> selected</c:if>>Pará</option> 
                            <option value="pb"  <c:if test="${medico.estado == 'pb'}"> selected</c:if>>Paraíba</option> 
                            <option value="pr"  <c:if test="${medico.estado == 'pr'}"> selected</c:if>>Paraná</option> 
                            <option value="pe"  <c:if test="${medico.estado == 'pe'}"> selected</c:if>>Pernambuco</option> 
                            <option value="pi"  <c:if test="${medico.estado == 'pi'}"> selected</c:if>>Piauí</option> 
                            <option value="rj"  <c:if test="${medico.estado == 'rj'}"> selected</c:if>>Rio de Janeiro</option> 
                            <option value="rn"  <c:if test="${medico.estado == 'rn'}"> selected</c:if>>Rio Grande do Norte</option> 
                            <option value="ro"  <c:if test="${medico.estado == 'ro'}"> selected</c:if>>Rondônia</option> 
                            <option value="rs"  <c:if test="${medico.estado == 'rs'}"> selected</c:if>>Rio Grande do Sul</option> 
                            <option value="rr"  <c:if test="${medico.estado == 'rr'}"> selected</c:if>>Roraima</option> 
                            <option value="sc"  <c:if test="${medico.estado == 'sc'}"> selected</c:if>>Santa Catarina</option> 
                            <option value="se"  <c:if test="${medico.estado == 'se'}"> selected</c:if>>Sergipe</option> 
                            <option value="sp"  <c:if test="${medico.estado == 'sp'}"> selected</c:if>>São Paulo</option> 
                            <option value="to"  <c:if test="${medico.estado == 'to'}"> selected</c:if>>Tocantins</option> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Email<br/>
                            <input type="text" size="98" name="txtEmail" value="${medico.email}" >
                    </td>
                    <td>
                        Data Nascimento<br/>
                        <input type="text" name="txtDataNasc" value="${medico.dataNasc}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Sexo<br/>
                        <select  style="width: 150px" name="txtSexo">
                            <option>Sexo</option>
                            <option value="M"  <c:if test="${medico.sexo == 'M'}"> selected</c:if> >Masculino</option>
                            <option value="F"  <c:if test="${medico.sexo == 'F'}"> selected</c:if>>Feminino</option>
                            </select>
                        </td>
                        <td>
                            Telefone<br/>
                            <input type="text" name="txtTel" value="${medico.tel}">
                    </td>
                    <td>
                        Celular<br/>
                        <input type="text" name="txtCel" value="${medico.cel}">
                    </td>
                    <td>
                        Especialização<br/>
                        <input type="text" name="txtEsp" value="${medico.especializacao}">
                    </td>
                    <td>
                        CRM<br/>
                        <input type="text" name="txtCRM" value="${medico.crm}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Status<br/>
                        <select  style="width: 150px" name="txtStatus">
                            <option>Selecione</option>
                            <option value="Cadastrado"  <c:if test="${medico.status == 'Cadastrado'}"> selected</c:if> >Cadastrado</option>
                            <option value="Demitido"  <c:if test="${medico.status == 'Demitido'}"> selected</c:if>>Demitido</option>
                            <option value="Transferido"  <c:if test="${medico.status == 'Transferido'}"> selected</c:if>>Transferido</option>
                            <option value="Substituto"  <c:if test="${medico.status == 'Substituto'}"> selected</c:if>>Substituto</option>
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
