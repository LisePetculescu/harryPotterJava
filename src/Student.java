public class Student extends Person {

  private int enrollmentYear;
  private int graduationYear;
  private boolean graduated;

  public Student(String firstName, String middleName, String lastName, int enrollmentYear, int graduationYear, boolean graduated) {
    super(firstName, middleName, lastName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = graduated;
  }

  public Student() {
  }


  public Student(String fullName) {
    setFullName(fullName);
  }

  public Student(

          String firstName,
          String middleName,
          String lastName
  ) {

    // this.firstName = firstName;
    // this.middleName = middleName;
    // this.lastName = lastName;
    super(firstName, middleName, lastName);
  }

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public int getGraduationYear() {
    return graduationYear;
  }

  public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
  }

  public boolean isGraduated() {
    return graduated;
  }

  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }



}
