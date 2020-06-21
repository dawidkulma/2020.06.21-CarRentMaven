package pl.camp.it.model;

public class Bus extends Vehicle {

    // jak w rodzicu nie było domyslnego kont a był inny który nadpisał - to to swieciło się na czerwono bo ni ebyło domyslnego dla rodzica

    private int personAmount;
    private int wheelsCount;

    public Bus(int id, String brand, String model, String vin, int personAmount, int wheelsCount) {
        super(id, brand, model, vin);
        this.personAmount = personAmount;
        this.wheelsCount = wheelsCount;
    }

    public Bus(int id, String brand, String model, String vin, boolean isRent, int personAmount, int wheelsCount) {
        super(id, brand, model, vin, isRent);
        this.personAmount = personAmount;
        this.wheelsCount = wheelsCount;
    }

    // nie dodał rent bo w rodzicu nie było
/*
    public Bus(int personAmount, int wheelsCount) {
        this.personAmount = personAmount;
        this.wheelsCount = wheelsCount;
    }*/

    public int getPersonAmount() {
        return personAmount;
    }
/*
    public void setPersonAmount(int personAmount) {
        this.personAmount = personAmount;
    }*/

    public int getWheelsCount() {
        return wheelsCount;
    }
/*
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }*/

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Bus:{\n")
                .append("id = ")
                .append(this.getId())
                .append("\n")
                .append("brand ")
                .append(this.getBrand())
                .append("\n")
                .append("model = ")
                .append(this.getModel())
                .append("\n")
                .append("vin = ")
                .append(this.getVin())
                .append("\n")
                .append("personAmount = ")
                .append(this.personAmount)
                .append("\n")
                .append("wheelsCount")
                .append(this.wheelsCount)
                .append("}")
                .toString();
    }
}
