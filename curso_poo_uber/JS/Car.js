// function Car(licence, driver){
//     this.id;
//     this.licence = licence;
//     this.driver = driver;
//     this.passenger;
// }

// Car.prototype.printDataCar = function(){
//     console.log(this.driver)
//     console.log(this.driver.name)
//     console.log(this.driver.document)
// }
class Car{
    constructor(licence, driver){
        this.id;
        this.licence = licence;
        this.driver = driver;
        this.passenger;
    }

    printDataCar = () => {
        console.table(this.driver) //imprimirá una tabla con todos los datos
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}