<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberVan.php');
require_once('uberPool.php');

$uberX = new UberX("AW456", new Account("Julio Prieto", "AMS123"), "Toyota", "Camry");
$uberX->setPassenger(4);
$uberX->printDataCar();

$uberPool = new UberPool("ZAW234", new Account("Cesar Dominguez","LXTZ355"),"Seat", "Toledo");
$uberPool->printDataCar();

$uberVan = new UberVan("LOKO12", new Account("Carlos Lopez", "AMSLE123"), "NISSAN", "VERSA");
$uberVan->setPassenger(6);
$uberVan->printDataCar();
?>