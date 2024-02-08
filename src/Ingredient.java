public class Ingredient extends TeachingMaterial {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String name1, double amount, String unit) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name1;
        this.amount = amount;
        this.unit = unit;
    }

    public Ingredient() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Amount: ").append(amount).append(" ").append(unit).append("\n");
        sb.append("On Shopping List: ").append(isOnShoppingList()).append("\n");
        sb.append("Required: ").append(isRequired()).append("\n");
        sb.append("Provided: ").append(isProvided()).append("\n");
        sb.append("Notes: ").append(getNotes()).append("\n");
        return sb.toString();
    }
}
