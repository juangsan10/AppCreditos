-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2018 a las 23:10:49
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pdp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `credito`
--

CREATE TABLE `credito` (
  `numerocredito` varchar(50) NOT NULL,
  `documento` varchar(50) NOT NULL,
  `nombre_apellido` varchar(50) NOT NULL,
  `monto` varchar(50) NOT NULL,
  `tipotrabajador` varchar(50) NOT NULL,
  `tipocredito` varchar(50) NOT NULL,
  `trabaja` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `credito`
--

INSERT INTO `credito` (`numerocredito`, `documento`, `nombre_apellido`, `monto`, `tipotrabajador`, `tipocredito`, `trabaja`) VALUES
('121223', '1038767646', 'juan', '3000000', 'Independiente', 'Vivienda', 'si'),
('121223233', '1038767646323', 'yohi', '3000000', 'Independiente', 'Vivienda', 'si'),
('123', '124', 'T', '333', 'Independiente', 'Vivienda', 'si'),
('123445', '12345', 'dsd', '12344', 'Independiente', 'Vivienda', 'si'),
('559', '1152708183', 'Juan P LondoÃ±o', '1500000', 'Dependiente', 'Estudio', 'no');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `credito`
--
ALTER TABLE `credito`
  ADD PRIMARY KEY (`numerocredito`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
