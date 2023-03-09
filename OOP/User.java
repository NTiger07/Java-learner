package OOP;

import java.time.LocalDate;
import java.time.Period;

public class User {
    public String name;
    public LocalDate DOB;

    public int age() {
        Period age = Period.between(this.DOB, LocalDate.now());
        return age.getYears();
    }

}
