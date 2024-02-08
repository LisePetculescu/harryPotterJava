public class House {
    private String name;
    private String founder;
    private String[] colours;

    public House(String name, String founder, String[] colours) {
        this.name = name;
        this.founder = founder;
        this.colours = colours;
    }

    public House() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String[] getColours() {
        return colours;
    }

    public void setColours(String[] colours) {
        this.colours = colours;
    }

    public String toString() {
        return name;
    }
}
