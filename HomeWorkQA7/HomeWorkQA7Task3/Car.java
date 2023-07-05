package HomeWorkQA7Task3;

public class Car {

    private String color;

    private String engine;

    private String brand;

    private int wheels;


    public int getWheels() {
        return wheels;
    }


    public Car(String color, String engine, String brand, int wheels) {
        this.color = color;
        this.engine = engine;
        this.brand = brand;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
    this.color = color;

    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
     if (!brand.equals("Bmw")){
         try {
             throw new Exception("Is not Bmw");
         }catch (Exception e){
             throw new RuntimeException(e);
         }
     }
     this.brand = brand;
    }

    public void setWheels(int wheels) {
        if (wheels != 4) {
            try {
                throw new Exception("Wheels in the car should be 4!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", brand='" + brand + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
