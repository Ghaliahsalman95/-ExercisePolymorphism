public class Bike implements Vehicle{
    private String Brand;
    private final int rate =10;
    private int hours;

    public Bike(String brand, int hours) {
        Brand = brand;
        this.hours = hours;
    }

    public Bike() {
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getRate() {
        return rate;
    }



    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return this.getHours() * rate;
    }
    @Override
    public void displayDetails() {
        System.out.println("Bike Brand:"+this.Brand + '\n' +
                "Hourly Rental Rate:"+rate +"SR\n" +
                "Rental Cost:"+this.calculateRentalCost()+"SR");  }

    @Override
    public String toString() {
        return "Bike Brand: " + this.Brand + '\n' +
                "Hourly Rental Rate: " + rate +'\n' +
                "Rental Cost: " +this.calculateRentalCost();
    }
}
