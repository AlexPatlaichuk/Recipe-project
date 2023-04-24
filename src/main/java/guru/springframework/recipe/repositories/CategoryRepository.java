package guru.springframework.recipe.repositories;

import guru.springframework.recipe.controllers.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
