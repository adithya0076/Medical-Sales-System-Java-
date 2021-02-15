-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 15, 2021 at 03:07 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medical_sales`
--

-- --------------------------------------------------------

--
-- Table structure for table `distributor`
--

DROP TABLE IF EXISTS `distributor`;
CREATE TABLE IF NOT EXISTS `distributor` (
  `distributor_id` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `distributor_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `distributor_city` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `distributor`
--

INSERT INTO `distributor` (`distributor_id`, `distributor_name`, `distributor_city`) VALUES
('DI03', 'Southern Central Distributors', 'Galle'),
('DI02', 'Sunshine Distributors', 'Colombo'),
('DI01', 'JanaLanka Distributors', 'Kandy'),
('DI04', 'Gem City Capital Distributors', 'Rathnapura'),
('DI05', 'North Central DIstributors', 'Anuradhapura');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_list`
--

DROP TABLE IF EXISTS `doctor_list`;
CREATE TABLE IF NOT EXISTS `doctor_list` (
  `doctor_ID` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `doctor_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `doctor_list`
--

INSERT INTO `doctor_list` (`doctor_ID`, `doctor_name`) VALUES
('D01', 'Abeygunawardane'),
('D02', 'Damith Ratnayake'),
('D03', 'Adithya Rathnayake'),
('D04', 'Samarawikrama'),
('D05', 'Shanika Perera'),
('D06', 'Jason De Silva'),
('D07', 'Dani Loyd');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_records`
--

DROP TABLE IF EXISTS `doctor_records`;
CREATE TABLE IF NOT EXISTS `doctor_records` (
  `doctor_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_ID` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_volume` double NOT NULL,
  `quantity` double NOT NULL,
  `sales_amount` double NOT NULL,
  `sale_date` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `doctor_records`
--

INSERT INTO `doctor_records` (`doctor_name`, `product_ID`, `product_name`, `product_volume`, `quantity`, `sales_amount`, `sale_date`) VALUES
('Damith Ratnayake', 'P02', 'Meftal', 400, 5, 2000, '2/4/2021 12:00:00 AM'),
('Damith Ratnayake', 'P02', 'Meftal', 400, 3, 750, '2/5/2021 12:00:00 AM'),
('Adithya Rathnayake', 'P06', 'Panadol', 250, 3, 750, '12/27/2021');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `fname` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `lname` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `region` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`email`, `fname`, `lname`, `region`, `pwd`) VALUES
('demo12', 'Adithya', 'Rathnayake', 'KANDY', '123'),
('test', 'tests', 'testss', 'KANDY', '');

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
CREATE TABLE IF NOT EXISTS `login_info` (
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`email`, `password`) VALUES
('demo12', 'demo12'),
('demo123@gmail.com', 'demo12'),
('demo12@gmail.com', 'demo12');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy_list`
--

DROP TABLE IF EXISTS `pharmacy_list`;
CREATE TABLE IF NOT EXISTS `pharmacy_list` (
  `pharmacy_ID` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pharmacy_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `pharmacy_list`
--

INSERT INTO `pharmacy_list` (`pharmacy_ID`, `pharmacy_name`) VALUES
('P01', 'Amaya Pharmacy'),
('P02', 'Max Pharmacy'),
('P03', 'Orange Pharmacy'),
('P04', 'All Star Pharmacy'),
('P06', 'Arpico Pharmacy'),
('P07', 'Pilimatalawa Central Pharmacy');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy_records`
--

DROP TABLE IF EXISTS `pharmacy_records`;
CREATE TABLE IF NOT EXISTS `pharmacy_records` (
  `pharmacy_ID` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pharmacy_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_ID` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_volume` double NOT NULL,
  `product_qty` double NOT NULL,
  `sales_amount` double NOT NULL,
  `sales_date` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `pharmacy_records`
--

INSERT INTO `pharmacy_records` (`pharmacy_ID`, `pharmacy_name`, `product_ID`, `product_name`, `product_volume`, `product_qty`, `sales_amount`, `sales_date`) VALUES
('P04', 'All Star Pharmacy', 'P02', 'Meftal', 300, 3, 1500, '2/2/2021 12:00:00 AM'),
('P02', 'Max Pharmacy', 'P02', 'Meftal', 240, 3, 750, '2/5/2021 12:00:00 AM'),
('P02', 'Max Pharmacy', 'P02', 'Meftal', 500, 5, 1250, 'MM/d/YYYY'),
('P06', 'Arpico Pharmacy', 'P06', 'Panadol', 250, 6, 1500, '12/27/2021');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `product_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `product_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `product_volume` double NOT NULL,
  `product_price` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_ID`, `product_name`, `product_volume`, `product_price`) VALUES
('P01', 'Amoxylin', 400, 200),
('P02', 'Meftal', 300, 250),
('P03', 'Ascoril', 400, 550),
('P04', 'Panadol Syrup', 500, 350),
('P05', 'Nutricia', 600, 450),
('P06', 'Panadol', 250, 25),
('P07', 'Nutra-d', 500, 960);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
