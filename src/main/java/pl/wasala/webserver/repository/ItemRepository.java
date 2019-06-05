package pl.wasala.webserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wasala.webserver.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
