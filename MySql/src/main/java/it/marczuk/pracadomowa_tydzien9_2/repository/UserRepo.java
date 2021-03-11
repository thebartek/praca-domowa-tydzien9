package it.marczuk.pracadomowa_tydzien9_2.repository;

import it.marczuk.pracadomowa_tydzien9_2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
