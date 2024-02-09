import java.time.LocalDate;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName, House house) {
        super(fullName, "Tenure", null, null);
        this.house = house;

    }

    public HogwartsTeacher(String firstName, String middleName, String lastName, String empType, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher() {
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Name: ").append(getFullName()).append("\n");
        sb.append("Employment Type: ").append(getEmpType()).append("\n");
        sb.append("House: ").append(house.getName()).append("\n");
        sb.append("Head of House: ").append(headOfHouse ? "Yes" : "No").append("\n");
        return sb.toString();
    }

}
