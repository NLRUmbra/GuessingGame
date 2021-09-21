/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Service;

/**
 *
 * @author Noah McElroy
 */
public interface GuessingGameServiceLayer {
    int createAnswer();//creates 4 digit number user random number and find way to have no repeating numbers
    
    void compareResults(String answer);//setting e and p
}
