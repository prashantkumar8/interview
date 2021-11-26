package acko.testing.acko.repository;

import acko.testing.acko.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {
    Team save(Team team);
}
