/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Controller.GuessingGameController;
import Main.Dao.GuessingGameDao;
import Main.Dao.GuessingGameDaoImpl;
import Main.Service.GuessingGameServiceLayer;
import Main.Service.GuessingGameServiceLayerImpl;

/**
 *
 * @author Noah McElroy
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
