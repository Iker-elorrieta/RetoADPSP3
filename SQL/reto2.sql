-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-01-2021 a las 15:29:20
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reto2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_calidad`
--

CREATE TABLE `datos_calidad` (
  `Cod_Datos` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `COmg m3` float DEFAULT NULL,
  `CO8Hmg m3` float DEFAULT NULL,
  `NOgm3` int(11) DEFAULT NULL,
  `NO2` int(11) DEFAULT NULL,
  `NO2ICA` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `NOXgm3` int(11) DEFAULT NULL,
  `PM10` float DEFAULT NULL,
  `PM10ICA` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `PM25` float DEFAULT NULL,
  `PM25ICA` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `SO2` float DEFAULT NULL,
  `SO2ICA` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ICAStation` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Cod_Estacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `datos_calidad`
--

INSERT INTO `datos_calidad` (`Cod_Datos`, `fecha`, `hora`, `COmg m3`, `CO8Hmg m3`, `NOgm3`, `NO2`, `NO2ICA`, `NOXgm3`, `PM10`, `PM10ICA`, `PM25`, `PM25ICA`, `SO2`, `SO2ICA`, `ICAStation`, `Cod_Estacion`) VALUES
(137, '2021-01-18', '00:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(138, '2021-01-18', '23:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(139, '2021-01-18', '22:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(140, '2021-01-18', '21:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(141, '2021-01-18', '20:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(142, '2021-01-18', '19:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(143, '2021-01-18', '18:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(144, '2021-01-18', '17:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(145, '2021-01-18', '16:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(146, '2021-01-18', '15:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(147, '2021-01-18', '14:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 86),
(148, '2021-01-18', '13:00:00', 0.47, 0.52, 17, 40, 'Muy bueno / Oso ona', 66, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(149, '2021-01-18', '00:00:00', NULL, 0.52, NULL, NULL, 'Sin datos / Daturik gabe', NULL, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', NULL, 'Sin datos / Daturik gabe', 'Muy bueno / Oso ona', 86),
(150, '2021-01-18', '11:00:00', 0.48, 0.52, 31, 43, 'Bueno / Ona', 90, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(151, '2021-01-18', '10:00:00', 0.6, 0.5, 67, 51, 'Bueno / Ona', 152, NULL, 'Muy bueno / Oso ona', 9.92, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(152, '2021-01-18', '09:00:00', 0.54, 0.48, 62, 48, 'Bueno / Ona', 142, NULL, 'Muy bueno / Oso ona', 9.25, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(153, '2021-01-18', '08:00:00', 0.56, 0.47, 42, 48, 'Bueno / Ona', 112, NULL, 'Muy bueno / Oso ona', 9.04, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(154, '2021-01-18', '07:00:00', 0.52, 0.45, 21, 40, 'Muy bueno / Oso ona', 71, NULL, 'Muy bueno / Oso ona', 8.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(155, '2021-01-18', '06:00:00', 0.49, 0.44, 10, 38, 'Muy bueno / Oso ona', 53, NULL, 'Muy bueno / Oso ona', 9, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(156, '2021-01-18', '05:00:00', 0.49, 0.45, 7, 30, 'Muy bueno / Oso ona', 39, NULL, 'Muy bueno / Oso ona', 9.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(157, '2021-01-18', '04:00:00', 0.48, 0.47, 3, 29, 'Muy bueno / Oso ona', 32, NULL, 'Muy bueno / Oso ona', 8.92, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(158, '2021-01-18', '03:00:00', 0.4, 0.49, 3, 23, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 8.88, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(159, '2021-01-18', '02:00:00', 0.45, 0.52, 1, 28, 'Muy bueno / Oso ona', 30, NULL, 'Muy bueno / Oso ona', 9.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(160, '2021-01-18', '01:00:00', 0.39, 0.55, 1, 23, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', 9.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(161, '2021-01-17', '00:00:00', 0.47, 0.57, 5, 38, 'Muy bueno / Oso ona', 45, NULL, 'Muy bueno / Oso ona', 9.5, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(162, '2021-01-17', '23:00:00', 0.43, 0.56, 4, 31, 'Muy bueno / Oso ona', 37, NULL, 'Muy bueno / Oso ona', 9.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(163, '2021-01-17', '22:00:00', 0.51, 0.57, 7, 45, 'Bueno / Ona', 55, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(164, '2021-01-17', '21:00:00', 0.56, 0.56, 16, 52, 'Bueno / Ona', 76, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(165, '2021-01-17', '20:00:00', 0.59, 0.56, 15, 47, 'Bueno / Ona', 69, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(166, '2021-01-17', '19:00:00', 0.64, 0.55, 27, 59, 'Bueno / Ona', 100, NULL, 'Muy bueno / Oso ona', 9.88, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(167, '2021-01-17', '18:00:00', 0.64, 0.53, 17, 50, 'Bueno / Ona', 75, NULL, 'Muy bueno / Oso ona', 9.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(168, '2021-01-17', '17:00:00', 0.56, 0.52, 12, 37, 'Muy bueno / Oso ona', 55, NULL, 'Muy bueno / Oso ona', 9.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(169, '2021-01-17', '16:00:00', 0.55, 0.5, 18, 48, 'Bueno / Ona', 76, NULL, 'Muy bueno / Oso ona', 9.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(170, '2021-01-17', '15:00:00', 0.49, 0.5, 11, 35, 'Muy bueno / Oso ona', 52, NULL, 'Muy bueno / Oso ona', 9.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(171, '2021-01-17', '14:00:00', 0.5, 0.49, 12, 31, 'Muy bueno / Oso ona', 48, NULL, 'Muy bueno / Oso ona', 9.63, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(172, '2021-01-17', '13:00:00', 0.53, 0.48, 17, 34, 'Muy bueno / Oso ona', 60, NULL, 'Muy bueno / Oso ona', 9.5, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(173, '2021-01-17', '00:00:00', 0.55, 0.46, 19, 36, 'Muy bueno / Oso ona', 65, NULL, 'Muy bueno / Oso ona', 9.29, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(174, '2021-01-17', '11:00:00', 0.52, 0.45, 25, 34, 'Muy bueno / Oso ona', 71, NULL, 'Muy bueno / Oso ona', 9.13, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(175, '2021-01-17', '10:00:00', 0.47, 0.43, 24, 32, 'Muy bueno / Oso ona', 69, NULL, 'Muy bueno / Oso ona', 9, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(176, '2021-01-17', '09:00:00', 0.53, 0.42, 26, 39, 'Muy bueno / Oso ona', 79, NULL, 'Muy bueno / Oso ona', 8.96, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(177, '2021-01-17', '08:00:00', 0.43, 0.42, 9, 30, 'Muy bueno / Oso ona', 44, NULL, 'Muy bueno / Oso ona', 8.88, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(178, '2021-01-17', '07:00:00', 0.49, 0.41, 2, 26, 'Muy bueno / Oso ona', 29, NULL, 'Muy bueno / Oso ona', 8.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(179, '2021-01-17', '06:00:00', 0.41, 0.42, 3, 22, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', 8.67, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(180, '2021-01-17', '05:00:00', 0.4, 0.45, 2, 24, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', 8.38, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(181, '2021-01-17', '04:00:00', 0.39, 0.48, 1, 22, 'Muy bueno / Oso ona', 23, NULL, 'Muy bueno / Oso ona', 8.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(182, '2021-01-17', '03:00:00', 0.4, 0.5, 1, 15, 'Muy bueno / Oso ona', 16, NULL, 'Muy bueno / Oso ona', 7.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(183, '2021-01-17', '02:00:00', 0.33, 0.52, 1, 17, 'Muy bueno / Oso ona', 18, NULL, 'Muy bueno / Oso ona', 7.5, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(184, '2021-01-17', '01:00:00', 0.46, 0.52, 1, 25, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 7, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(185, '2021-01-16', '00:00:00', 0.47, 0.5, 5, 26, 'Muy bueno / Oso ona', 32, NULL, 'Muy bueno / Oso ona', 6.58, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(186, '2021-01-16', '23:00:00', 0.49, 0.47, 2, 29, 'Muy bueno / Oso ona', 31, NULL, 'Muy bueno / Oso ona', 6.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(187, '2021-01-16', '22:00:00', 0.68, 0.44, 33, 63, 'Bueno / Ona', 112, NULL, 'Muy bueno / Oso ona', 5.54, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(188, '2021-01-16', '21:00:00', 0.57, 0.4, 27, 61, 'Bueno / Ona', 101, NULL, 'Muy bueno / Oso ona', 5.17, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(189, '2021-01-16', '20:00:00', 0.53, 0.36, 12, 60, 'Bueno / Ona', 78, NULL, 'Muy bueno / Oso ona', 5.13, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(190, '2021-01-16', '19:00:00', 0.54, 0.33, 20, 67, 'Bueno / Ona', 97, NULL, 'Muy bueno / Oso ona', 5.04, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(191, '2021-01-16', '18:00:00', 0.47, 0.32, 13, 53, 'Bueno / Ona', 73, NULL, 'Muy bueno / Oso ona', 5.08, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(192, '2021-01-16', '17:00:00', 0.36, 0.34, 7, 31, 'Muy bueno / Oso ona', 41, NULL, 'Muy bueno / Oso ona', 5.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(193, '2021-01-16', '16:00:00', 0.3, 0.38, 5, 23, 'Muy bueno / Oso ona', 31, NULL, 'Muy bueno / Oso ona', 5.04, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(194, '2021-01-16', '15:00:00', 0.24, 0.41, 7, 24, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 5.08, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(195, '2021-01-16', '14:00:00', 0.29, 0.42, 12, 34, 'Muy bueno / Oso ona', 53, NULL, 'Muy bueno / Oso ona', 4.96, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(196, '2021-01-16', '13:00:00', 0.31, 0.42, 13, 35, 'Muy bueno / Oso ona', 55, NULL, 'Muy bueno / Oso ona', 4.92, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(197, '2021-01-16', '00:00:00', 0.28, 0.42, 9, 26, 'Muy bueno / Oso ona', 40, NULL, 'Muy bueno / Oso ona', 4.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(198, '2021-01-16', '11:00:00', 0.32, 0.43, 13, 29, 'Muy bueno / Oso ona', 48, NULL, 'Muy bueno / Oso ona', 4.29, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(199, '2021-01-16', '10:00:00', 0.49, 0.41, 26, 46, 'Bueno / Ona', 85, NULL, 'Muy bueno / Oso ona', 4.29, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(200, '2021-01-16', '09:00:00', 0.67, 0.37, 41, 63, 'Bueno / Ona', 126, NULL, 'Muy bueno / Oso ona', 4.38, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(201, '2021-01-16', '08:00:00', 0.58, 0.33, 3, 33, 'Muy bueno / Oso ona', 37, NULL, 'Muy bueno / Oso ona', 4.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(202, '2021-01-16', '07:00:00', 0.44, 0.31, 2, 23, 'Muy bueno / Oso ona', 25, NULL, 'Muy bueno / Oso ona', 4.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(203, '2021-01-16', '06:00:00', 0.32, 0.3, 2, 15, 'Muy bueno / Oso ona', 18, NULL, 'Muy bueno / Oso ona', 4.21, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(204, '2021-01-16', '05:00:00', 0.31, 0.31, 1, 14, 'Muy bueno / Oso ona', 14, NULL, 'Muy bueno / Oso ona', 4.17, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(205, '2021-01-16', '04:00:00', 0.29, 0.32, 0, 6, 'Muy bueno / Oso ona', 6, NULL, 'Muy bueno / Oso ona', 4.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(206, '2021-01-16', '03:00:00', 0.29, 0.34, 0, 5, 'Muy bueno / Oso ona', 5, NULL, 'Muy bueno / Oso ona', 4.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(207, '2021-01-16', '02:00:00', 0.31, 0.35, 0, 6, 'Muy bueno / Oso ona', 6, NULL, 'Muy bueno / Oso ona', 4.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(208, '2021-01-16', '01:00:00', 0.32, 0.36, 0, 6, 'Muy bueno / Oso ona', 7, NULL, 'Muy bueno / Oso ona', 4.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(209, '2021-01-15', '00:00:00', 0.31, 0.37, 0, 11, 'Muy bueno / Oso ona', 11, NULL, 'Muy bueno / Oso ona', 4.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(210, '2021-01-15', '23:00:00', 0.32, 0.38, 1, 17, 'Muy bueno / Oso ona', 18, NULL, 'Muy bueno / Oso ona', 4.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(211, '2021-01-15', '22:00:00', 0.33, 0.38, 3, 21, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 4.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(212, '2021-01-15', '21:00:00', 0.36, 0.39, 5, 33, 'Muy bueno / Oso ona', 40, NULL, 'Muy bueno / Oso ona', 3.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(213, '2021-01-15', '20:00:00', 0.4, 0.39, 6, 37, 'Muy bueno / Oso ona', 46, NULL, 'Muy bueno / Oso ona', 3.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(214, '2021-01-15', '19:00:00', 0.42, 0.39, 6, 39, 'Muy bueno / Oso ona', 49, NULL, 'Muy bueno / Oso ona', 3.88, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(215, '2021-01-15', '18:00:00', 0.39, 0.38, 8, 33, 'Muy bueno / Oso ona', 44, NULL, 'Muy bueno / Oso ona', 3.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(216, '2021-01-15', '17:00:00', 0.38, 0.39, 11, 33, 'Muy bueno / Oso ona', 49, NULL, 'Muy bueno / Oso ona', 3.46, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(217, '2021-01-15', '16:00:00', 0.39, 0.41, 9, 25, 'Muy bueno / Oso ona', 38, NULL, 'Muy bueno / Oso ona', 3.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(218, '2021-01-15', '15:00:00', 0.39, 0.43, 9, 23, 'Muy bueno / Oso ona', 37, NULL, 'Muy bueno / Oso ona', 3.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(219, '2021-01-15', '14:00:00', 0.36, 0.44, 8, 20, 'Muy bueno / Oso ona', 33, NULL, 'Muy bueno / Oso ona', 3.63, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(220, '2021-01-15', '13:00:00', 0.41, 0.43, 11, 28, 'Muy bueno / Oso ona', 44, NULL, 'Muy bueno / Oso ona', 3.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(221, '2021-01-15', '00:00:00', 0.39, 0.43, 8, 28, 'Muy bueno / Oso ona', 40, NULL, 'Muy bueno / Oso ona', 3.79, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(222, '2021-01-15', '11:00:00', 0.37, 0.42, 6, 27, 'Muy bueno / Oso ona', 36, NULL, 'Muy bueno / Oso ona', 4.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(223, '2021-01-15', '10:00:00', 0.43, 0.41, 12, 49, 'Bueno / Ona', 67, NULL, 'Muy bueno / Oso ona', 5.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(224, '2021-01-15', '09:00:00', 0.53, 0.39, 20, 61, 'Bueno / Ona', 92, NULL, 'Muy bueno / Oso ona', 6.04, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(225, '2021-01-15', '08:00:00', 0.55, 0.37, 14, 67, 'Bueno / Ona', 87, NULL, 'Muy bueno / Oso ona', 6.5, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(226, '2021-01-15', '07:00:00', 0.42, 0.33, 6, 41, 'Bueno / Ona', 50, NULL, 'Muy bueno / Oso ona', 6.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(227, '2021-01-15', '06:00:00', 0.34, 0.32, 3, 22, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 7.38, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(228, '2021-01-15', '05:00:00', 0.35, 0.33, 1, 22, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', 8.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(229, '2021-01-15', '04:00:00', 0.33, 0.33, 0, 8, 'Muy bueno / Oso ona', 8, NULL, 'Muy bueno / Oso ona', 8.92, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(230, '2021-01-15', '03:00:00', 0.29, 0.35, 0, 5, 'Muy bueno / Oso ona', 6, NULL, 'Muy bueno / Oso ona', 9.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(231, '2021-01-15', '02:00:00', 0.3, 0.37, 1, 4, 'Muy bueno / Oso ona', 5, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(232, '2021-01-15', '01:00:00', 0.31, 0.39, 0, 4, 'Muy bueno / Oso ona', 4, NULL, 'Muy bueno / Oso ona', 11.42, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(233, '2021-01-14', '00:00:00', 0.32, 0.41, 1, 6, 'Muy bueno / Oso ona', 7, NULL, 'Muy bueno / Oso ona', 12.04, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(234, '2021-01-14', '23:00:00', 0.36, 0.42, 1, 23, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', 12.88, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(235, '2021-01-14', '22:00:00', 0.39, 0.43, 2, 34, 'Muy bueno / Oso ona', 36, NULL, 'Sin datos / Daturik gabe', 14, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(236, '2021-01-14', '21:00:00', 0.39, 0.41, 5, 41, 'Bueno / Ona', 48, NULL, 'Bueno / Ona', 15.33, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(237, '2021-01-14', '20:00:00', 0.46, 0.39, 8, 57, 'Bueno / Ona', 69, NULL, 'Bueno / Ona', 16.58, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(238, '2021-01-14', '19:00:00', 0.46, 0.37, 10, 59, 'Bueno / Ona', 74, NULL, 'Bueno / Ona', 17.58, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(239, '2021-01-14', '18:00:00', 0.45, 0.37, 8, 50, 'Bueno / Ona', 62, NULL, 'Bueno / Ona', 18.54, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(240, '2021-01-14', '17:00:00', 0.44, 0.42, 8, 48, 'Bueno / Ona', 60, NULL, 'Bueno / Ona', 19.96, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(241, '2021-01-14', '16:00:00', 0.45, 0.46, 8, 35, 'Muy bueno / Oso ona', 47, NULL, 'Bueno / Ona', 21.21, 'Regular / Erregularra', 4, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(242, '2021-01-14', '15:00:00', 0.36, 0.49, 6, 27, 'Muy bueno / Oso ona', 36, NULL, 'Bueno / Ona', 21.79, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(243, '2021-01-14', '14:00:00', 0.25, 0.6, 8, 28, 'Muy bueno / Oso ona', 40, NULL, 'Sin datos / Daturik gabe', 22.5, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(244, '2021-01-14', '13:00:00', 0.22, 0.65, 8, 21, 'Muy bueno / Oso ona', 34, NULL, 'Regular / Erregularra', 23.17, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(245, '2021-01-14', '00:00:00', 0.34, 0.71, 14, 32, 'Muy bueno / Oso ona', 53, NULL, 'Regular / Erregularra', 23.42, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(246, '2021-01-14', '11:00:00', 0.57, 0.75, 47, 57, 'Bueno / Ona', 128, NULL, 'Regular / Erregularra', 23.29, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(247, '2021-01-14', '10:00:00', 0.83, 0.77, 121, 59, 'Bueno / Ona', 245, NULL, 'Regular / Erregularra', 23.04, 'Regular / Erregularra', 6, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(248, '2021-01-14', '09:00:00', 0.74, 0.74, 134, 64, 'Bueno / Ona', 270, NULL, 'Regular / Erregularra', 23.04, 'Regular / Erregularra', 7, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(249, '2021-01-14', '08:00:00', 0.7, 0.74, 80, 61, 'Bueno / Ona', 183, NULL, 'Regular / Erregularra', 22.79, 'Regular / Erregularra', 6, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(250, '2021-01-14', '07:00:00', 1.26, 0.73, 66, 52, 'Bueno / Ona', 153, NULL, 'Regular / Erregularra', 22.5, 'Regular / Erregularra', 6, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(251, '2021-01-14', '06:00:00', 0.66, 0.66, 57, 45, 'Bueno / Ona', 132, NULL, 'Regular / Erregularra', 22.08, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(252, '2021-01-14', '05:00:00', 0.68, 0.68, 45, 38, 'Muy bueno / Oso ona', 107, NULL, 'Regular / Erregularra', 21.54, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(253, '2021-01-14', '04:00:00', 0.62, 0.71, 20, 39, 'Muy bueno / Oso ona', 69, NULL, 'Regular / Erregularra', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(254, '2021-01-14', '03:00:00', 0.64, 0.76, 27, 36, 'Muy bueno / Oso ona', 77, NULL, 'Sin datos / Daturik gabe', NULL, 'Sin datos / Daturik gabe', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(255, '2021-01-14', '02:00:00', 0.64, 0.81, 31, 44, 'Bueno / Ona', 92, NULL, 'Bueno / Ona', 19.54, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(256, '2021-01-14', '01:00:00', 0.71, 0.84, 41, 46, 'Bueno / Ona', 110, NULL, 'Bueno / Ona', 18.92, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(257, '2021-01-13', '00:00:00', 0.59, 0.83, 39, 51, 'Bueno / Ona', 110, NULL, 'Bueno / Ona', 18.5, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(258, '2021-01-13', '23:00:00', 0.68, 0.83, 62, 63, 'Bueno / Ona', 157, NULL, 'Bueno / Ona', 17.88, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(259, '2021-01-13', '22:00:00', 0.84, 0.81, 93, 70, 'Bueno / Ona', 212, NULL, 'Bueno / Ona', 17.08, 'Bueno / Ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(260, '2021-01-13', '21:00:00', 0.95, 0.79, 128, 81, 'Bueno / Ona', 277, NULL, 'Bueno / Ona', 16.21, 'Bueno / Ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(261, '2021-01-13', '20:00:00', 1.08, 0.74, 178, 92, 'Bueno / Ona', 364, NULL, 'Bueno / Ona', 15.29, 'Bueno / Ona', 8, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(262, '2021-01-13', '19:00:00', 0.93, 0.68, 144, 91, 'Bueno / Ona', 312, NULL, 'Bueno / Ona', 14.67, 'Bueno / Ona', 7, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(263, '2021-01-13', '18:00:00', 0.86, 0.6, 119, 90, 'Bueno / Ona', 272, NULL, 'Bueno / Ona', 14.08, 'Bueno / Ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(264, '2021-01-13', '17:00:00', 0.62, 0.56, 54, 79, 'Bueno / Ona', 161, NULL, 'Bueno / Ona', 12.92, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(265, '2021-01-13', '16:00:00', 0.64, 0.56, 69, 80, 'Bueno / Ona', 185, NULL, 'Sin datos / Daturik gabe', 11.88, 'Bueno / Ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(266, '2021-01-13', '15:00:00', 0.49, 0.55, 23, 60, 'Bueno / Ona', 95, NULL, 'Muy bueno / Oso ona', 11.08, 'Bueno / Ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(267, '2021-01-13', '14:00:00', 0.63, 0.55, 73, 76, 'Bueno / Ona', 187, NULL, 'Muy bueno / Oso ona', 9.92, 'Muy bueno / Oso ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(268, '2021-01-13', '13:00:00', 0.59, 0.52, 87, 70, 'Bueno / Ona', 204, NULL, 'Muy bueno / Oso ona', 9, 'Muy bueno / Oso ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(269, '2021-01-13', '00:00:00', 0.46, 0.5, 27, 47, 'Bueno / Ona', 88, NULL, 'Muy bueno / Oso ona', 8.75, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(270, '2021-01-13', '11:00:00', 0.44, 0.48, 17, 51, 'Bueno / Ona', 76, NULL, 'Muy bueno / Oso ona', 8.5, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(271, '2021-01-13', '10:00:00', 0.58, 0.47, 63, 67, 'Bueno / Ona', 163, NULL, 'Muy bueno / Oso ona', 7.75, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(272, '2021-01-13', '09:00:00', 0.66, 0.44, 105, 76, 'Bueno / Ona', 237, NULL, 'Muy bueno / Oso ona', 7.08, 'Muy bueno / Oso ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(273, '2021-01-13', '08:00:00', 0.58, 0.4, 45, 72, 'Bueno / Ona', 140, NULL, 'Muy bueno / Oso ona', 6.96, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(274, '2021-01-13', '07:00:00', 0.45, 0.38, 4, 45, 'Bueno / Ona', 51, NULL, 'Muy bueno / Oso ona', 6.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(275, '2021-01-13', '06:00:00', 0.4, 0.37, 3, 31, 'Muy bueno / Oso ona', 36, NULL, 'Muy bueno / Oso ona', 7.21, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(276, '2021-01-13', '05:00:00', 0.37, 0.37, 1, 25, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 7.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(277, '2021-01-13', '04:00:00', 0.35, 0.4, 1, 23, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', 7.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(278, '2021-01-13', '03:00:00', 0.33, 0.43, 0, 16, 'Muy bueno / Oso ona', 16, NULL, 'Muy bueno / Oso ona', 7.46, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(279, '2021-01-13', '02:00:00', 0.35, 0.46, 1, 14, 'Muy bueno / Oso ona', 15, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(280, '2021-01-13', '01:00:00', 0.34, 0.49, 0, 14, 'Muy bueno / Oso ona', 14, NULL, 'Muy bueno / Oso ona', 7.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(281, '2021-01-12', '00:00:00', 0.38, 0.5, 1, 20, 'Muy bueno / Oso ona', 21, NULL, 'Muy bueno / Oso ona', 7.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(282, '2021-01-12', '23:00:00', 0.41, 0.5, 1, 34, 'Muy bueno / Oso ona', 36, NULL, 'Muy bueno / Oso ona', 7.79, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(283, '2021-01-12', '22:00:00', 0.44, 0.5, 8, 56, 'Bueno / Ona', 68, NULL, 'Muy bueno / Oso ona', 7.67, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(284, '2021-01-12', '21:00:00', 0.66, 0.5, 38, 76, 'Bueno / Ona', 134, NULL, 'Muy bueno / Oso ona', 7.46, 'Muy bueno / Oso ona', 6, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(285, '2021-01-12', '20:00:00', 0.6, 0.48, 38, 80, 'Bueno / Ona', 138, NULL, 'Muy bueno / Oso ona', 7.29, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(286, '2021-01-12', '19:00:00', 0.56, 0.46, 27, 78, 'Bueno / Ona', 118, NULL, 'Muy bueno / Oso ona', 6.96, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(287, '2021-01-12', '18:00:00', 0.55, 0.44, 28, 72, 'Bueno / Ona', 113, NULL, 'Muy bueno / Oso ona', 6.79, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(288, '2021-01-12', '17:00:00', 0.45, 0.44, 8, 41, 'Bueno / Ona', 53, NULL, 'Muy bueno / Oso ona', 6.92, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(289, '2021-01-12', '16:00:00', 0.4, 0.45, 7, 23, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 7.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(290, '2021-01-12', '15:00:00', 0.38, 0.48, 6, 18, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', 7.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(291, '2021-01-12', '14:00:00', 0.4, 0.52, 9, 25, 'Muy bueno / Oso ona', 39, NULL, 'Muy bueno / Oso ona', 7.5, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(292, '2021-01-12', '13:00:00', 0.44, 0.54, 9, 36, 'Muy bueno / Oso ona', 50, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(293, '2021-01-12', '00:00:00', 0.44, 0.53, 11, 36, 'Muy bueno / Oso ona', 52, NULL, 'Muy bueno / Oso ona', 7.79, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(294, '2021-01-12', '11:00:00', 0.46, 0.53, 9, 40, 'Muy bueno / Oso ona', 54, NULL, 'Muy bueno / Oso ona', 7.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(295, '2021-01-12', '10:00:00', 0.5, 0.53, 14, 52, 'Bueno / Ona', 73, NULL, 'Muy bueno / Oso ona', 7.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(296, '2021-01-12', '09:00:00', 0.57, 0.52, 23, 72, 'Bueno / Ona', 107, NULL, 'Muy bueno / Oso ona', 7.88, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(297, '2021-01-12', '08:00:00', 0.57, 0.5, 14, 67, 'Bueno / Ona', 87, NULL, 'Muy bueno / Oso ona', 7.83, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(298, '2021-01-12', '07:00:00', 0.64, 0.49, 26, 66, 'Bueno / Ona', 105, NULL, 'Muy bueno / Oso ona', 7.83, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(299, '2021-01-12', '06:00:00', 0.67, 0.44, 20, 64, 'Bueno / Ona', 93, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(300, '2021-01-12', '05:00:00', 0.53, 0.41, 14, 48, 'Bueno / Ona', 70, NULL, 'Muy bueno / Oso ona', 7.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(301, '2021-01-12', '04:00:00', 0.39, 0.41, 1, 20, 'Muy bueno / Oso ona', 21, NULL, 'Muy bueno / Oso ona', 7.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(302, '2021-01-12', '03:00:00', 0.44, 0.4, 1, 30, 'Muy bueno / Oso ona', 31, NULL, 'Muy bueno / Oso ona', 7.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(303, '2021-01-12', '02:00:00', 0.45, 0.38, 1, 32, 'Muy bueno / Oso ona', 33, NULL, 'Muy bueno / Oso ona', 6.79, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(304, '2021-01-12', '01:00:00', 0.42, 0.37, 1, 34, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 6.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(305, '2021-01-11', '00:00:00', 0.37, 0.36, 0, 23, 'Muy bueno / Oso ona', 23, NULL, 'Muy bueno / Oso ona', 5.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(306, '2021-01-11', '23:00:00', 0.39, 0.36, 1, 24, 'Muy bueno / Oso ona', 25, NULL, 'Muy bueno / Oso ona', 5.88, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(307, '2021-01-11', '22:00:00', 0.4, 0.35, 2, 40, 'Muy bueno / Oso ona', 43, NULL, 'Muy bueno / Oso ona', 5.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(308, '2021-01-11', '21:00:00', 0.42, 0.33, 4, 49, 'Bueno / Ona', 54, NULL, 'Muy bueno / Oso ona', 5.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(309, '2021-01-11', '20:00:00', 0.39, 0.32, 9, 62, 'Bueno / Ona', 76, NULL, 'Muy bueno / Oso ona', 5.67, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(310, '2021-01-11', '19:00:00', 0.33, 0.31, 9, 29, 'Muy bueno / Oso ona', 42, NULL, 'Muy bueno / Oso ona', 5.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(311, '2021-01-11', '18:00:00', 0.32, 0.31, 14, 37, 'Muy bueno / Oso ona', 58, NULL, 'Muy bueno / Oso ona', 5.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(312, '2021-01-11', '17:00:00', 0.35, 0.32, 12, 34, 'Muy bueno / Oso ona', 52, NULL, 'Muy bueno / Oso ona', 5.58, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(313, '2021-01-11', '16:00:00', 0.33, 0.33, 10, 26, 'Muy bueno / Oso ona', 41, NULL, 'Muy bueno / Oso ona', 5.46, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(314, '2021-01-11', '15:00:00', 0.32, 0.33, 12, 25, 'Muy bueno / Oso ona', 43, NULL, 'Muy bueno / Oso ona', 5.38, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(315, '2021-01-11', '14:00:00', 0.27, 0.35, 11, 24, 'Muy bueno / Oso ona', 41, NULL, 'Muy bueno / Oso ona', 5.46, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(316, '2021-01-11', '13:00:00', 0.31, 0.37, 12, 24, 'Muy bueno / Oso ona', 42, NULL, 'Muy bueno / Oso ona', 5.63, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(317, '2021-01-11', '00:00:00', 0.3, 0.38, 12, 31, 'Muy bueno / Oso ona', 49, NULL, 'Muy bueno / Oso ona', 5.67, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(318, '2021-01-11', '11:00:00', 0.32, 0.4, 12, 30, 'Muy bueno / Oso ona', 48, NULL, 'Muy bueno / Oso ona', 5.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(319, '2021-01-11', '10:00:00', 0.34, 0.41, 9, 28, 'Muy bueno / Oso ona', 42, NULL, 'Muy bueno / Oso ona', 6, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(320, '2021-01-11', '09:00:00', 0.36, 0.42, 12, 32, 'Muy bueno / Oso ona', 50, NULL, 'Muy bueno / Oso ona', 6.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(321, '2021-01-11', '08:00:00', 0.45, 0.42, 12, 35, 'Muy bueno / Oso ona', 54, NULL, 'Muy bueno / Oso ona', 6.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(322, '2021-01-11', '07:00:00', 0.48, 0.42, 6, 25, 'Muy bueno / Oso ona', 35, NULL, 'Muy bueno / Oso ona', 6.33, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(323, '2021-01-11', '06:00:00', 0.61, 0.41, 4, 16, 'Muy bueno / Oso ona', 21, NULL, 'Muy bueno / Oso ona', 6.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(324, '2021-01-11', '05:00:00', 0.43, 0.41, 2, 13, 'Muy bueno / Oso ona', 16, NULL, 'Muy bueno / Oso ona', 6.83, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(325, '2021-01-11', '04:00:00', 0.41, 0.4, 1, 7, 'Muy bueno / Oso ona', 8, NULL, 'Muy bueno / Oso ona', 7.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(326, '2021-01-11', '03:00:00', 0.42, 0.4, 0, 6, 'Muy bueno / Oso ona', 6, NULL, 'Muy bueno / Oso ona', 7.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(327, '2021-01-11', '02:00:00', 0.41, 0.39, 0, 8, 'Muy bueno / Oso ona', 8, NULL, 'Muy bueno / Oso ona', 7.42, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(328, '2021-01-11', '01:00:00', 0.4, 0.37, 0, 8, 'Muy bueno / Oso ona', 8, NULL, 'Muy bueno / Oso ona', 7.58, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(329, '2021-01-10', '00:00:00', 0.4, 0.36, 1, 9, 'Muy bueno / Oso ona', 10, NULL, 'Muy bueno / Oso ona', 7.63, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(330, '2021-01-10', '23:00:00', 0.39, 0.35, 1, 12, 'Muy bueno / Oso ona', 13, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(331, '2021-01-10', '22:00:00', 0.44, 0.34, 3, 13, 'Muy bueno / Oso ona', 18, NULL, 'Muy bueno / Oso ona', 7.42, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(332, '2021-01-10', '21:00:00', 0.42, 0.32, 6, 20, 'Muy bueno / Oso ona', 30, NULL, 'Muy bueno / Oso ona', 7.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(333, '2021-01-10', '20:00:00', 0.39, 0.31, 8, 21, 'Muy bueno / Oso ona', 32, NULL, 'Muy bueno / Oso ona', 7.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(334, '2021-01-10', '19:00:00', 0.34, 0.31, 9, 21, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 6.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(335, '2021-01-10', '18:00:00', 0.33, 0.31, 9, 21, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 6.92, 'Muy bueno / Oso ona', 5, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(336, '2021-01-10', '17:00:00', 0.3, 0.32, 7, 20, 'Muy bueno / Oso ona', 30, NULL, 'Muy bueno / Oso ona', 7, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(337, '2021-01-10', '16:00:00', 0.28, 0.34, 6, 21, 'Muy bueno / Oso ona', 30, NULL, 'Muy bueno / Oso ona', 7.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(338, '2021-01-10', '15:00:00', 0.29, 0.35, 7, 14, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', 7.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(339, '2021-01-10', '14:00:00', 0.3, 0.37, 7, 15, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(340, '2021-01-10', '13:00:00', 0.33, 0.38, 7, 16, 'Muy bueno / Oso ona', 26, NULL, 'Muy bueno / Oso ona', 7.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(341, '2021-01-10', '00:00:00', 0.32, 0.39, 8, 17, 'Muy bueno / Oso ona', 29, NULL, 'Muy bueno / Oso ona', 7.63, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(342, '2021-01-10', '11:00:00', 0.37, 0.4, 7, 18, 'Muy bueno / Oso ona', 29, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(343, '2021-01-10', '10:00:00', 0.37, 0.41, 5, 12, 'Muy bueno / Oso ona', 21, NULL, 'Muy bueno / Oso ona', 7.54, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(344, '2021-01-10', '09:00:00', 0.39, 0.41, 2, 17, 'Muy bueno / Oso ona', 20, NULL, 'Muy bueno / Oso ona', 7.58, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(345, '2021-01-10', '08:00:00', 0.4, 0.42, 3, 13, 'Muy bueno / Oso ona', 18, NULL, 'Muy bueno / Oso ona', 7.58, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(346, '2021-01-10', '07:00:00', 0.42, 0.42, 1, 8, 'Muy bueno / Oso ona', 10, NULL, 'Muy bueno / Oso ona', 7.63, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(347, '2021-01-10', '06:00:00', 0.41, 0.42, 1, 8, 'Muy bueno / Oso ona', 10, NULL, 'Muy bueno / Oso ona', 7.67, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(348, '2021-01-10', '05:00:00', 0.42, 0.42, 1, 10, 'Muy bueno / Oso ona', 12, NULL, 'Muy bueno / Oso ona', 7.5, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(349, '2021-01-10', '04:00:00', 0.43, 0.42, 0, 10, 'Muy bueno / Oso ona', 10, NULL, 'Muy bueno / Oso ona', 7.38, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(350, '2021-01-10', '03:00:00', 0.42, 0.42, 0, 9, 'Muy bueno / Oso ona', 9, NULL, 'Muy bueno / Oso ona', 7.38, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(351, '2021-01-10', '02:00:00', 0.43, 0.41, 0, 7, 'Muy bueno / Oso ona', 7, NULL, 'Muy bueno / Oso ona', 7.42, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(352, '2021-01-10', '01:00:00', 0.42, 0.41, 0, 8, 'Muy bueno / Oso ona', 9, NULL, 'Muy bueno / Oso ona', 7.5, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(353, '2021-01-09', '00:00:00', 0.43, 0.4, 0, 8, 'Muy bueno / Oso ona', 9, NULL, 'Muy bueno / Oso ona', 7.67, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(354, '2021-01-09', '23:00:00', 0.42, 0.39, 1, 9, 'Muy bueno / Oso ona', 10, NULL, 'Muy bueno / Oso ona', 7.96, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(355, '2021-01-09', '22:00:00', 0.43, 0.38, 3, 12, 'Muy bueno / Oso ona', 16, NULL, 'Muy bueno / Oso ona', 8.17, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(356, '2021-01-09', '21:00:00', 0.43, 0.37, 6, 21, 'Muy bueno / Oso ona', 30, NULL, 'Muy bueno / Oso ona', 8.29, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(357, '2021-01-09', '20:00:00', 0.41, 0.37, 6, 23, 'Muy bueno / Oso ona', 33, NULL, 'Muy bueno / Oso ona', 8.58, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(358, '2021-01-09', '19:00:00', 0.41, 0.37, 6, 24, 'Muy bueno / Oso ona', 34, NULL, 'Muy bueno / Oso ona', 8.75, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(359, '2021-01-09', '18:00:00', 0.39, 0.37, 11, 30, 'Muy bueno / Oso ona', 46, NULL, 'Muy bueno / Oso ona', 8.88, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(360, '2021-01-09', '17:00:00', 0.36, 0.37, 8, 23, 'Muy bueno / Oso ona', 35, NULL, 'Muy bueno / Oso ona', 9.04, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(361, '2021-01-09', '16:00:00', 0.32, 0.38, 8, 24, 'Muy bueno / Oso ona', 37, NULL, 'Muy bueno / Oso ona', 9.17, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(362, '2021-01-09', '15:00:00', 0.32, 0.41, 11, 26, 'Muy bueno / Oso ona', 43, NULL, 'Muy bueno / Oso ona', 9.25, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(363, '2021-01-09', '14:00:00', 0.39, 0.42, 11, 23, 'Muy bueno / Oso ona', 40, NULL, 'Muy bueno / Oso ona', 9.08, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(364, '2021-01-09', '13:00:00', 0.37, 0.44, 14, 23, 'Muy bueno / Oso ona', 44, NULL, 'Muy bueno / Oso ona', 9.13, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(365, '2021-01-09', '00:00:00', 0.37, 0.45, 12, 24, 'Muy bueno / Oso ona', 42, NULL, 'Muy bueno / Oso ona', 9.42, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(366, '2021-01-09', '11:00:00', 0.41, 0.46, 11, 23, 'Muy bueno / Oso ona', 39, NULL, 'Muy bueno / Oso ona', 9.71, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(367, '2021-01-09', '10:00:00', 0.39, 0.47, 7, 18, 'Muy bueno / Oso ona', 29, NULL, 'Muy bueno / Oso ona', 9.92, 'Muy bueno / Oso ona', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(368, '2021-01-09', '09:00:00', 0.44, 0.48, 6, 17, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(369, '2021-01-09', '08:00:00', 0.5, 0.49, 4, 14, 'Muy bueno / Oso ona', 21, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(370, '2021-01-09', '07:00:00', 0.5, 0.48, 4, 18, 'Muy bueno / Oso ona', 24, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(371, '2021-01-09', '06:00:00', 0.5, 0.48, 5, 19, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(372, '2021-01-09', '05:00:00', 0.51, 0.46, 1, 19, 'Muy bueno / Oso ona', 20, NULL, 'Muy bueno / Oso ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Muy bueno / Oso ona', 86),
(373, '2021-01-09', '04:00:00', 0.48, 0.46, 0, 11, 'Muy bueno / Oso ona', 11, NULL, 'Muy bueno / Oso ona', 11, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(374, '2021-01-09', '03:00:00', 0.48, 0.42, 1, 12, 'Muy bueno / Oso ona', 13, NULL, 'Muy bueno / Oso ona', 11.13, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(375, '2021-01-09', '02:00:00', 0.47, 0.37, 0, 12, 'Muy bueno / Oso ona', 12, NULL, 'Muy bueno / Oso ona', 11.25, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(376, '2021-01-09', '01:00:00', 0.48, 0.33, 1, 12, 'Muy bueno / Oso ona', 12, NULL, 'Muy bueno / Oso ona', 11.46, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(377, '2021-01-08', '00:00:00', 0.45, 0.29, 1, 10, 'Muy bueno / Oso ona', 11, NULL, 'Muy bueno / Oso ona', 11.67, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(378, '2021-01-08', '23:00:00', 0.44, 0.28, 1, 12, 'Muy bueno / Oso ona', 14, NULL, 'Muy bueno / Oso ona', 11.88, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(379, '2021-01-08', '22:00:00', 0.44, 0.24, 4, 21, 'Muy bueno / Oso ona', 27, NULL, 'Muy bueno / Oso ona', 12.67, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(380, '2021-01-08', '21:00:00', 0.49, 0.21, 9, 30, 'Muy bueno / Oso ona', 43, NULL, 'Muy bueno / Oso ona', 13.63, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(381, '2021-01-08', '20:00:00', 0.21, 0.16, 12, 37, 'Muy bueno / Oso ona', 55, NULL, 'Muy bueno / Oso ona', 14.54, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(382, '2021-01-08', '19:00:00', 0.17, 0.16, 12, 38, 'Muy bueno / Oso ona', 56, NULL, 'Muy bueno / Oso ona', 15.75, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(383, '2021-01-08', '18:00:00', 0.17, 0.17, 15, 42, 'Bueno / Ona', 64, NULL, 'Sin datos / Daturik gabe', 17.04, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(384, '2021-01-08', '17:00:00', 0.19, 0.21, 15, 43, 'Bueno / Ona', 65, NULL, 'Bueno / Ona', 18.54, 'Bueno / Ona', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(385, '2021-01-08', '16:00:00', 0.16, 0.27, 16, 39, 'Muy bueno / Oso ona', 63, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(386, '2021-01-08', '15:00:00', 0.18, 0.32, 14, 27, 'Muy bueno / Oso ona', 49, NULL, 'Bueno / Ona', 22.38, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(387, '2021-01-08', '14:00:00', 0.17, 0.37, 16, 26, 'Muy bueno / Oso ona', 50, NULL, 'Bueno / Ona', 23.88, 'Regular / Erregularra', 4, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(388, '2021-01-08', '13:00:00', 0.15, 0.42, 16, 24, 'Muy bueno / Oso ona', 48, NULL, 'Bueno / Ona', 24.96, 'Regular / Erregularra', 5, 'Muy bueno / Oso ona', 'Regular / Erregularra', 86),
(389, '2021-01-08', '00:00:00', 0.15, 0.46, 17, 25, 'Muy bueno / Oso ona', 50, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(390, '2021-01-08', '11:00:00', 0.2, 0.5, 17, 25, 'Muy bueno / Oso ona', 50, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(391, '2021-01-08', '10:00:00', 0.41, 0.53, 23, 37, 'Muy bueno / Oso ona', 72, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 4, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(392, '2021-01-08', '09:00:00', 0.55, 0.52, 43, 61, 'Bueno / Ona', 125, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(393, '2021-01-08', '08:00:00', 0.64, 0.49, 43, 68, 'Bueno / Ona', 134, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(394, '2021-01-08', '07:00:00', 0.59, 0.47, 24, 63, 'Bueno / Ona', 99, NULL, 'Bueno / Ona', NULL, 'Sin datos / Daturik gabe', 5, 'Muy bueno / Oso ona', 'Bueno / Ona', 86),
(395, '2021-01-08', '06:00:00', 0.58, 0.46, 12, 52, 'Bueno / Ona', 70, NULL, 'Bueno / Ona', 26.14, 'Malo / Txarra', 5, 'Muy bueno / Oso ona', 'Malo / Txarra', 86),
(396, '2021-01-08', '05:00:00', 0.5, 0.53, 1, 26, 'Muy bueno / Oso ona', 27, NULL, 'Bueno / Ona', 26.41, 'Malo / Txarra', 4, 'Muy bueno / Oso ona', 'Malo / Txarra', 86),
(397, '2021-01-08', '04:00:00', 0.44, 0.58, 0, 14, 'Muy bueno / Oso ona', 14, NULL, 'Bueno / Ona', 26.55, 'Malo / Txarra', 4, 'Muy bueno / Oso ona', 'Malo / Txarra', 86),
(398, '2021-01-08', '03:00:00', 0.43, 0.62, 0, 10, 'Muy bueno / Oso ona', 10, NULL, 'Bueno / Ona', 26.73, 'Malo / Txarra', 4, 'Muy bueno / Oso ona', 'Malo / Txarra', 86);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espacios_naturales`
--

CREATE TABLE `espacios_naturales` (
  `Cod_Espacio` int(11) NOT NULL,
  `Nombre_Espacio` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Marca` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `nature_type` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `latwgs84` float NOT NULL,
  `longwgs84` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `espacios_naturales`
--

INSERT INTO `espacios_naturales` (`Cod_Espacio`, `Nombre_Espacio`, `Marca`, `nature_type`, `latwgs84`, `longwgs84`) VALUES
(1, 'Embalse de Maroño', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 43.0468, -3.05986),
(2, 'Embalse de Ullíbarri-Gamboa', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 42.926, -2.56977),
(3, 'Embalse de Urkulu', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 43.0196, -2.47698),
(4, 'La Arboleda', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 43.2849, -3.05386),
(5, 'Piscinas fluviales de Espejo', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 42.8096, -3.04639),
(6, 'Piscinas fluviales de Fresnedo', 'Montes y Valles vascos', 'Playas, pantanos y ríos', 42.6763, -2.3703),
(7, 'Playa Santiago de Deba', 'Costa Vasca', 'Playas, pantanos y ríos', 43.2983, -2.35427),
(8, 'Playa de Alkolea', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3076, -2.37101),
(9, 'Playa de Antilla', 'Costa Vasca', 'Playas, pantanos y ríos', 43.2887, -2.12796),
(10, 'Playa de Aritxatxu', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4285, -2.73792),
(11, 'Playa de Armintza', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4332, -2.89897),
(12, 'Playa de Arrigorri', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3229, -2.41921),
(13, 'Playa de Arrigunaga', 'Costa Vasca,Bilbao', 'Playas, pantanos y ríos', 43.3583, -3.01871),
(14, 'Playa de Bakio', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4302, -2.80576),
(15, 'Playa de Barrika', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4055, -2.97299),
(16, 'Playa de Ea', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3801, -2.58559),
(17, 'Playa de Ereaga', 'Costa Vasca,Bilbao', 'Playas, pantanos y ríos', 43.3419, -3.01363),
(18, 'Playa de Gaztetape', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3037, -2.20605),
(19, 'Playa de Gorliz', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4184, -2.94571),
(20, 'Playa de Gorrondatxe (Azkorri)', 'Costa Vasca,Bilbao', 'Playas, pantanos y ríos', 43.3791, -3.02021),
(21, 'Playa de Hondarribia', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3798, -1.7945),
(22, 'Playa de Hondartzape', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4073, -2.69832),
(23, 'Playa de Isuntza', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3633, -2.50111),
(24, 'Playa de Itzurun', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3006, -2.26043),
(25, 'Playa de Kanala', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3846, -2.68118),
(26, 'Playa de Kanalape', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3818, -2.67852),
(27, 'Playa de Karraspio', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3628, -2.49424),
(28, 'Playa de La Concha', 'Costa Vasca,San Sebastián', 'Playas, pantanos y ríos', 43.3182, -1.98647),
(29, 'Playa de Laga', 'Costa Vasca', 'Playas, pantanos y ríos', 43.409, -2.65663),
(30, 'Playa de Laida', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3996, -2.68562),
(31, 'Playa de Laidatxu', 'Costa Vasca', 'Playas, pantanos y ríos', 43.405, -2.69938),
(32, 'Playa de Landa', 'Vitoria-Gasteiz', 'Playas, pantanos y ríos', 42.94, -2.60543),
(33, 'Playa de Las Arenas', 'Costa Vasca,Bilbao', 'Playas, pantanos y ríos', 43.3264, -3.01776),
(34, 'Playa de Malkorbe', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3013, -2.2021),
(35, 'Playa de Meñakoz', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3952, -2.98562),
(36, 'Playa de Muriola', 'Costa Vasca', 'Playas, pantanos y ríos', 43.413, -2.95996),
(37, 'Playa de Ogeia', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3732, -2.54574),
(38, 'Playa de Ondarbeltz', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3014, -2.35745),
(39, 'Playa de Ondarreta', 'Costa Vasca,San Sebastián', 'Playas, pantanos y ríos', 43.3172, -2.00277),
(40, 'Playa de Plentzia', 'Costa Vasca', 'Playas, pantanos y ríos', 43.4113, -2.94708),
(41, 'Playa de Santiago', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3019, -2.25117),
(42, 'Playa de Saturraran', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3218, -2.41098),
(43, 'Playa de Toña', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3911, -2.69182),
(44, 'Playa de Zarautz', 'Costa Vasca', 'Playas, pantanos y ríos', 43.2877, -2.17289),
(45, 'Playa de la Isla de Santa Clara', 'Costa Vasca,San Sebastián', 'Playas, pantanos y ríos', 43.3207, -1.99965),
(46, 'Playa de la Zurriola', 'Costa Vasca,San Sebastián', 'Playas, pantanos y ríos', 43.3272, -1.97359),
(47, 'Playa del Puerto (Mutriku)', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3109, -2.38048),
(48, 'Playas de Arrietara y Atxabiribil', 'Costa Vasca', 'Playas, pantanos y ríos', 43.3897, -2.99284),
(49, 'Zierbena-Puerto', 'Costa Vasca', 'Playas, pantanos y ríos', 43.35, -3.07742);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estaciones`
--

CREATE TABLE `estaciones` (
  `Cod_Estacion` int(11) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Cod_Municipio` int(11) NOT NULL,
  `Direccion` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `Coordenada X` float NOT NULL,
  `Coordenada Y` float NOT NULL,
  `Latitud` float NOT NULL,
  `Longitud` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `estaciones`
--

INSERT INTO `estaciones` (`Cod_Estacion`, `Nombre`, `Cod_Municipio`, `Direccion`, `Coordenada X`, `Coordenada Y`, `Latitud`, `Longitud`) VALUES
(86, '3 DE MARZO', 230, 'Plaza Tres de Marzo, s/n', 527141, 4744880, 42.856, -2.66778),
(87, 'ABANTO', 3, 'Avda. del Minero, 2. Ayuntamiento', 493987, 4796410, 43.3205, -3.07416),
(88, 'AGURAIN', 204, 'C/ Fueros, 11. Subcomisaría de la Ertzaintza.', 549539, 4744230, 42.849, -2.3937),
(89, 'ALGORTA (BBIZI2)', 111, 'Carretera de Galea, s/n ', 498154, 4801020, 43.3621, -3.02278),
(90, 'ALONSOTEGI', 12, 'C/ Baztieta, s/n. Bº Irauregi', 500972, 4788310, 43.2476, -2.98802),
(91, 'ANDOAIN', 19, 'Ikastola Aita larramendi', 579321, 4785860, 43.2214, -2.02333),
(92, 'ARRAIZ (Monte)', 71, 'Camino de Arraiz, s/n', 503209, 4788080, 43.2456, -2.96048),
(93, 'ATEGORRIETA', 207, 'Avda. Ategorrieta, 71', 584272, 4797100, 43.322, -1.96065),
(94, 'AV. GASTEIZ', 230, 'Avda. Gasteiz, 97', 526086, 4744740, 42.8548, -2.68071),
(95, 'AVDA. TOLOSA', 207, 'C/ Andrestegi, 2 ', 580211, 4795650, 43.3094, -2.01094),
(96, 'AZPEITIA', 47, 'C/ Perdillegi, s/n', 559472, 4781100, 43.1804, -2.26821),
(97, 'AÑORGA', 207, 'Avda. de Añorga, 12 (Añorga Txiki)', 581469, 4793570, 43.2905, -1.99574),
(98, 'BANDERAS (meteo)', 71, 'Monte Banderas, s/n', 503791, 4792020, 43.281, -2.95328),
(99, 'BARAKALDO', 52, 'C/ Hogar propio, 7. CIFP Nicolás Larburu', 501044, 4793950, 43.2984, -2.98713),
(100, 'BASAURI', 55, 'C/ Uribarri, 5. CEIP Bizkotxalde.', 509437, 4787600, 43.2411, -2.88376),
(101, 'BEASAIN', 57, 'Plaza Gipuzkoa, 1', 565858, 4766470, 43.0481, -2.19138),
(102, 'BOROA METEO', 16, 'Parque Empresarial Boroa, s/n', 520243, 4787040, 43.2359, -2.75069),
(103, 'CASTREJANA', 52, 'C/ Larrazabal, 1. Bº Castrejana', 502154, 4789480, 43.2581, -2.97346),
(104, 'DURANGO', 77, 'C/ San Roque, 20 bajo. E.S. Roque', 529429, 4779570, 43.1683, -2.63796),
(105, 'EASO', 207, 'Plaza del Centenario, s/n', 582644, 4795980, 43.3122, -1.9809),
(106, 'ELCIEGO', 82, 'C/ Gabriel Celaya, 8', 531257, 4707390, 42.5182, -2.61948),
(107, 'ERANDIO', 88, 'Avda. José Luis Goyoaga, s/n (Pasaje de Altzaga)', 501846, 4794420, 43.3027, -2.97724),
(108, 'EUROPA', 71, 'Parque Europa. Bº Txurdinaga', 507924, 4789130, 43.2549, -2.90238),
(109, 'FARMACIA', 230, 'Paseo Universidad, 7. Fac. Farmacia UPV', 526758, 4743110, 42.8401, -2.67256),
(110, 'FERIA (meteo)', 71, 'C/ Rafael Moreno Pitxitxi, s/n', 504257, 4790270, 43.2652, -2.94754),
(111, 'HERNANI', 117, 'C/ Aristizabal, s/n. Centro de salud Hernani.', 582963, 4791020, 43.2674, -1.97772),
(112, 'JAIZKIBEL', 119, 'Monte Jaizkibel, s/n', 592449, 4799510, 43.3428, -1.85941),
(113, 'LARRABETZU', 143, 'Barrio Berrezoaga, 3', 516281, 4789840, 43.2612, -2.7994),
(114, 'LAS CARRERAS', 3, 'Plaza Trinidad, s/n. Bº Las Carreras', 492103, 4796310, 43.3196, -3.0974),
(115, 'LASARTE-ORIA', 145, 'Parque Tximistarreta', 579600, 4791120, 43.2687, -2.01913),
(116, 'LEZO', 159, 'Plaza Polantzarene, s/n', 589180, 4797110, 43.3215, -1.90013),
(117, 'LLODIO', 161, 'C/ Lamuza, s/n', 502977, 4776810, 43.144, -2.96339),
(118, 'LOS HERRAN', 230, 'Parque Judizmendi. Bº Judizmendi', 527682, 4743510, 42.8437, -2.66123),
(119, 'MAZARREDO', 71, 'C/ Alameda Mazarredo, s/n (Guggenheim)', 505260, 4790520, 43.2675, -2.93519),
(120, 'MONDRAGON', 31, 'Plaza Jose María Arizmendiarrieta, s/n', 541494, 4768060, 43.0641, -2.4904),
(121, 'MONTORRA', 16, 'Barrio Montorra fte. nº5', 523022, 4784060, 43.209, -2.71659),
(122, 'MUNDAKA', 173, 'Camino Goitiz, s/n. Depósito de Agua', 524035, 4805930, 43.4059, -2.70316),
(123, 'MUNOA', 52, 'C/ Llano, 55. CEP Munoa. Bº Lutxana', 501728, 4792530, 43.2856, -2.9787),
(124, 'MUSKIZ', 177, 'C/ Giba Fregenal, s/n. Estación de Renfe', 490861, 4796440, 43.3207, -3.11272),
(125, 'Mª DIAZ HARO', 71, 'C/ Mª Díaz de Haro, 60', 504411, 4789560, 43.2588, -2.94566),
(126, 'NAUTICA', 201, 'C/ Mª Díaz de Haro, 68 (Esc. Náutica)', 498108, 4797120, 43.3269, -3.02333),
(127, 'PAGOETA', 5, 'Jardín Botánico de Iturraran. Parque Natural de Pagoeta. ', 568603, 4788990, 43.2506, -2.15489),
(128, 'PUYO', 207, 'Camino de Puyo, 14', 582404, 4794940, 43.3028, -1.98401),
(129, 'SAN JULIAN', 177, 'Camino a Valles, s/n. Bº San Julian', 490840, 4797760, 43.3326, -3.11299),
(130, 'SAN MIGUEL', 55, 'Parque pinceles. Bº San Miguel', 509217, 4785390, 43.2212, -2.88651),
(131, 'SANGRONIZ', 211, 'C/ Iturrikosolo, s/n', 505647, 4793960, 43.2984, -2.93039),
(132, 'SANTURCE', 208, 'C/ Vista Alegre, 29 ', 496550, 4797800, 43.333, -3.04256),
(133, 'SERANTES', 208, 'Camino Serantes igoera, s/n', 494894, 4797960, 43.3344, -3.06299),
(134, 'SESTAO', 210, 'Parque Portopin', 500328, 4794990, 43.3077, -2.99595),
(135, 'TOLOSA', 216, 'Avda. Martin Jose Iraola, 23', 574991, 4775750, 43.1308, -2.078),
(136, 'URKIOLA', 1, 'Urkiola auzoa, 8', 528411, 4772030, 43.1004, -2.65087),
(137, 'USURBIL', 224, 'San Inazio', 577047, 4791660, 43.2738, -2.05051),
(138, 'VALDEREJO', 225, 'Ctro. de Interpretación. Parque Natural de Valderejo', 481074, 4746980, 42.8752, -3.23173),
(139, 'ZALLA', 235, 'Avda. Kosme Bibanko Etxebarria, 2', 489078, 4784460, 43.2129, -3.13446),
(140, 'ZELAIETA PARQUE', 16, 'Parque Zelaieta ', 521564, 4785160, 43.2189, -2.7345),
(141, 'ZIERBENA (Puerto)', 245, 'Puerto de Zierbena, s/n. Bº El Puerto', 493437, 4800030, 43.3531, -3.08099),
(142, 'ZUBIETA', 207, 'URIBITARTE IBILBIDEA', 578604, 4791480, 43.2721, -2.03135),
(143, 'ZUBIETA METEO', 207, 'ZUBIETA', 578595, 4789700, 43.256, -2.03172),
(144, '3 DE MARZO', 230, 'Plaza Tres de Marzo, s/n', 527141, 4744880, 42.856, -2.66778),
(145, 'ABANTO', 3, 'Avda. del Minero, 2. Ayuntamiento', 493987, 4796410, 43.3205, -3.07416),
(146, 'AGURAIN', 204, 'C/ Fueros, 11. Subcomisaría de la Ertzaintza.', 549539, 4744230, 42.849, -2.3937),
(147, 'ALGORTA (BBIZI2)', 111, 'Carretera de Galea, s/n ', 498154, 4801020, 43.3621, -3.02278),
(148, 'ALONSOTEGI', 12, 'C/ Baztieta, s/n. Bº Irauregi', 500972, 4788310, 43.2476, -2.98802),
(149, 'ANDOAIN', 19, 'Ikastola Aita larramendi', 579321, 4785860, 43.2214, -2.02333),
(150, 'ARRAIZ (Monte)', 71, 'Camino de Arraiz, s/n', 503209, 4788080, 43.2456, -2.96048),
(151, 'ATEGORRIETA', 207, 'Avda. Ategorrieta, 71', 584272, 4797100, 43.322, -1.96065),
(152, 'AV. GASTEIZ', 230, 'Avda. Gasteiz, 97', 526086, 4744740, 42.8548, -2.68071),
(153, 'AVDA. TOLOSA', 207, 'C/ Andrestegi, 2 ', 580211, 4795650, 43.3094, -2.01094),
(154, 'AZPEITIA', 47, 'C/ Perdillegi, s/n', 559472, 4781100, 43.1804, -2.26821),
(155, 'AÑORGA', 207, 'Avda. de Añorga, 12 (Añorga Txiki)', 581469, 4793570, 43.2905, -1.99574),
(156, 'BANDERAS (meteo)', 71, 'Monte Banderas, s/n', 503791, 4792020, 43.281, -2.95328),
(157, 'BARAKALDO', 52, 'C/ Hogar propio, 7. CIFP Nicolás Larburu', 501044, 4793950, 43.2984, -2.98713),
(158, 'BASAURI', 55, 'C/ Uribarri, 5. CEIP Bizkotxalde.', 509437, 4787600, 43.2411, -2.88376),
(159, 'BEASAIN', 57, 'Plaza Gipuzkoa, 1', 565858, 4766470, 43.0481, -2.19138),
(160, 'BOROA METEO', 16, 'Parque Empresarial Boroa, s/n', 520243, 4787040, 43.2359, -2.75069),
(161, 'CASTREJANA', 52, 'C/ Larrazabal, 1. Bº Castrejana', 502154, 4789480, 43.2581, -2.97346),
(162, 'DURANGO', 77, 'C/ San Roque, 20 bajo. E.S. Roque', 529429, 4779570, 43.1683, -2.63796),
(163, 'EASO', 207, 'Plaza del Centenario, s/n', 582644, 4795980, 43.3122, -1.9809),
(164, 'ELCIEGO', 82, 'C/ Gabriel Celaya, 8', 531257, 4707390, 42.5182, -2.61948),
(165, 'ERANDIO', 88, 'Avda. José Luis Goyoaga, s/n (Pasaje de Altzaga)', 501846, 4794420, 43.3027, -2.97724),
(166, 'EUROPA', 71, 'Parque Europa. Bº Txurdinaga', 507924, 4789130, 43.2549, -2.90238),
(167, 'FARMACIA', 230, 'Paseo Universidad, 7. Fac. Farmacia UPV', 526758, 4743110, 42.8401, -2.67256),
(168, 'FERIA (meteo)', 71, 'C/ Rafael Moreno Pitxitxi, s/n', 504257, 4790270, 43.2652, -2.94754),
(169, 'HERNANI', 117, 'C/ Aristizabal, s/n. Centro de salud Hernani.', 582963, 4791020, 43.2674, -1.97772),
(170, 'JAIZKIBEL', 119, 'Monte Jaizkibel, s/n', 592449, 4799510, 43.3428, -1.85941),
(171, 'LARRABETZU', 143, 'Barrio Berrezoaga, 3', 516281, 4789840, 43.2612, -2.7994),
(172, 'LAS CARRERAS', 3, 'Plaza Trinidad, s/n. Bº Las Carreras', 492103, 4796310, 43.3196, -3.0974),
(173, 'LASARTE-ORIA', 145, 'Parque Tximistarreta', 579600, 4791120, 43.2687, -2.01913),
(174, 'LEZO', 159, 'Plaza Polantzarene, s/n', 589180, 4797110, 43.3215, -1.90013),
(175, 'LLODIO', 161, 'C/ Lamuza, s/n', 502977, 4776810, 43.144, -2.96339),
(176, 'LOS HERRAN', 230, 'Parque Judizmendi. Bº Judizmendi', 527682, 4743510, 42.8437, -2.66123),
(177, 'MAZARREDO', 71, 'C/ Alameda Mazarredo, s/n (Guggenheim)', 505260, 4790520, 43.2675, -2.93519),
(178, 'MONDRAGON', 31, 'Plaza Jose María Arizmendiarrieta, s/n', 541494, 4768060, 43.0641, -2.4904),
(179, 'MONTORRA', 16, 'Barrio Montorra fte. nº5', 523022, 4784060, 43.209, -2.71659),
(180, 'MUNDAKA', 173, 'Camino Goitiz, s/n. Depósito de Agua', 524035, 4805930, 43.4059, -2.70316),
(181, 'MUNOA', 52, 'C/ Llano, 55. CEP Munoa. Bº Lutxana', 501728, 4792530, 43.2856, -2.9787),
(182, 'MUSKIZ', 177, 'C/ Giba Fregenal, s/n. Estación de Renfe', 490861, 4796440, 43.3207, -3.11272),
(183, 'Mª DIAZ HARO', 71, 'C/ Mª Díaz de Haro, 60', 504411, 4789560, 43.2588, -2.94566),
(184, 'NAUTICA', 201, 'C/ Mª Díaz de Haro, 68 (Esc. Náutica)', 498108, 4797120, 43.3269, -3.02333),
(185, 'PAGOETA', 5, 'Jardín Botánico de Iturraran. Parque Natural de Pagoeta. ', 568603, 4788990, 43.2506, -2.15489),
(186, 'PUYO', 207, 'Camino de Puyo, 14', 582404, 4794940, 43.3028, -1.98401),
(187, 'SAN JULIAN', 177, 'Camino a Valles, s/n. Bº San Julian', 490840, 4797760, 43.3326, -3.11299),
(188, 'SAN MIGUEL', 55, 'Parque pinceles. Bº San Miguel', 509217, 4785390, 43.2212, -2.88651),
(189, 'SANGRONIZ', 211, 'C/ Iturrikosolo, s/n', 505647, 4793960, 43.2984, -2.93039),
(190, 'SANTURCE', 208, 'C/ Vista Alegre, 29 ', 496550, 4797800, 43.333, -3.04256),
(191, 'SERANTES', 208, 'Camino Serantes igoera, s/n', 494894, 4797960, 43.3344, -3.06299),
(192, 'SESTAO', 210, 'Parque Portopin', 500328, 4794990, 43.3077, -2.99595),
(193, 'TOLOSA', 216, 'Avda. Martin Jose Iraola, 23', 574991, 4775750, 43.1308, -2.078),
(194, 'URKIOLA', 1, 'Urkiola auzoa, 8', 528411, 4772030, 43.1004, -2.65087),
(195, 'USURBIL', 224, 'San Inazio', 577047, 4791660, 43.2738, -2.05051),
(196, 'VALDEREJO', 225, 'Ctro. de Interpretación. Parque Natural de Valderejo', 481074, 4746980, 42.8752, -3.23173),
(197, 'ZALLA', 235, 'Avda. Kosme Bibanko Etxebarria, 2', 489078, 4784460, 43.2129, -3.13446),
(198, 'ZELAIETA PARQUE', 16, 'Parque Zelaieta ', 521564, 4785160, 43.2189, -2.7345),
(199, 'ZIERBENA (Puerto)', 245, 'Puerto de Zierbena, s/n. Bº El Puerto', 493437, 4800030, 43.3531, -3.08099),
(200, 'ZUBIETA', 207, 'URIBITARTE IBILBIDEA', 578604, 4791480, 43.2721, -2.03135),
(201, 'ZUBIETA METEO', 207, 'ZUBIETA', 578595, 4789700, 43.256, -2.03172),
(202, '3 DE MARZO', 230, 'Plaza Tres de Marzo, s/n', 527141, 4744880, 42.856, -2.66778),
(203, 'ABANTO', 3, 'Avda. del Minero, 2. Ayuntamiento', 493987, 4796410, 43.3205, -3.07416),
(204, 'AGURAIN', 204, 'C/ Fueros, 11. Subcomisaría de la Ertzaintza.', 549539, 4744230, 42.849, -2.3937),
(205, 'ALGORTA (BBIZI2)', 111, 'Carretera de Galea, s/n ', 498154, 4801020, 43.3621, -3.02278),
(206, 'ALONSOTEGI', 12, 'C/ Baztieta, s/n. Bº Irauregi', 500972, 4788310, 43.2476, -2.98802),
(207, 'ANDOAIN', 19, 'Ikastola Aita larramendi', 579321, 4785860, 43.2214, -2.02333),
(208, 'ARRAIZ (Monte)', 71, 'Camino de Arraiz, s/n', 503209, 4788080, 43.2456, -2.96048),
(209, 'ATEGORRIETA', 207, 'Avda. Ategorrieta, 71', 584272, 4797100, 43.322, -1.96065),
(210, 'AV. GASTEIZ', 230, 'Avda. Gasteiz, 97', 526086, 4744740, 42.8548, -2.68071),
(211, 'AVDA. TOLOSA', 207, 'C/ Andrestegi, 2 ', 580211, 4795650, 43.3094, -2.01094),
(212, 'AZPEITIA', 47, 'C/ Perdillegi, s/n', 559472, 4781100, 43.1804, -2.26821),
(213, 'AÑORGA', 207, 'Avda. de Añorga, 12 (Añorga Txiki)', 581469, 4793570, 43.2905, -1.99574),
(214, 'BANDERAS (meteo)', 71, 'Monte Banderas, s/n', 503791, 4792020, 43.281, -2.95328),
(215, 'BARAKALDO', 52, 'C/ Hogar propio, 7. CIFP Nicolás Larburu', 501044, 4793950, 43.2984, -2.98713),
(216, 'BASAURI', 55, 'C/ Uribarri, 5. CEIP Bizkotxalde.', 509437, 4787600, 43.2411, -2.88376),
(217, 'BEASAIN', 57, 'Plaza Gipuzkoa, 1', 565858, 4766470, 43.0481, -2.19138),
(218, 'BOROA METEO', 16, 'Parque Empresarial Boroa, s/n', 520243, 4787040, 43.2359, -2.75069),
(219, 'CASTREJANA', 52, 'C/ Larrazabal, 1. Bº Castrejana', 502154, 4789480, 43.2581, -2.97346),
(220, 'DURANGO', 77, 'C/ San Roque, 20 bajo. E.S. Roque', 529429, 4779570, 43.1683, -2.63796),
(221, 'EASO', 207, 'Plaza del Centenario, s/n', 582644, 4795980, 43.3122, -1.9809),
(222, 'ELCIEGO', 82, 'C/ Gabriel Celaya, 8', 531257, 4707390, 42.5182, -2.61948),
(223, 'ERANDIO', 88, 'Avda. José Luis Goyoaga, s/n (Pasaje de Altzaga)', 501846, 4794420, 43.3027, -2.97724),
(224, 'EUROPA', 71, 'Parque Europa. Bº Txurdinaga', 507924, 4789130, 43.2549, -2.90238),
(225, 'FARMACIA', 230, 'Paseo Universidad, 7. Fac. Farmacia UPV', 526758, 4743110, 42.8401, -2.67256),
(226, 'FERIA (meteo)', 71, 'C/ Rafael Moreno Pitxitxi, s/n', 504257, 4790270, 43.2652, -2.94754),
(227, 'HERNANI', 117, 'C/ Aristizabal, s/n. Centro de salud Hernani.', 582963, 4791020, 43.2674, -1.97772),
(228, 'JAIZKIBEL', 119, 'Monte Jaizkibel, s/n', 592449, 4799510, 43.3428, -1.85941),
(229, 'LARRABETZU', 143, 'Barrio Berrezoaga, 3', 516281, 4789840, 43.2612, -2.7994),
(230, 'LAS CARRERAS', 3, 'Plaza Trinidad, s/n. Bº Las Carreras', 492103, 4796310, 43.3196, -3.0974),
(231, 'LASARTE-ORIA', 145, 'Parque Tximistarreta', 579600, 4791120, 43.2687, -2.01913),
(232, 'LEZO', 159, 'Plaza Polantzarene, s/n', 589180, 4797110, 43.3215, -1.90013),
(233, 'LLODIO', 161, 'C/ Lamuza, s/n', 502977, 4776810, 43.144, -2.96339),
(234, 'LOS HERRAN', 230, 'Parque Judizmendi. Bº Judizmendi', 527682, 4743510, 42.8437, -2.66123),
(235, 'MAZARREDO', 71, 'C/ Alameda Mazarredo, s/n (Guggenheim)', 505260, 4790520, 43.2675, -2.93519),
(236, 'MONDRAGON', 31, 'Plaza Jose María Arizmendiarrieta, s/n', 541494, 4768060, 43.0641, -2.4904),
(237, 'MONTORRA', 16, 'Barrio Montorra fte. nº5', 523022, 4784060, 43.209, -2.71659),
(238, 'MUNDAKA', 173, 'Camino Goitiz, s/n. Depósito de Agua', 524035, 4805930, 43.4059, -2.70316),
(239, 'MUNOA', 52, 'C/ Llano, 55. CEP Munoa. Bº Lutxana', 501728, 4792530, 43.2856, -2.9787),
(240, 'MUSKIZ', 177, 'C/ Giba Fregenal, s/n. Estación de Renfe', 490861, 4796440, 43.3207, -3.11272),
(241, 'Mª DIAZ HARO', 71, 'C/ Mª Díaz de Haro, 60', 504411, 4789560, 43.2588, -2.94566),
(242, 'NAUTICA', 201, 'C/ Mª Díaz de Haro, 68 (Esc. Náutica)', 498108, 4797120, 43.3269, -3.02333),
(243, 'PAGOETA', 5, 'Jardín Botánico de Iturraran. Parque Natural de Pagoeta. ', 568603, 4788990, 43.2506, -2.15489),
(244, 'PUYO', 207, 'Camino de Puyo, 14', 582404, 4794940, 43.3028, -1.98401),
(245, 'SAN JULIAN', 177, 'Camino a Valles, s/n. Bº San Julian', 490840, 4797760, 43.3326, -3.11299),
(246, 'SAN MIGUEL', 55, 'Parque pinceles. Bº San Miguel', 509217, 4785390, 43.2212, -2.88651),
(247, 'SANGRONIZ', 211, 'C/ Iturrikosolo, s/n', 505647, 4793960, 43.2984, -2.93039),
(248, 'SANTURCE', 208, 'C/ Vista Alegre, 29 ', 496550, 4797800, 43.333, -3.04256),
(249, 'SERANTES', 208, 'Camino Serantes igoera, s/n', 494894, 4797960, 43.3344, -3.06299),
(250, 'SESTAO', 210, 'Parque Portopin', 500328, 4794990, 43.3077, -2.99595),
(251, 'TOLOSA', 216, 'Avda. Martin Jose Iraola, 23', 574991, 4775750, 43.1308, -2.078),
(252, 'URKIOLA', 1, 'Urkiola auzoa, 8', 528411, 4772030, 43.1004, -2.65087),
(253, 'USURBIL', 224, 'San Inazio', 577047, 4791660, 43.2738, -2.05051),
(254, 'VALDEREJO', 225, 'Ctro. de Interpretación. Parque Natural de Valderejo', 481074, 4746980, 42.8752, -3.23173),
(255, 'ZALLA', 235, 'Avda. Kosme Bibanko Etxebarria, 2', 489078, 4784460, 43.2129, -3.13446),
(256, 'ZELAIETA PARQUE', 16, 'Parque Zelaieta ', 521564, 4785160, 43.2189, -2.7345),
(257, 'ZIERBENA (Puerto)', 245, 'Puerto de Zierbena, s/n. Bº El Puerto', 493437, 4800030, 43.3531, -3.08099),
(258, 'ZUBIETA', 207, 'URIBITARTE IBILBIDEA', 578604, 4791480, 43.2721, -2.03135),
(259, 'ZUBIETA METEO', 207, 'ZUBIETA', 578595, 4789700, 43.256, -2.03172);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `esta_en`
--

CREATE TABLE `esta_en` (
  `Cod_Espacio` int(11) NOT NULL,
  `Cod_Ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `esta_en`
--

INSERT INTO `esta_en` (`Cod_Espacio`, `Cod_Ciudad`) VALUES
(1, 45),
(2, 33),
(3, 27),
(4, 227),
(5, 225),
(6, 73),
(7, 74),
(8, 179),
(9, 191),
(10, 65),
(11, 156),
(12, 186),
(13, 111),
(14, 49),
(15, 53),
(16, 78),
(17, 111),
(18, 110),
(19, 114),
(20, 111),
(21, 119),
(22, 173),
(23, 154),
(24, 250),
(25, 107),
(26, 107),
(27, 169),
(28, 207),
(29, 121),
(30, 121),
(31, 173),
(32, 33),
(33, 111),
(34, 110),
(35, 53),
(36, 53),
(37, 129),
(38, 179),
(39, 207),
(40, 200),
(41, 250),
(42, 179),
(43, 215),
(44, 239),
(45, 207),
(46, 207),
(47, 179),
(48, 212),
(49, 245),
(1, 45),
(2, 33),
(3, 27),
(4, 227),
(5, 225),
(6, 73),
(7, 74),
(8, 179),
(9, 191),
(10, 65),
(11, 156),
(12, 186),
(13, 111),
(14, 49),
(15, 53),
(16, 78),
(17, 111),
(18, 110),
(19, 114),
(20, 111),
(21, 119),
(22, 173),
(23, 154),
(24, 250),
(25, 107),
(26, 107),
(27, 169),
(28, 207),
(29, 121),
(30, 121),
(31, 173),
(32, 33),
(33, 111),
(34, 110),
(35, 53),
(36, 53),
(37, 129),
(38, 179),
(39, 207),
(40, 200),
(41, 250),
(42, 179),
(43, 215),
(44, 239),
(45, 207),
(46, 207),
(47, 179),
(48, 212),
(49, 245),
(1, 45),
(2, 33),
(3, 27),
(4, 227),
(5, 225),
(6, 73),
(7, 74),
(8, 179),
(9, 191),
(10, 65),
(11, 156),
(12, 186),
(13, 111),
(14, 49),
(15, 53),
(16, 78),
(17, 111),
(18, 110),
(19, 114),
(20, 111),
(21, 119),
(22, 173),
(23, 154),
(24, 250),
(25, 107),
(26, 107),
(27, 169),
(28, 207),
(29, 121),
(30, 121),
(31, 173),
(32, 33),
(33, 111),
(34, 110),
(35, 53),
(36, 53),
(37, 129),
(38, 179),
(39, 207),
(40, 200),
(41, 250),
(42, 179),
(43, 215),
(44, 239),
(45, 207),
(46, 207),
(47, 179),
(48, 212),
(49, 245);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

CREATE TABLE `favoritos` (
  `Cod_Favorito` int(11) NOT NULL,
  `Cod_Usuario` int(11) NOT NULL,
  `Cod_Ubicacion` int(11) NOT NULL,
  `Tipo_Ubicacion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hash_json`
--

CREATE TABLE `hash_json` (
  `hash` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `URL` varchar(500) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hash_json`
--

INSERT INTO `hash_json` (`hash`, `URL`) VALUES
('x$s@\rZ\\%\'$', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2020/es_def/adjuntos/estaciones.json'),
('6?|2\r', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/3_DE_MARZO.json'),
('[:#R@W{k', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ABANTO.json'),
('<*=qlc:3}qN', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/AGURAIN.json'),
('WiC2sZH? Y', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ALGORTA_BBIZI2.json'),
('|\'X_', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ALONSOTEGI.json'),
('Dne!,`YL#', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ANDOAIN.json'),
('?(R+_Y[p', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ANORGA.json'),
('\\cuIs5/w(', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ARRAIZ_Monte.json'),
('mQPki', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ATEGORRIETA.json'),
('E4.=re?', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/AV_GASTEIZ.json'),
('`XB?ioVUzL[E', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/AVDA_TOLOSA.json'),
('\r09qLgO2j*', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/AZPEITIA.json'),
('0yQ?a$\r?)(:', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/BANDERAS_meteo.json'),
('O;?S\"~@', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/BARAKALDO.json'),
('6WR\"qOi', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/BASAURI.json'),
('D\rKvEF?^', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/BEASAIN.json'),
('.d\0JtV', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/BOROA_METEO.json'),
('\rpT\nA?k}', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/CASTREJANA.json'),
('@gt+tAt		', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/DURANGO.json'),
('8bTC?\ZK_NpT', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/EASO.json'),
('UxL8?E2etf?', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ELCIEGO.json'),
('n)2cFh?)l6.', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ERANDIO.json'),
('vN4D$x `A9', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/EUROPA.json'),
('\r4Jl~N?', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/FARMACIA.json'),
('3ay-?ky', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/FERIA_meteo.json'),
('6:?\\\\T/H!N(', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/HERNANI.json'),
('B5Hn%l?', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/JAIZKIBEL.json'),
('?pR;gy', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LARRABETZU.json'),
('f.s4dtt)%q', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LAS_CARRERAS.json'),
('?%Bc|=A;', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LASARTE-ORIA.json'),
('fxE->?}', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LEZO.json'),
('j>?.c1\rp', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LLODIO.json'),
('~U=', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/LOS_HERRAN.json'),
('Orv@R7n', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/M_DIAZ_HARO.json'),
('&52-Lk^', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MAZARREDO.json'),
('t+(H+F=m^', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MONDRAGON.json'),
('Y^O:\"ITŠxB', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MONTORRA.json'),
('/	´%>Zcu*=', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MUNDAKA.json'),
('\rC:\Z\"q,Pp}_', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MUNOA.json'),
('C)R%}&05i_G', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/MUSKIZ.json'),
('X6Py|_9q?J', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/NAUTICA.json'),
('R_6e8/SÇ', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/PAGOETA.json'),
('?3\\??#xNpQ', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/PUYO.json'),
('#@t_?I4\0@W&', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SAN_JULIAN.json'),
('mrY3F\Zxp3$', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SAN_MIGUEL.json'),
('?S}t\Z)w6w', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SANGRONIZ.json'),
('*7}', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SANTURCE.json'),
('T[e0};G', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SERANTES.json'),
('[M61C!', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/SESTAO.json'),
('f*v@YZR`}i', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/TOLOSA.json'),
('\Z\0[.|\\*', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/URKIOLA.json'),
('B~_1JCBn', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/USURBIL.json'),
('y(c|4&\01A', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/VALDEREJO.json'),
('kl~\ZFF', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZALLA.json'),
('d|L}EZ=', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZELAIETA_PARQUE.json'),
('O?K\n=y5kp/g', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZIERBENA_Puerto.json'),
('x,94in?Kc', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZUBIETA_METEO.json'),
('?\0`4M?P', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZUBIETA.json'),
('m?y :[j', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/datos_indice/ZUMARRAGA.json'),
('Oy~*-i? l', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2021/es_def/adjuntos/index.json'),
('G6hyt7\rr\nk', 'https://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/playas_de_euskadi/opendata/espacios-naturales.json'),
('ZSQ\'Zc;q`', 'https://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/pueblos_euskadi_turismo/opendata/pueblos.json');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `Cod_Municipio` int(11) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Cod_Provincia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`Cod_Municipio`, `Nombre`, `Cod_Provincia`) VALUES
(1, 'Abadiño', 48),
(2, 'Abaltzisketa', 20),
(3, 'Abanto y Ciérvana-Abanto Zierbena', 48),
(4, 'Aduna', 20),
(5, 'Aia', 20),
(6, 'Aizarnazabal', 20),
(7, 'Ajangiz', 48),
(8, 'Albiztur', 20),
(9, 'Alegia', 20),
(10, 'Alegría-Dulantzi', 1),
(11, 'Alkiza', 20),
(12, 'Alonsotegi', 48),
(13, 'Altzaga', 20),
(14, 'Altzo', 20),
(15, 'Amezketa', 20),
(16, 'Amorebieta-Etxano', 48),
(17, 'Amoroto', 48),
(18, 'Amurrio', 1),
(19, 'Andoain', 20),
(20, 'Anoeta', 20),
(21, 'Antzuola', 20),
(22, 'Arakaldo', 48),
(23, 'Arama', 20),
(24, 'Aramaio', 1),
(25, 'Arantzazu', 48),
(26, 'Areatza', 48),
(27, 'Aretxabaleta', 20),
(28, 'Armiñón', 1),
(29, 'Arraia-Maeztu', 1),
(30, 'Arrankudiaga', 48),
(31, 'Arrasate/Mondragón', 20),
(32, 'Arratzu', 48),
(33, 'Arratzua-Ubarrundia', 1),
(34, 'Arrieta', 48),
(35, 'Arrigorriaga', 48),
(36, 'Artea', 48),
(37, 'Artzentales', 48),
(38, 'Artziniega', 1),
(39, 'Asparrena', 1),
(40, 'Asteasu', 20),
(41, 'Astigarraga', 20),
(42, 'Ataun', 20),
(43, 'Atxondo', 48),
(44, 'Aulesti', 48),
(45, 'Ayala/Aiara', 1),
(46, 'Azkoitia', 20),
(47, 'Azpeitia', 20),
(48, 'Añana', 1),
(49, 'Bakio', 48),
(50, 'Baliarrain', 20),
(51, 'Balmaseda', 48),
(52, 'Barakaldo', 48),
(53, 'Barrika', 48),
(54, 'Barrundia', 1),
(55, 'Basauri', 48),
(56, 'Baños de', 1),
(57, 'Beasain', 20),
(58, 'Bedia', 48),
(59, 'Beizama', 20),
(60, 'Belauntza', 20),
(61, 'Berango', 48),
(62, 'Berantevilla', 1),
(63, 'Berastegi', 20),
(64, 'Bergara', 20),
(65, 'Bermeo', 48),
(66, 'Bernedo', 1),
(67, 'Berriatua', 48),
(68, 'Berriz', 48),
(69, 'Berrobi', 20),
(70, 'Bidania-Goiatz', 20),
(71, 'Bilbao', 48),
(72, 'Busturia', 48),
(73, 'Campezo/Kanpezu', 1),
(74, 'Deba', 20),
(75, 'Derio', 48),
(76, 'Dima', 48),
(77, 'Durango', 48),
(78, 'Ea', 48),
(79, 'Eibar', 20),
(80, 'Elantxobe', 48),
(81, 'Elburgo/Burgelu', 1),
(82, 'Elciego', 1),
(83, 'Elduain', 20),
(84, 'Elgeta', 20),
(85, 'Elgoibar', 20),
(86, 'Elorrio', 48),
(87, 'Elvillar/Bilar', 1),
(88, 'Erandio', 48),
(89, 'Ereño', 48),
(90, 'Ermua', 48),
(91, 'Errenteria', 20),
(92, 'Errezil', 20),
(93, 'Errigoiti', 48),
(94, 'Eskoriatza', 20),
(95, 'Etxebarri', 48),
(96, 'Etxebarria', 48),
(97, 'Ezkio-Itsaso', 20),
(98, 'Forua', 48),
(99, 'Fruiz', 48),
(100, 'Gabiria', 20),
(101, 'Gaintza', 20),
(102, 'Galdakao', 48),
(103, 'Galdames', 48),
(104, 'Gamiz-Fika', 48),
(105, 'Garai', 48),
(106, 'Gatika', 48),
(107, 'Gautegiz Arteaga', 48),
(108, 'Gaztelu', 20),
(109, 'Gernika-Lumo', 48),
(110, 'Getaria', 20),
(111, 'Getxo', 48),
(112, 'Gizaburuaga', 48),
(113, 'Gordexola', 48),
(114, 'Gorliz', 48),
(115, 'Güeñes', 48),
(116, 'Harana/Valle de Arana', 1),
(117, 'Hernani', 20),
(118, 'Hernialde', 20),
(119, 'Hondarribia', 20),
(120, 'Ibarra', 20),
(121, 'Ibarrangelu', 48),
(122, 'Idiazabal', 20),
(123, 'Igorre', 48),
(124, 'Ikaztegieta', 20),
(125, 'Irun', 20),
(126, 'Irura', 20),
(127, 'Iruraiz-Gauna', 1),
(128, 'Iruña Oka/Iruña de Oca', 1),
(129, 'Ispaster', 48),
(130, 'Itsasondo', 20),
(131, 'Iurreta', 48),
(132, 'Izurtza', 48),
(133, 'Kortezubi', 48),
(134, 'Kripan', 1),
(135, 'Kuartango', 1),
(136, 'Labastida/Bastida', 1),
(137, 'Lagrán', 1),
(138, 'Laguardia', 1),
(139, 'Lanciego/Lantziego', 1),
(140, 'Lanestosa', 48),
(141, 'Lantarón', 1),
(142, 'Lapuebla de', 1),
(143, 'Larrabetzu', 48),
(144, 'Larraul', 20),
(145, 'Lasarte-Oria', 20),
(146, 'Laukiz', 48),
(147, 'Lazkao', 20),
(148, 'Leaburu', 20),
(149, 'Legazpi', 20),
(150, 'Legorreta', 20),
(151, 'Legutio', 1),
(152, 'Leintz', 20),
(153, 'Leioa', 48),
(154, 'Lekeitio', 48),
(155, 'Lemoa', 48),
(156, 'Lemoiz', 48),
(157, 'Leza', 1),
(158, 'Lezama', 48),
(159, 'Lezo', 20),
(160, 'Lizartza', 20),
(161, 'Laudio/Llodio', 1),
(162, 'Loiu', 48),
(163, 'Mallabia', 48),
(164, 'Markina-Xemein', 48),
(165, 'Maruri-Jatabe', 48),
(166, 'Mañaria', 48),
(167, 'Mendaro', 20),
(168, 'Mendata', 48),
(169, 'Mendexa', 48),
(170, 'Meñaka', 48),
(171, 'Moreda de Álava/Moreda', 1),
(172, 'Morga', 48),
(173, 'Mundaka', 48),
(174, 'Mungia', 48),
(175, 'Munitibar-Arbatzegi Gerrikaitz', 48),
(176, 'Murueta', 48),
(177, 'Muskiz', 48),
(178, 'Mutiloa', 20),
(179, 'Mutriku', 20),
(180, 'Muxika', 48),
(181, 'Nabarniz', 48),
(182, 'Navaridas', 1),
(183, 'Oiartzun', 20),
(184, 'Okondo', 1),
(185, 'Olaberria', 20),
(186, 'Ondarroa', 48),
(187, 'Ordizia', 20),
(188, 'Urduña/Orduña', 48),
(189, 'Orendain', 20),
(190, 'Orexa', 20),
(191, 'Orio', 20),
(192, 'Ormaiztegi', 20),
(193, 'Orozko', 48),
(194, 'Ortuella', 48),
(195, 'Otxandio', 48),
(196, 'Oyón-Oion', 1),
(197, 'Oñati', 20),
(198, 'Pasaia', 20),
(199, 'Peñacerrada-Urizaharra', 1),
(200, 'Plentzia', 48),
(201, 'Portugalete', 48),
(202, 'Erriberagoitia/Ribera Alta', 1),
(203, 'Erriberabeitia', 1),
(204, 'Agurain/Salvatierra', 1),
(205, 'Samaniego', 1),
(206, 'San Millán/Donemiliaga', 1),
(207, 'Donostia / San Sebastián', 20),
(208, 'Santurtzi', 48),
(209, 'Segura', 20),
(210, 'Sestao', 48),
(211, 'Sondika', 48),
(212, 'Sopela', 48),
(213, 'Sopuerta', 48),
(214, 'Soraluze-Placencia de las', 20),
(215, 'Sukarrieta', 48),
(216, 'Tolosa', 20),
(217, 'Trucios-Turtzioz', 48),
(218, 'Ubide', 48),
(219, 'Ugao-Miraballes', 48),
(220, 'Urduliz', 48),
(221, 'Urkabustaiz', 1),
(222, 'Urnieta', 20),
(223, 'Urretxu', 20),
(224, 'Usurbil', 20),
(225, 'Valdegovía/Gaubea', 1),
(226, 'Karrantza Harana/Valle de Carranza', 48),
(227, 'Valle de Trápaga-Trapagaran', 48),
(228, 'Villabona', 20),
(229, 'Villabuena de', 1),
(230, 'Vitoria-Gasteiz', 1),
(231, 'Yécora/Iekora', 1),
(232, 'Zaldibar', 48),
(233, 'Zaldibia', 20),
(234, 'Zalduondo', 1),
(235, 'Zalla', 48),
(236, 'Zambrana', 1),
(237, 'Zamudio', 48),
(238, 'Zaratamo', 48),
(239, 'Zarautz', 20),
(240, 'Zeanuri', 48),
(241, 'Zeberio', 48),
(242, 'Zegama', 20),
(243, 'Zerain', 20),
(244, 'Zestoa', 20),
(245, 'Zierbena', 48),
(246, 'Zigoitia', 1),
(247, 'Ziortza-Bolibar', 48),
(248, 'Zizurkil', 20),
(249, 'Zuia', 1),
(250, 'Zumaia', 20),
(251, 'Zumarraga', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincias`
--

CREATE TABLE `provincias` (
  `Cod_Provincia` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `provincias`
--

INSERT INTO `provincias` (`Cod_Provincia`, `Nombre`) VALUES
(1, 'Araba/Álava'),
(20, 'Gipuzkoa'),
(48, 'Bizkaia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Cod_Usuario` int(11) NOT NULL,
  `Nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Pass` varchar(48) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos_calidad`
--
ALTER TABLE `datos_calidad`
  ADD PRIMARY KEY (`Cod_Datos`),
  ADD KEY `FK_estaciones` (`Cod_Estacion`);

--
-- Indices de la tabla `espacios_naturales`
--
ALTER TABLE `espacios_naturales`
  ADD PRIMARY KEY (`Cod_Espacio`);

--
-- Indices de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  ADD PRIMARY KEY (`Cod_Estacion`),
  ADD KEY `FK_est_mun` (`Cod_Municipio`);

--
-- Indices de la tabla `esta_en`
--
ALTER TABLE `esta_en`
  ADD KEY `FK_esta_espacio` (`Cod_Espacio`),
  ADD KEY `FK_mun_esta` (`Cod_Ciudad`);

--
-- Indices de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD PRIMARY KEY (`Cod_Favorito`),
  ADD KEY `FK_usu_fav` (`Cod_Usuario`);

--
-- Indices de la tabla `hash_json`
--
ALTER TABLE `hash_json`
  ADD PRIMARY KEY (`URL`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`Cod_Municipio`),
  ADD KEY `FK_mun_prov` (`Cod_Provincia`);

--
-- Indices de la tabla `provincias`
--
ALTER TABLE `provincias`
  ADD PRIMARY KEY (`Cod_Provincia`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Cod_Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datos_calidad`
--
ALTER TABLE `datos_calidad`
  MODIFY `Cod_Datos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=399;

--
-- AUTO_INCREMENT de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  MODIFY `Cod_Estacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=260;

--
-- AUTO_INCREMENT de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  MODIFY `Cod_Favorito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Cod_Usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `datos_calidad`
--
ALTER TABLE `datos_calidad`
  ADD CONSTRAINT `FK_estaciones` FOREIGN KEY (`Cod_Estacion`) REFERENCES `estaciones` (`Cod_Estacion`);

--
-- Filtros para la tabla `estaciones`
--
ALTER TABLE `estaciones`
  ADD CONSTRAINT `FK_est_mun` FOREIGN KEY (`Cod_Municipio`) REFERENCES `municipios` (`Cod_Municipio`);

--
-- Filtros para la tabla `esta_en`
--
ALTER TABLE `esta_en`
  ADD CONSTRAINT `FK_esta_espacio` FOREIGN KEY (`Cod_Espacio`) REFERENCES `espacios_naturales` (`Cod_Espacio`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_mun_esta` FOREIGN KEY (`Cod_Ciudad`) REFERENCES `municipios` (`Cod_Municipio`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD CONSTRAINT `FK_usu_fav` FOREIGN KEY (`Cod_Usuario`) REFERENCES `usuarios` (`Cod_Usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `FK_mun_prov` FOREIGN KEY (`Cod_Provincia`) REFERENCES `provincias` (`Cod_Provincia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
