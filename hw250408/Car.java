package hw250408;

class Car {
    private static int totalCars = 0;     
    private static int redCars = 0;       
    private String color;                 

    
    public Car(String color) {
        this.color = color;
        totalCars++;
        if (color.equalsIgnoreCase("red")) {
            redCars++;
        }
    }

    
    public static int getTotalCars() {
        return totalCars;
    }

    
    public static int getRedCars() {
        return redCars;
    }
}
