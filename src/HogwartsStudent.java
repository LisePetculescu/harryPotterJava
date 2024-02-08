import java.util.List;

public class HogwartsStudent extends Student implements HogwartsPerson {

    private House house;
    private boolean prefect;
    private List<String> teams;

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
}
