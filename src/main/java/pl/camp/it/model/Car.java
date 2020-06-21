package pl.camp.it.model;

public class Car  extends Vehicle {
    public Car(int id, String brand, String model, String vin ){
        super(id, brand, model, vin);
    }
    public Car(int id, String brand, String model, String vin, boolean isRent ){ super(id, brand, model, vin, isRent); }

    @Override
    public String toString() {
        //StringBuilder sb = new StringBuilder();

        /*sb.append("Car:{\n");
        sb.append("id = ");
        //sb.append(this.id); // pole prywatne wewnatzr rodzica nie moge się gostać , ale dał mi metodę do dostania się
        sb.append(this.getId());
        sb.append("\n"); // ta metoda zwraca StringBuilder
        sb.ap*/

        /*
        sb.append("Car:{\n")
                .append("id = ")
                .append(this.getId())
                .append("\n")*/

        return new StringBuilder()
                .append("Car:{\n")
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
                .append("}")
                .toString();
    }

    /*public Car(){
        // tutaj wywoła defaultowy konstruktor rodzica ; swieci sie bład bo go nie ma - w rodzicu deaafultowego ; jak się doda w rodzicu to nie ma problemu
    }*/
}
