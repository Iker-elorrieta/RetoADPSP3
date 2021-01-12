-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-01-2021 a las 15:17:23
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

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
  `NO2ICA` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `NOXgm3` int(11) DEFAULT NULL,
  `PM10` float DEFAULT NULL,
  `PM10ICA` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `PM25` float DEFAULT NULL,
  `PM25ICA` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `SO2` float DEFAULT NULL,
  `SO2ICA` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `ICAStation` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `Cod_Estacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_calidad`
--

INSERT INTO `datos_calidad` (`Cod_Datos`, `fecha`, `hora`, `COmg m3`, `CO8Hmg m3`, `NOgm3`, `NO2`, `NO2ICA`, `NOXgm3`, `PM10`, `PM10ICA`, `PM25`, `PM25ICA`, `SO2`, `SO2ICA`, `ICAStation`, `Cod_Estacion`) VALUES
(16, '2021-01-11', '11:00:00', 0.23, 0.21, 3, 10, 'muy bueno / oso ona', 14, 5.33, 'muy bueno / oso ona', 3.58, 'muy bueno / oso ona', 4, 'muy bueno / oso ona', 'muy bueno / oso ona', 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espacios_naturales`
--

CREATE TABLE `espacios_naturales` (
  `Cod_Espacio` int(11) NOT NULL,
  `Nombre_Espacio` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Marca` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `nature_type` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `latwgs84` float NOT NULL,
  `longwgs84` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `espacios_naturales`
--

INSERT INTO `espacios_naturales` (`Cod_Espacio`, `Nombre_Espacio`, `Marca`, `nature_type`, `latwgs84`, `longwgs84`) VALUES
(25, 'Barakaldo', 'Bilbao', 'Ciudad', 43.2807, -1.94765);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estaciones`
--

CREATE TABLE `estaciones` (
  `Cod_Estacion` int(11) NOT NULL,
  `Nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Cod_Municipio` int(11) NOT NULL,
  `Direccion` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Coordenada X` float NOT NULL,
  `Coordenada Y` float NOT NULL,
  `Latitud` float NOT NULL,
  `Longitud` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estaciones`
--

INSERT INTO `estaciones` (`Cod_Estacion`, `Nombre`, `Cod_Municipio`, `Direccion`, `Coordenada X`, `Coordenada Y`, `Latitud`, `Longitud`) VALUES
(27, 'MUNOA', 11, 'C/ Llano, 55. CEP Munoa. Bº Lutxana', 501728, 4792530, 43.2856, -2.9787);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `esta_en`
--

CREATE TABLE `esta_en` (
  `Cod_Espacio` int(11) NOT NULL,
  `Cod_Ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `esta_en`
--

INSERT INTO `esta_en` (`Cod_Espacio`, `Cod_Ciudad`) VALUES
(25, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

CREATE TABLE `favoritos` (
  `Cod_Favorito` int(11) NOT NULL,
  `Cod_Ususario` int(11) NOT NULL,
  `Cod_Ubicacion` int(11) NOT NULL,
  `Tipo_Ubicacion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `favoritos`
--

INSERT INTO `favoritos` (`Cod_Favorito`, `Cod_Ususario`, `Cod_Ubicacion`, `Tipo_Ubicacion`) VALUES
(21, 0, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hash_json`
--

CREATE TABLE `hash_json` (
  `hash` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `URL` varchar(500) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hash_json`
--

INSERT INTO `hash_json` (`hash`, `URL`) VALUES
('8b9248a4e0b64bbccf82e7723a3734279bf9bbc4', 'https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2020/es_def/adjuntos/datos_indice/BARAKALDO.json');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `Cod_Municipio` int(11) NOT NULL,
  `Nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Cod_Provincia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`Cod_Municipio`, `Nombre`, `Cod_Provincia`) VALUES
(11, 'Barakaldo', 48);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincias`
--

CREATE TABLE `provincias` (
  `Cod_Provincia` int(11) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `provincias`
--

INSERT INTO `provincias` (`Cod_Provincia`, `Nombre`) VALUES
(48, 'Bizkaia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Cod_Usuario` int(11) NOT NULL,
  `Nombre` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Pass` varchar(32) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Cod_Usuario`, `Nombre`, `Pass`) VALUES
(0, 'Perry', 'reto');

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
  ADD KEY `FK_usu_fav` (`Cod_Ususario`);

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
-- AUTO_INCREMENT de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  MODIFY `Cod_Estacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  MODIFY `Cod_Favorito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

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
  ADD CONSTRAINT `FK_usu_fav` FOREIGN KEY (`Cod_Ususario`) REFERENCES `usuarios` (`Cod_Usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `FK_mun_prov` FOREIGN KEY (`Cod_Provincia`) REFERENCES `provincias` (`Cod_Provincia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
