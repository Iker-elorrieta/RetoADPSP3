-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-01-2021 a las 16:18:33
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `esta_en`
--

CREATE TABLE `esta_en` (
  `Cod_Espacio` int(11) NOT NULL,
  `Cod_Ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `Cod_Municipio` int(11) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Cod_Provincia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincias`
--

CREATE TABLE `provincias` (
  `Cod_Provincia` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Cod_Usuario` int(11) NOT NULL,
  `Nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Pass` longtext COLLATE utf8_spanish_ci NOT NULL
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
  MODIFY `Cod_Datos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70679;

--
-- AUTO_INCREMENT de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  MODIFY `Cod_Estacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=673;

--
-- AUTO_INCREMENT de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  MODIFY `Cod_Favorito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Cod_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
