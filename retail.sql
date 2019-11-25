-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2019 at 08:26 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `retail`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `ID_Barang` varchar(10) NOT NULL,
  `ID_Katagori` varchar(10) NOT NULL,
  `Nama_Barang` varchar(50) NOT NULL,
  `Harga_Barang` int(11) NOT NULL,
  `Tanggal_Masuk` date NOT NULL,
  `Tanggal_Kadaluarsa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bon`
--

CREATE TABLE `bon` (
  `ID_Bon` varchar(15) NOT NULL,
  `Tanggal_Transaksi` date NOT NULL,
  `Subtotal` bigint(20) NOT NULL,
  `ID_Petugas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cabang`
--

CREATE TABLE `cabang` (
  `ID_Cabang` varchar(10) NOT NULL,
  `ID_Kota` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `katagori`
--

CREATE TABLE `katagori` (
  `ID_Katagori` varchar(10) NOT NULL,
  `Nama_Katagori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kota`
--

CREATE TABLE `kota` (
  `ID_Kota` varchar(5) NOT NULL,
  `Nama_Kota` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `ID_Petugas` varchar(10) NOT NULL,
  `Nama_Petugas` varchar(30) NOT NULL,
  `ID_Cabang` varchar(10) NOT NULL,
  `Shift` varchar(5) NOT NULL,
  `Tanggal_Masuk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `storage`
--

CREATE TABLE `storage` (
  `ID_Barang` varchar(10) NOT NULL,
  `ID_Katagori` varchar(10) NOT NULL,
  `Stock` int(11) NOT NULL,
  `ID_Supplier` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `ID_Supplier` varchar(10) NOT NULL,
  `Nama_Supplier` varchar(50) NOT NULL,
  `ID_Kota` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `ID_Transaksi` varchar(10) NOT NULL,
  `ID_Barang` varchar(10) NOT NULL,
  `Jumlah_Barang` int(11) NOT NULL,
  `Harga_Total` bigint(20) NOT NULL,
  `ID_Bon` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`ID_Barang`),
  ADD KEY `katagori` (`ID_Katagori`) USING BTREE;

--
-- Indexes for table `bon`
--
ALTER TABLE `bon`
  ADD PRIMARY KEY (`ID_Bon`),
  ADD KEY `petugas` (`ID_Petugas`);

--
-- Indexes for table `cabang`
--
ALTER TABLE `cabang`
  ADD PRIMARY KEY (`ID_Cabang`),
  ADD KEY `kota` (`ID_Kota`) USING BTREE;

--
-- Indexes for table `katagori`
--
ALTER TABLE `katagori`
  ADD PRIMARY KEY (`ID_Katagori`);

--
-- Indexes for table `kota`
--
ALTER TABLE `kota`
  ADD PRIMARY KEY (`ID_Kota`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`ID_Petugas`),
  ADD KEY `cabang` (`ID_Cabang`);

--
-- Indexes for table `storage`
--
ALTER TABLE `storage`
  ADD KEY `barang` (`ID_Barang`),
  ADD KEY `katagori` (`ID_Katagori`),
  ADD KEY `supplier` (`ID_Supplier`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`ID_Supplier`),
  ADD KEY `kota` (`ID_Kota`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`ID_Transaksi`),
  ADD KEY `barang` (`ID_Barang`),
  ADD KEY `bon` (`ID_Bon`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`ID_Katagori`) REFERENCES `katagori` (`ID_Katagori`);

--
-- Constraints for table `bon`
--
ALTER TABLE `bon`
  ADD CONSTRAINT `bon_ibfk_1` FOREIGN KEY (`ID_Petugas`) REFERENCES `petugas` (`ID_Petugas`);

--
-- Constraints for table `cabang`
--
ALTER TABLE `cabang`
  ADD CONSTRAINT `cabang_ibfk_1` FOREIGN KEY (`ID_Kota`) REFERENCES `kota` (`ID_Kota`);

--
-- Constraints for table `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `petugas_ibfk_1` FOREIGN KEY (`ID_Cabang`) REFERENCES `cabang` (`ID_Cabang`);

--
-- Constraints for table `storage`
--
ALTER TABLE `storage`
  ADD CONSTRAINT `storage_ibfk_1` FOREIGN KEY (`ID_Katagori`) REFERENCES `katagori` (`ID_Katagori`),
  ADD CONSTRAINT `storage_ibfk_2` FOREIGN KEY (`ID_Barang`) REFERENCES `barang` (`ID_Barang`),
  ADD CONSTRAINT `storage_ibfk_3` FOREIGN KEY (`ID_Supplier`) REFERENCES `supplier` (`ID_Supplier`);

--
-- Constraints for table `supplier`
--
ALTER TABLE `supplier`
  ADD CONSTRAINT `supplier_ibfk_1` FOREIGN KEY (`ID_Kota`) REFERENCES `kota` (`ID_Kota`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`ID_Barang`) REFERENCES `barang` (`ID_Barang`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`ID_Bon`) REFERENCES `bon` (`ID_Bon`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
