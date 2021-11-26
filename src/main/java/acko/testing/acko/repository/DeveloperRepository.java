package acko.testing.acko.repository;

import acko.testing.acko.model.Developer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer,Long> {

    @Query(value = "Select * from developer d where d.team_id= ?1 and notification_flag=false order by id desc limit 1", nativeQuery = true)
    Developer findDeveloperByTeamId(long teamId);

    @Query(value = "Update developer set notification_flag=false where d.team_id= ?1", nativeQuery = true)
    Developer updateTeam(long teamId);

    @Query(value = "Update developer set notification_flag=true where d.id= ?1", nativeQuery = true)
    Developer updateDeveloper(long Id);
}
