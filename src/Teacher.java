import java.time.LocalDate;

public class Teacher extends Person {
    private String empType;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher(String firstName, String middleName, String lastName, String empType, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, middleName, lastName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String empType, LocalDate employmentStart, LocalDate employmentEnd) {
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String fullName, String empType, LocalDate employmentStart, LocalDate employmentEnd) {
        super(fullName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher() {
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public void setEmploymentStart(String dateString) {
        this.employmentStart = LocalDate.parse(dateString);
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }
}
