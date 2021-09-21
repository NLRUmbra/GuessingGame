/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Dao.GuessingGameDao;
import Main.UI.UserIO;
import Main.UI.UserIOConsoleImpl;

/**
 *
 * @author Noah McElroy
 */
public class GuessingGameController {
    //private AddressBookView view;
    private UserIO io = new UserIOConsoleImpl();
    private GuessingGameDao dao;

    public GuessingGameController(GuessingGameDao dao) {
        //this.view = view;
        this.dao = dao;
    }
    public void run() {
 
    }
        //exitMessage();
            
}
