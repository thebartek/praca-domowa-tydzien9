package it.marczuk.pracadomowa_tydzien9_2.service.mySql;

import it.marczuk.pracadomowa_tydzien9_2.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveAll(List<User> users);

    void deleteAll();
}
