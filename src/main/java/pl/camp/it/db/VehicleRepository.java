package pl.camp.it.db;

import pl.camp.it.model.Bus;
import pl.camp.it.model.Car;
import pl.camp.it.model.Vehicle;

public class VehicleRepository {
    //private Car[] carList = new Car[10];
    private Vehicle[] vehicles = new Vehicle[10];

    public VehicleRepository(){
        Car c1 = new Car(1,"BMW", "3","jkasydg");
/*
        Car c2 = new Car();
        c2.id = 2;
        c2.brand = "Toyota";
        c2.model = "Corolla";
        c2.vin = "yuuyruru";
        c2.rent = false;
*/
        Car c3 = new Car(3, "Audi", "A5", "qry6535qwy");

        this.vehicles[0] = c1;
        //this.carList[1] = c2;
        this.vehicles[2] = c3;

        this.vehicles[3] = new Bus(4, "Solaris",
                "152", "hjsgdfa", 40, 6); // białe znaki nic nie dają

        this.vehicles[4] = new Bus(5, "Solaris",
                "152", "hjsgdfa", 40, 6);

    }
/*
    public Car[] getVehicles() {
        return vehicles;
    }*/
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    /*
    public void setCarList(Car[] carList) {
        this.carList = carList;
    }*/
}
