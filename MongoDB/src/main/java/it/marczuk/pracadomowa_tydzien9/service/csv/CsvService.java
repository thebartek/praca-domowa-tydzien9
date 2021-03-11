package it.marczuk.pracadomowa_tydzien9.service.csv;

import it.marczuk.pracadomowa_tydzien9.model.User;

import java.util.List;

public interface CsvService {

    List<User> readCsvUser();
}
