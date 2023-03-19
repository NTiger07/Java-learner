package BroCode.OOP.GarageYCar;

public class Car {
    private String Brand;
    private String Model;
    private int Year;
    private String Type;
    private String Color;

    Car(String Brand, String Model, int Year, String Type, String Color) {
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.Type = Type;
        this.Color = Color;
    }

    public String getBrand() {
        return this.Brand;
    }

    public String getModel() {
        return this.Model;
    }

    public int getYear() {
        return this.Year;
    }

    public String getType() {
        return this.Type;
    }

    public String getColor() {
        return this.Color;
    }

    public String toString() {
        return String.format("Brand: %s \nModel: %s \nYear: %d \nType: %s \nColor: %s \n", this.Brand, this.Model,
                this.Year, this.Type, this.Color);
    }
}
