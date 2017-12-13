-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.30
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1036`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1036`
--

CREATE TABLE `identitas_1036` (
  `nim` varchar(255) NOT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `tahun_masuk` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1036`
--

INSERT INTO `identitas_1036` (`nim`, `jurusan`, `nama`, `semester`, `tahun_masuk`) VALUES
('1555301077', 'SI', 'Anak Baru', '5', '2015'),
('1555301099', 'Teknik Listrik', 'Ivonny Ivonny', '5', '2015');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1036`
--

CREATE TABLE `ipk_1036` (
  `id` bigint(20) NOT NULL,
  `ipk` varchar(255) DEFAULT NULL,
  `nim` varchar(255) DEFAULT NULL,
  `predikat` varchar(255) DEFAULT NULL,
  `tahun` varchar(255) DEFAULT NULL,
  `identitas_nim` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1036`
--
ALTER TABLE `identitas_1036`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `ipk_1036`
--
ALTER TABLE `ipk_1036`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs7v26pooh1bw09icsoj8xtv6a` (`identitas_nim`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1036`
--
ALTER TABLE `ipk_1036`
  ADD CONSTRAINT `FKs7v26pooh1bw09icsoj8xtv6a` FOREIGN KEY (`identitas_nim`) REFERENCES `identitas_1036` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
