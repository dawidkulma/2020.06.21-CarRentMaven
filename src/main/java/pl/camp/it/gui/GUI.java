package pl.camp.it.gui;

import pl.camp.it.model.Vehicle;
import pl.camp.it.db.VehicleRepository;

import java.util.Scanner;

public class GUI {

    private static final VehicleRepository cr = new VehicleRepository();
    private static final Scanner scanner = new Scanner(System.in);

    /*
    CarRepository cr;
    GUI(){
        cr = new CarRepository();
    }
    */ // konstruktor niepotrzebny bo obiekt od niczego nie zależy

    public static void showMainMenu(){
        System.out.println("1. Dostępne samochody");
        System.out.println("2. Wypożycz samochód");
        System.out.println("3. Exit");

        //Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        //System.out.println(choose);

        switch (choose){
            case "1":
                /*
                for (Car temporaryCar : this.cr.carList) {
                    if (temporaryCar != null && !temporaryCar.rent){
                        System.out.println("--------------------------");
                        System.out.println("Id: " + temporaryCar.id);
                        System.out.println("Marka " + temporaryCar.brand);
                        System.out.println("Model " + temporaryCar.model);
                        System.out.println("VIN " + temporaryCar.vin);
                        System.out.println("--------------------------");
                    }
                }
                this.showMainMenu();
                */
                //this.showCars();
                showCars();
                break;

            case "2":
                /*
                System.out.println("Wpisz id samochodu:");
                String carId = scanner.nextLine();
                for (Car temporaryCar : this.cr.carList){
                    if (temporaryCar.id == Integer.parseInt(carId)){
                        if (!temporaryCar.rent) {
                            temporaryCar.rent = true;
                            System.out.println("Udało sie !!");
                            //break;
                        } else {
                            System.out.println("Auto niedostępne !!");
                            //break;
                        }
                        break;
                    }
                }
                this.showMainMenu();//jeżeli ktoś chce wypożyczyć wiecej aut
                */
                //this.rentCar();
                rentCar();
                break;
            case "3":
                System.exit(0); // program się zamyka, kończy się jvm, wyjście z programu natychmiast
                //break; // tutaj akurat wychodzi, że break kończy program, bo skończy się switch i skończy się ta metoda
            default:
                //System.out.println("Nieprawidłowy wybór !!");
                //this.showMainMenu();
                showMainMenu();
                break;
        }

    }

    private static void showCars(){
        for (Vehicle temporaryVehicle : cr.getVehicles()) {
            if (temporaryVehicle != null && !temporaryVehicle.isRent()){
                /*if (temporaryVehicle instanceof Car){

                } else if (temporaryVehicle instanceof Bus){

                }*/
                /*
                System.out.println("--------------------------");
                System.out.println("Id: " + temporaryVehicle.getId());
                System.out.println("Marka " + temporaryVehicle.getBrand());
                System.out.println("Model " + temporaryVehicle.getModel());
                System.out.println("VIN " + temporaryVehicle.getVin());
                System.out.println("--------------------------");*/

                //System.out.println(temporaryVehicle.toString()); // nie musimy pisać to Stinrg - mamy to przeciążono i dla OBJECT sama woła toString
                System.out.println(temporaryVehicle); //baardziej eleganckie rozwiązanie
                // klasa Gui nie ma wiedzy o sposobie wypisywania samochodów - jest to napisane w poszczególnych klasach w metodzie toString()
            }
        }
        //this.showMainMenu();
        showMainMenu();
    }

    private static void rentCar(){
        System.out.println("Wpisz id samochodu:");
        String carId = scanner.nextLine();
        for (Vehicle temporaryVehicle : cr.getVehicles()){
            try{
                if (temporaryVehicle != null && temporaryVehicle.getId() == Integer.parseInt(carId)){
                    if (!temporaryVehicle.isRent()) {
                        temporaryVehicle.setRent(true);
                        System.out.println("Udało sie !!");
                        //break;
                    } else {
                        System.out.println("Auto niedostępne !!");
                        //break;
                    }
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Wprowadzone błędne id: ");
                rentCar();
            }
        }
        //this.showMainMenu();//jeżeli ktoś chce wypożyczyć wiecej aut
        showMainMenu();
    }
    static{

    }
}
