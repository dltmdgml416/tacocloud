package tacos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Taco {

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public Date getCreatedAt()                       { return createdAt; }
    public void setCreatedAt(Date createdAt)         { this.createdAt = createdAt; }

    public String getName()                          { return name; }
    public void setName(String name)                 { this.name = name; }

    public List<Ingredient> getIngredients()                     { return ingredients; }
    public void setIngredients(List<Ingredient> ingredients)     { this.ingredients = ingredients; }

    @Override
    public String toString() {
        return "Taco{name='" + name + "'}";
    }
}
