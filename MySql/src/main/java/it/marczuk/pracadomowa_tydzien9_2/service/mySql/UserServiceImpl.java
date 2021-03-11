package it.marczuk.pracadomowa_tydzien9_2.service.mySql;

import it.marczuk.pracadomowa_tydzien9_2.aspect.ReadTimeMeasure;
import it.marczuk.pracadomowa_tydzien9_2.aspect.SaveTimeMeasure;
import it.marczuk.pracadomowa_tydzien9_2.model.User;
import it.marczuk.pracadomowa_tydzien9_2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo repo;

    @Autowired
    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    @ReadTimeMeasure
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    @SaveTimeMeasure
    public void saveAll(List<User> users) {
        repo.saveAll(users);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}
