package hu.unideb.inf.springdatafx_m12.frontend;

import hu.unideb.inf.springdatafx_m12.SpringDataFxM12Application;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;

public class MainPageController {
    public void startBackend(ActionEvent actionEvent) {
        SpringApplication.run(SpringDataFxM12Application.class);
    }

    public void printData(ActionEvent actionEvent) {
    }

    public void stopBackend(ActionEvent actionEvent) {
    }
}
