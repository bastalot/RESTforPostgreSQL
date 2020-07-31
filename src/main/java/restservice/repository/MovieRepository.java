package restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Movie;

@RestResource(exported = false)
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
