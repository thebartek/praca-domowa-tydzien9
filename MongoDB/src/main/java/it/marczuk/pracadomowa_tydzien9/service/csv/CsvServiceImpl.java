package it.marczuk.pracadomowa_tydzien9.service.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import it.marczuk.pracadomowa_tydzien9.model.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

@Service
public class CsvServiceImpl implements CsvService {

    private static final String DATA_PATH = "./src/main/resources/static/MOCK_DATA.csv";

    @Override
    public List<User> readCsvUser() {
        try {
            Reader reader = Files.newBufferedReader(Path.of(DATA_PATH));
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<User> users = csvToBean.parse();
            reader.close();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
