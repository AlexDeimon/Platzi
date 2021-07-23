<?php
require_once('Account.php');
class Car{
    public $id;
    public $licence;
    public $driver;
    public $passenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar 4 pasajeros";
        }
    
    }

    public function PrintDataCar(){
        echo "conductor: {$this->driver->name} <br> document: {$this->driver->document} <br> license: $this->license";
    }
}
?>
