package hu.unideb.inf.springdatafx_m12.frontend;

import hu.unideb.inf.springdatafx_m12.SpringDataFxM12Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    public Label nameLabel;

    private ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxM12Application.class);
    }

    public void printData(ActionEvent actionEvent) {
        SpringDataFxM12Application myApp;
        myApp = ctx.getBean(SpringDataFxM12Application.class);

        myApp.printData();
        System.out.println("Printing at the Frontend: " + myApp.getPerson());
        nameLabel.setText(myApp.getPerson().getName());
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}
