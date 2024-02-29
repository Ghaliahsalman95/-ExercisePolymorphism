public class Car implements Vehicle{
    private final double rate=50;
private String model;
    private int day;


    public Car() {
    }

    public Car(String model, int day) {
        this.model = model;
        this.day = day;
    }

    public double getRate() {
        return rate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public double calculateRentalCost() {
        return this.getDay()*rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model:" +this.model+'\n'+
                "Daily Rental Rate:" + rate +"SR"+'\n'+
                "Rental Cost:" + this.calculateRentalCost() +"SR"+'\n');
    }

    @Override
    public String toString() {
        return  "Car Model: " +this.model+'\n'+
                "Daily Rental Rate: " + rate +'\n'+
                "Rental Cost: " + this.calculateRentalCost() +'\n';
    }
}
