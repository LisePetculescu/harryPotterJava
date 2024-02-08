public class Wand extends TeachingMaterial {
    private double lengthInInches;
    private String wood;
    private String core;

    public Wand(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double lengthInInches, String wood, String core) {
        super(name, onShoppingList, required, provided, notes);
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    public Wand() {
    }




    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Length: ").append(lengthInInches).append(" inches\n");
        sb.append("Wood: ").append(wood).append("\n");
        sb.append("Core: ").append(core).append("\n");
        sb.append("On Shopping List: ").append(isOnShoppingList()).append("\n");
        sb.append("Required: ").append(isRequired()).append("\n");
        sb.append("Provided: ").append(isProvided()).append("\n");
        sb.append("Notes: ").append(getNotes()).append("\n");
        return sb.toString();
    }
}
