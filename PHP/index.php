<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');

$uberX = new UberX("AW456", new Account("Julio Prieto", "AMS123"), "Toyota", "Camry");
$uberX->printDataCar();

$uberPool = new UberPool("ZAW234", new Account("Cesar Dominguez","LXTZ355"),"Seat", "Toledo");
$uberPool->printDataCar();
?>