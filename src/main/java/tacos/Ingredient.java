package tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ingredients")
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;

    public Ingredient() {}

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId()       { return id; }
    public String getName()     { return name; }
    public Type   getType()     { return type; }

    public void setId(String id)     { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setType(Type type)   { this.type = type; }

    @Override
    public String toString() {
        return "Ingredient{id='" + id + "', name='" + name + "', type=" + type + "}";
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
