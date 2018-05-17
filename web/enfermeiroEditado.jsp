<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Enfermeiro editar</title>
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
                    <li class="mc"><a href="medicoCadastro.jsp" >Medico</a></li>
                    <li><a href="enfermeiroCadastro.jsp"class="mc2">Enfermeiro</a></li>
                    <li class="mc"><a href="pacienteCadastro.jsp">Paciente</a></li>
                    <li class="mc"><a href="consultaCadastro.jsp">Consulta</a></li>
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
            <form action="FrontController?action=EditarEnfermeiro&codigo=<c:out value="${enfermeiro.id}" />" method="post">
                <table class="tbCor">
                     <tr>
                        <td colspan="5" class="tbTituloNome">Cadastro enfermeiro</td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome<br/>
                            <input type="text" size="98" name="txtNome" value="${enfermeiro.nome}">
                        </td>
                        <td>
                            CPF<br/>
                            <input type="text" name="txtCPF" value="${enfermeiro.cpf}">
                        </td>
                    </tr>
                    <tr>   
                        <td>
                            CEP<br/>
                            <input type="text" name="txtCEP" value="${enfermeiro.cep}">
                        </td>
                        <td colspan="4">
                            Endereço<br/>
                            <input type="text" size="98" name="txtEndereco" value="${enfermeiro.endereco}">
                        </td>

                    </tr
                    <tr>
                        <td>
                            Numero<br/>
                            <input type="text" name="txtNumero" value="${enfermeiro.numero}">
                        </td>
                        <td>
                            Complemento<br/>
                            <input type="text" name="txtComplemento" value="${enfermeiro.complemento}">
                        </td>
                        <td>
                            Bairro<br/>
                            <input type="text" name="txtBairro" value="${enfermeiro.bairro}">
                        </td>
                        <td>
                            Cidade<br/>
                            <select  style="width: 150px" name="txtCidade">
                                <option > - - - -</option>
                                <option value="BC"  <c:if test="${enfermeiro.cidade == 'BC'}"> selected</c:if>>Bicas</option>
                                <option value="JF"  <c:if test="${enfermeiro.cidade == 'JF'}"> selected</c:if>>Juiz de Fora</option>
                                </select>
                            </td>
                            <td>
                                Estado<br/>
                                <select name="txtEstado"> 
                                    <option value="uf">Selecione o Estado</option> 
                                    <option value="ac"  <c:if test="${enfermeiro.uf == 'ac'}"> selected</c:if>>Acre</option> 
                                <option value="al"  <c:if test="${enfermeiro.uf == 'al'}"> selected</c:if>>Alagoas</option> 
                                <option value="am"  <c:if test="${enfermeiro.uf == 'am'}"> selected</c:if>>Amazonas</option> 
                                <option value="ap"  <c:if test="${enfermeiro.uf == 'ap'}"> selected</c:if>>Amapá</option> 
                                <option value="ba"  <c:if test="${enfermeiro.uf == 'ba'}"> selected</c:if>>Bahia</option> 
                                <option value="ce"  <c:if test="${enfermeiro.uf == 'ce'}"> selected</c:if>>Ceará</option> 
                                <option value="df"  <c:if test="${enfermeiro.uf == 'df'}"> selected</c:if>>Distrito Federal</option> 
                                <option value="es"  <c:if test="${enfermeiro.uf == 'es'}"> selected</c:if>>Espírito Santo</option> 
                                <option value="go"  <c:if test="${enfermeiro.uf == 'go'}"> selected</c:if>>Goiás</option> 
                                <option value="ma"  <c:if test="${enfermeiro.uf == 'ma'}"> selected</c:if>>Maranhão</option> 
                                <option value="mt"  <c:if test="${enfermeiro.uf == 'mt'}"> selected</c:if>>Mato Grosso</option> 
                                <option value="ms"  <c:if test="${enfermeiro.uf == 'ms'}"> selected</c:if>>Mato Grosso do Sul</option> 
                                <option value="mg"  <c:if test="${enfermeiro.uf == 'mg'}"> selected</c:if>>Minas Gerais</option> 
                                <option value="pa"  <c:if test="${enfermeiro.uf == 'pa'}"> selected</c:if>>Pará</option> 
                                <option value="pb"  <c:if test="${enfermeiro.uf == 'pb'}"> selected</c:if>>Paraíba</option> 
                                <option value="pr"  <c:if test="${enfermeiro.uf == 'pr'}"> selected</c:if>>Paraná</option> 
                                <option value="pe"  <c:if test="${enfermeiro.uf == 'pe'}"> selected</c:if>>Pernambuco</option> 
                                <option value="pi"  <c:if test="${enfermeiro.uf == 'pi'}"> selected</c:if>>Piauí</option> 
                                <option value="rj"  <c:if test="${enfermeiro.uf == 'rj'}"> selected</c:if>>Rio de Janeiro</option> 
                                <option value="rn"  <c:if test="${enfermeiro.uf == 'rn'}"> selected</c:if>>Rio Grande do Norte</option> 
                                <option value="ro"  <c:if test="${enfermeiro.uf == 'ro'}"> selected</c:if>>Rondônia</option> 
                                <option value="rs"  <c:if test="${enfermeiro.uf == 'rs'}"> selected</c:if>>Rio Grande do Sul</option> 
                                <option value="rr"  <c:if test="${enfermeiro.uf == 'rr'}"> selected</c:if>>Roraima</option> 
                                <option value="sc"  <c:if test="${enfermeiro.uf == 'sc'}"> selected</c:if>>Santa Catarina</option> 
                                <option value="se"  <c:if test="${enfermeiro.uf == 'se'}"> selected</c:if>>Sergipe</option> 
                                <option value="sp"  <c:if test="${enfermeiro.uf == 'sp'}"> selected</c:if>>São Paulo</option> 
                                <option value="to"  <c:if test="${enfermeiro.uf == 'to'}"> selected</c:if>>Tocantins</option> 
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                Email<br/>
                                <input type="text" size="98" name="txtEmail" value="${enfermeiro.email}" >
                        </td>
                        <td>
                            Data Nascimento<br/>
                            <input type="text" name="txtDataNasc" value="${enfermeiro.dataNasc}">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Sexo<br/>
                            <select  style="width: 150px" name="txtSexo">
                                <option>Sexo</option>
                                <option value="M"  <c:if test="${enfermeiro.sexo == 'M'}"> selected</c:if> >Masculino</option>
                                <option value="F"  <c:if test="${enfermeiro.sexo == 'F'}"> selected</c:if>>Feminino</option>
                                </select>
                            </td>
                            <td>
                                Telefone<br/>
                                <input type="text" name="txtTel" value="${enfermeiro.tel}">
                        </td>
                        <td>
                            Celular<br/>
                            <input type="text" name="txtCel" value="${enfermeiro.cel}">
                        </td>
                        <td>
                            Status<br/>
                            <select name="txtStatus">
                                <option>Selecione</option>
                                <option value="Cadastrado"  <c:if test="${enfermeiro.status == 'Cadastrado'}"> selected</c:if> >Cadastrado</option>
                                <option value="Demitido"  <c:if test="${enfermeiro.status == 'Demitido'}"> selected</c:if>>Demitido</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="submit" value="Cadastrar" class="btnOpMenu">                            
                                <a href="index.jsp" class="btnOptxt"> Inicio</a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                            <c:out value="${r}" /><br/>
                            </td>
                        </tr>
                    </table>
                </form>

                <br/><br/>
        </div> 
    </body>
</html>
