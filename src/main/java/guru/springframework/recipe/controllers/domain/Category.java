package guru.springframework.recipe.controllers.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Category {

    @ManyToMany(mappedBy = "categories")
    Set<Recipe> recipes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
