package edu.hogwarts.data;

public abstract class TeachingMaterial {
    private String name;
    private boolean onShoppingList;
    private boolean required;
    private boolean provided;
    private String notes;

    public TeachingMaterial(String name, boolean onShoppingList, boolean required, boolean provided, String notes) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
    }

    public TeachingMaterial() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnShoppingList() {
        return onShoppingList;
    }

    public void setOnShoppingList(boolean onShoppingList) {
        this.onShoppingList = onShoppingList;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isProvided() {
        return provided;
    }

    public void setProvided(boolean provided) {
        this.provided = provided;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("On Shopping List: ").append(onShoppingList).append("\n");
        sb.append("Required: ").append(required).append("\n");
        sb.append("Provided: ").append(provided).append("\n");
        sb.append("Notes: ").append(notes).append("\n");
        return sb.toString();
    }

}