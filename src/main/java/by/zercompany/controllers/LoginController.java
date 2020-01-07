package by.zercompany.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginController
{
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @FXML private TextField loginField;
    @FXML private PasswordField pwField;
    @FXML private Button loginButton;
    @FXML private Hyperlink openRegister;

    public void loginAccount(){
        log.info("Logging in...");
        String login = loginField.getText();
        String pw = pwField.getText();

        log.info("Login: " + login);
        log.info("Password: " + pw);

        if(login.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("admin")) {
            log.info("ADMINISTRATOR is logged in");
            log.info("closing application");
            System.exit(1);
        }


    }

    public void colorField(){

    }



}
