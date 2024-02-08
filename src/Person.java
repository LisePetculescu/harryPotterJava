public class Person {

  private String firstName;
  private String lastName;
  private String middleName;
  private int age;

  public Person(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public Person() {}

  public Person(String fullName) {
    setFullName(fullName);
  }

  public Person(String firstName, String lastName) {
    this(firstName, null, lastName);
  }

  public String toString() {
    return firstName + " " + middleName + " " + lastName;
  }

  public void makeHarry() {
    firstName = "Harry";
    lastName = "Potter";
    age = 13;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String getFullName() {
    if (hasMiddleName()) {
      return getFirstName() + " " + getMiddleName() + " " + getLastName();
    } else {
      return getFirstName() + " " + getLastName();
    }
  }

  void setFullName(String fullName) {
    String[] nameParts = fullName.split(" ");

    if (nameParts.length > 2) {
      middleName = nameParts[1];
    }
    firstName = nameParts[0];
    lastName = nameParts[nameParts.length - 1];
  }

  String getMiddleName() {
    return middleName;
  }

  void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  boolean hasMiddleName() {
    return middleName != null;
  }
}
