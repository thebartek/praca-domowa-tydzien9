package it.marczuk.pracadomowa_tydzien9.app;

import it.marczuk.pracadomowa_tydzien9.model.User;
import it.marczuk.pracadomowa_tydzien9.service.csv.CsvService;
import it.marczuk.pracadomowa_tydzien9.service.mgdb.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class start {

    private UserService userService;
    private CsvService csvService;

    @Autowired
    public start(UserService userService, CsvService csvService) {
        this.userService = userService;
        this.csvService = csvService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        List<User> users = csvService.readCsvUser();
        userService.deleteAll();
        userService.saveAll(users);
        userService.findAll();
    }
}
