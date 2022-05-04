package code.caio.moviesapi.repositories;

import code.caio.moviesapi.models.UserModel;

public interface UserRepository {
    UserModel findByLogin(String username);
}
