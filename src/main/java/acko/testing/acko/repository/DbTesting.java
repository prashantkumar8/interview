package acko.testing.acko.repository;

import acko.testing.acko.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DbTesting extends CrudRepository<Task, Long> {

    Optional<Task> findById(Long taskId);

}
