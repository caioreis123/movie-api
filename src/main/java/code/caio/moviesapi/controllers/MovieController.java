package code.caio.moviesapi.controllers;

import code.caio.moviesapi.models.MovieModel;
import code.caio.moviesapi.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(("/movies"))
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    public List<MovieModel> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public MovieModel getMovieById(@PathVariable long id) {
        return movieRepository.findById(id);
    }

    @PostMapping
    public void createMovie(@RequestBody MovieModel movie) {
        movieRepository.save(movie);
    }

    @PutMapping("/{id}")
    @Transactional
    public void updateMovie(@PathVariable long id, @RequestBody MovieModel movie) {
        MovieModel movieToUpdate = movieRepository.findById(id);
        movieToUpdate.setName(movie.getName());
        movieToUpdate.setSynopsis(movie.getSynopsis());
        movieToUpdate.setImage(movie.getImage());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteMovie(@PathVariable long id) {
        movieRepository.deleteById(id);
    }
}
