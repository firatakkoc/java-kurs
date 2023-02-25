package OOP;
public class autosTest {
    public static void main(String[] args) {
        // referans belirliyoruz. 

        autos volvo = new autos();

        volvo.setModel("XC60");
        volvo.setWheels(4);
        volvo.setEngine("16V");
        volvo.setColor("Grey");
        volvo.setDoors(4);  

        System.out.println("Model: " + volvo.getModel());
        System.out.println("Color: " + volvo.getColor());
        System.out.println("Doors: " + volvo.getDoors());
        System.out.println("Engine: " + volvo.getEngine());
        System.out.println("Wheels: " + volvo.getWheels());

    }
}