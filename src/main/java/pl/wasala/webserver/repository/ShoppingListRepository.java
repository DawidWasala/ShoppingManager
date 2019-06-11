package pl.wasala.webserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.wasala.webserver.model.ShoppingList;

@RepositoryRestResource
public interface ShoppingListRepository extends CrudRepository<ShoppingList, Long> {
}
