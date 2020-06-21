package pl.camp.it.model;

public class Vehicle {
    private int id;
    private String brand;
    private String model;
    private String vin;
    private boolean rent;

    public Vehicle(int id, String brand, String model, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.rent = false;
    }

    public Vehicle() { // zrobienie tego konstruktora to furtka na stworzenie niestandardowego samochodu
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getBrand() {
        return brand;
    }

    /*public void setBrand(String brand) {
        this.brand = brand;
    }*/

    public String getModel() {
        return model;
    }

    /*
    public void setModel(String model) {
        this.model = model;
    }
    */

    public String getVin() {
        return vin;
    }

    /*
    public void setVin(String vin) {
        this.vin = vin;
    }*/

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}
