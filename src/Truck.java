public class Truck implements Vehicle{
private String type;
private int week;
private final int RATE=500;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public Truck() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getRate() {
        return RATE;
    }

    @Override
    public double calculateRentalCost() {
        return this.getWeek()*this.RATE;

    }


    @Override
    public void displayDetails() {
        System.out.println("Truck type"+ type + '\n' +
                "Weekly Rental Rate:"+this.RATE+ "SR\n" +
                "Rental Cost:"+this.calculateRentalCost()+"SR");    }

    @Override
    public String toString() {
        return "Truck type"+ type + '\n' +
                "Weekly Rental Rate=" +this.RATE+ "SR\n" +
                "Rental Cost:=" + this.calculateRentalCost();
    }
}
