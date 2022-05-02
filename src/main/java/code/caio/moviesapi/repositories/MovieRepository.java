package code.caio.moviesapi.repositories;

import code.caio.moviesapi.models.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieModel, Long> {
    public MovieModel findById(long id);
}
