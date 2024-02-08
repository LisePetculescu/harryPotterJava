import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearGroup {
    private int schoolYear;
    private LocalDate beginningOfSchoolYear;
    private Student[] students;

    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear, Student[] students) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public YearGroup() {
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public LocalDate getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School Year: ").append(schoolYear).append("\n");
        sb.append("Beginning of School Year: ").append(beginningOfSchoolYear.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n");
        sb.append("Students:\n");
        for (Student student : students) {
            sb.append("- ").append(student.getFullName()).append("\n");
        }
        return sb.toString();
    }
}
