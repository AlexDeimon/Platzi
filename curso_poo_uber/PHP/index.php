<?php

require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberPool.php');

$uberX = new UberX("HJK309", new Account("Diego", "5062021"), "Ford", "Fiesta");
$uberX->PrintDataCar();

echo "<br>";
echo "<br>";

$uberPool = new UberPool("LÑZ506", new Account("Alejandro", "2021314"), "Lamborgini", "Devil");
$uberPool->PrintDataCar();
?>