-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 08-Maio-2018 às 05:32
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `sps`
--
CREATE DATABASE IF NOT EXISTS `sps` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `sps`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

CREATE TABLE IF NOT EXISTS `consulta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medico` varchar(150) NOT NULL,
  `paciente` varchar(150) NOT NULL,
  `data` varchar(10) NOT NULL,
  `inicio` varchar(5) NOT NULL,
  `terminio` varchar(5) NOT NULL,
  `obs` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Extraindo dados da tabela `consulta`
--

INSERT INTO `consulta` (`id`, `medico`, `paciente`, `data`, `inicio`, `terminio`, `obs`) VALUES
(8, 'Ana', '1212121', '06:30', '111', '05:30', '111');

-- --------------------------------------------------------

--
-- Estrutura da tabela `enfermeiro`
--

CREATE TABLE IF NOT EXISTS `enfermeiro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `cpf` int(11) NOT NULL,
  `cep` int(11) NOT NULL,
  `numero` int(4) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(150) NOT NULL,
  `estado` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `dataNasc` varchar(10) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `telefone` varchar(12) NOT NULL,
  `celular` varchar(11) NOT NULL,
  `status` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `enfermeiro`
--

INSERT INTO `enfermeiro` (`id`, `nome`, `cpf`, `cep`, `numero`, `complemento`, `endereco`, `bairro`, `cidade`, `estado`, `email`, `dataNasc`, `sexo`, `telefone`, `celular`, `status`) VALUES
(1, 'i', 1, 1, 1, '1', '1', '1', '- - - -', 'al', '1', '1', 'F', '1', '1', '1'),
(2, 'aaaaa', 1111, 111, 111, '111', '111111', '111', 'JF', 'am', '111', '11', 'M', '111', '111', 'Demitido'),
(3, 'bbb111122222', 1, 1, 1, '1', '1', '1', 'BC', 'ac', '1', '1', 'M', '1', '1', 'Cadastrado'),
(4, 'Ana', 1234, 1234, 70, 'Casa', 'Rua Dona Ana ', 'Centro', 'JF', 'mg', 'Ana@gmail.com', '', 'F', '70', '7070', 'Cadastrado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `medico`
--

CREATE TABLE IF NOT EXISTS `medico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `cpf` int(11) NOT NULL,
  `cep` int(11) NOT NULL,
  `numero` int(4) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `email` varchar(150) NOT NULL,
  `dataNasc` varchar(10) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `telefone` int(12) NOT NULL,
  `celular` int(12) NOT NULL,
  `especializacao` varchar(150) NOT NULL,
  `crm` varchar(20) NOT NULL,
  `status` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Extraindo dados da tabela `medico`
--

INSERT INTO `medico` (`id`, `nome`, `cpf`, `cep`, `numero`, `complemento`, `endereco`, `bairro`, `cidade`, `estado`, `email`, `dataNasc`, `sexo`, `telefone`, `celular`, `especializacao`, `crm`, `status`) VALUES
(11, 'Ana', 123456789, 12000000, 12, 'Casa', 'Rua Dona Ana', 'Centro', 'JF', 'mg', 'Ana@gmail.com', '12/06/94', 'F', 12345678, 12345678, 'teste', '110012', 'Cadastrado'),
(12, 'Laura', 123456789, 123000, 70, 'Casa', 'Rua teste', 'teste', 'JF', 'mg', 'Laura@gmail.com', '30/05/95', 'F', 1237011, 12312311, 'teste', '12370', 'Demitido');

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `cpf` int(11) NOT NULL,
  `cep` int(11) NOT NULL,
  `numero` int(4) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(150) NOT NULL,
  `estado` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `dataNasc` varchar(10) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `telefone` int(11) NOT NULL,
  `celular` int(11) NOT NULL,
  `convenio` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `paciente`
--

INSERT INTO `paciente` (`id`, `nome`, `cpf`, `cep`, `numero`, `complemento`, `endereco`, `bairro`, `cidade`, `estado`, `email`, `dataNasc`, `sexo`, `telefone`, `celular`, `convenio`, `status`) VALUES
(1, '1', 1, 1, 1, '1', '1', '1', '1', '1', '1', '1', '1', 1, 1, '1', ''),
(2, '1', 1, 1, 1, '1', '1', '1', '1', '2', '2', '2', '2', 2, 2, '2', ''),
(3, '1212121', 1, 1, 1, '1', '1', '1', 'JF', 'am', '1', '1', 'F', 1, 1, 'SUS', 'Cadastrado');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
