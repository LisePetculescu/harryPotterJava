import java.util.List;

public class HogwartsStudent extends Student implements HogwartsPerson {

    private House house;
    private boolean prefect;
    private List<String> teams;

    public HogwartsStudent(String firstName, String middleName, String lastName, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, List<String> teams) {
        super(firstName, middleName, lastName, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }


    public HogwartsStudent() {
    }

    @Override
    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public House getHouse() {
        return house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getFullName()).append("\n");
        sb.append("Enrollment Year: ").append(getEnrollmentYear()).append("\n");
        sb.append("Graduation Year: ").append(getGraduationYear()).append("\n");
        sb.append("Graduated: ").append(isGraduated()).append("\n");
        sb.append("House: ").append(house.getName()).append("\n");
        sb.append("Prefect: ").append(prefect ? "Yes" : "No").append("\n");
        sb.append("Teams: ");
        if (teams != null) {
            for (String team : teams) {
                sb.append(team).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
        } else {
            sb.append("None");
        }
        return sb.toString();
    }

}
