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
    return getFullName();
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

  public String getFullName() {
    if (hasMiddleName()) {
      return getFirstName() + " " + getMiddleName() + " " + getLastName();
    } else {
      return getFirstName() + " " + getLastName();
    }
  }

  public void setFullName(String fullName) {
    String[] nameParts = fullName.split(" ");

    if (nameParts.length > 2) {
      middleName = nameParts[1];
    }
    firstName = nameParts[0];
    lastName = nameParts[nameParts.length - 1];
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public boolean hasMiddleName() {
    return middleName != null;
  }
}
