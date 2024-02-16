package edu.hogwarts.data;

public class Tool extends TeachingMaterial {
    private String description;

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String description) {
        super(name, onShoppingList, required, provided, notes);
        this.description = description;
    }

    public Tool() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Description: ").append(description).append("\n");
        sb.append("On Shopping List: ").append(isOnShoppingList()).append("\n");
        sb.append("Required: ").append(isRequired()).append("\n");
        sb.append("Provided: ").append(isProvided()).append("\n");
        sb.append("Notes: ").append(getNotes()).append("\n");
        return sb.toString();
    }
}

