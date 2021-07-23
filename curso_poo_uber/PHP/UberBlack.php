<?php
require_once('CarAdvanced.php');
class UberBlack extends CarAdvanced{
    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license, $driver, $typeCarAccepted, $seatsMaterial);
    }
}
?>