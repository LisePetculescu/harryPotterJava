import java.time.LocalDate;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName, House house) {
        super(fullName, "Tenure", null, null);
        this.house = house;

    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }
}
