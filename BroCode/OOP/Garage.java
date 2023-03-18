package BroCode.OOP;

public class Garage {
    private int ID;
    private int TotalCapacity;
    private int RemainingCapacity;

    Garage(int ID, int TotalCapacity, int RemainingCapacity) {
        this.ID = ID;
        this.TotalCapacity = TotalCapacity;
        this.RemainingCapacity = TotalCapacity;
    }

    public int getID() {
        return this.ID;
    }

    public int getTotalCapacity() {
        return this.TotalCapacity;
    }

    public int getRemainingCapacity() {
        return this.RemainingCapacity;
    }

    public String toString() {
        return String.format("Garage of ID: %d \nTotalCapacity: %d \nRemaining Capacity: %d \n", this.ID,
                this.TotalCapacity, this.RemainingCapacity);
    }

    public String park(Car car) {
        this.RemainingCapacity -= 1;
        return String.format("%c has been parked", this.park(car));
    }
}
