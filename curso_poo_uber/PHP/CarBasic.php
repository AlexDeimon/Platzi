<?php
require_once('Car.php');
class CarBasic extends Car{
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model) {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }

    public function PrintDataCar(){
        echo " <br> brand: $this->brand <br> model: $this->model";
    }

}
?>