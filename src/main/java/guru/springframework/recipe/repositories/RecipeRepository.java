package guru.springframework.recipe.repositories;

import guru.springframework.recipe.controllers.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
