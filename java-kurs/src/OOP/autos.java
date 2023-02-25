package OOP;
public class autos {
    
    // Objemizin özelliklerini olusturuyoruz. 

    private String model; // 
    private String engine; //
    private int doors; //
    private int wheels; //
    private String color;

    // Model
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    // Engine
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getEngine() {
        return this.engine;
    }
    //Doors
    public void setDoors(int doors) {
        if (doors < 0) {
            System.out.println("Do not enter 0");
        }
        else {
            this.doors = doors;
        }
    }
    public int getDoors() {
        return this.doors;
    }
    // Wheels
    public void setWheels (int wheels) {
        if (wheels < 0) {
            System.out.println("Do not enter 0");
        }
        else {
            this.wheels = wheels;
        }
    }
    public int getWheels() {
        return this.wheels;
    }
    // Color
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}

/*Java'da "this" anahtar kelimesi, bir sınıfın kendi özelliklerine veya metodlarına erişmek için kullanılır. 
Bu anahtar kelimesi, sınıf içindeki bir metotta,
o sınıfın özelliklerine erişmek veya o sınıfın başka bir metodunu çağırmak için kullanılabilir. */