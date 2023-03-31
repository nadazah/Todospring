package todo.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.model.Todo;

@EntityScan(basePackages = "todo.model" )
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
