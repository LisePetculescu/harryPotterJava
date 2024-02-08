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

    // public String toString() {
   //     return name;
  //  }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("House Name: ").append(name).append("\n");
        sb.append("Founder: ").append(founder).append("\n");
        sb.append("Colours: ");
        for (String colour : colours) {
            sb.append(colour).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
        return sb.toString();
    }
}
