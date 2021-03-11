package it.marczuk.pracadomowa_tydzien9.service.mgdb;

import it.marczuk.pracadomowa_tydzien9.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveAll(List<User> users);

    void deleteAll();
}
