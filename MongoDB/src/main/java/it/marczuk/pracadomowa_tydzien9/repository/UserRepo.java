package it.marczuk.pracadomowa_tydzien9.repository;

import it.marczuk.pracadomowa_tydzien9.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
}
