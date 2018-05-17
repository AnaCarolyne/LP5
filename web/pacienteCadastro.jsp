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
                    <li class="mc"><a href="enfermeiroCadastro.jsp">Enfermeiro</a></li>
                    <li><a href="pacienteCadastro.jsp" class="mc2">Paciente</a></li>
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
            <form action="FrontController?action=GravarPaciente" method="post">
                <table class="tbCor">
                    <tr>
                        <th colspan="5" class="tbTituloNome">Cadastro paciente</td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome<br/>
                            <input type="text" size="96" name="txtNome">
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
                            Endereço<br/>
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
                                <option value="ap">Amapá</option> 
                                <option value="ba">Bahia</option> 
                                <option value="ce">Ceará</option> 
                                <option value="df">Distrito Federal</option> 
                                <option value="es">Espírito Santo</option> 
                                <option value="go">Goiás</option> 
                                <option value="ma">Maranhão</option> 
                                <option value="mt">Mato Grosso</option> 
                                <option value="ms">Mato Grosso do Sul</option> 
                                <option value="mg">Minas Gerais</option> 
                                <option value="pa">Pará</option> 
                                <option value="pb">Paraíba</option> 
                                <option value="pr">Paraná</option> 
                                <option value="pe">Pernambuco</option> 
                                <option value="pi">Piauí</option> 
                                <option value="rj">Rio de Janeiro</option> 
                                <option value="rn">Rio Grande do Norte</option> 
                                <option value="ro">Rondônia</option> 
                                <option value="rs">Rio Grande do Sul</option> 
                                <option value="rr">Roraima</option> 
                                <option value="sc">Santa Catarina</option> 
                                <option value="se">Sergipe</option> 
                                <option value="sp">São Paulo</option> 
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
                            <input type="date" name="txtDataNasc">
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
                            <select  style="width: 340px" name="txtConvenio">
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
                        <td colspan="2">
                            Instituição<br/>
                            <select  style="width: 300px" name="txtIns">
                                <option>Selecione</option>
                                <option value="Publica">Publica</option>
                                <option value="Privada">Privada</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="index.jsp" class="btnOptxt"> Inicio</a>
                            <input type="submit" value="Cadastrar" class="btnOpMenu">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
