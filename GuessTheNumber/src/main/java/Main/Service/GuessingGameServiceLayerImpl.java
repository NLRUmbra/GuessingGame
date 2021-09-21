/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Service;

import Main.CTO.Game;
import Main.UI.UserIO;
import Main.UI.UserIOConsoleImpl;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Noah McElroy
 */


public class GuessingGameServiceLayerImpl implements GuessingGameServiceLayer {
    UserIO io;
    public GuessingGameServiceLayerImpl() {
         this.io = new UserIOConsoleImpl();
    }
    
    
    @Override
    public String createAnswer(){
        HashSet<Integer> set=new HashSet();  
        Random rand = new Random();
        String answer ="";
        while(set.size() < 4){
            int randomInt = rand.nextInt(10);
            if (!set.contains(randomInt)){
                set.add(randomInt);
                answer+= randomInt;
            }
        }
        return answer.toString();
    }

    @Override
    public boolean compareResults(int id, String guess) {
                //{e,p}
        int[] result = {0,0};
        String localAnswer = "1945"; //TODO: dao.getAnswerFromId(id);
        for (int i = 0 ; i < localAnswer.length();i++){
            int position = localAnswer.indexOf(guess.charAt(i));
            if (position != -1){
                if (position == i){
                    result[0]++;
                }
                else{
                    result[1]++;
                }
            }
        }
        
        io.print("Exact Matches: " + result[0] + ", Partial Matches: " + result[1]);
        
        if (result[0] == 4){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void compareResults(String guess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Game addGame(int id, Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Game deleteGame(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
