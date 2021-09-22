/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.CTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noah McElroy
 */
public class Game {
    private int id;
    private String answer;
    private boolean finished;
    
    private List<Round> listOfRounds;
    
    public Game() {
        finished = false;
        this.listOfRounds = new ArrayList<>();
    }
    
    public List<Round> getListOfRounds() {
        return listOfRounds;
    }

    public void setListOfRounds(List<Round> listOfRounds) {
        this.listOfRounds = listOfRounds;
        
    }

    public Round getLastRound(){
        if (this.listOfRounds.size()>0){
            return this.listOfRounds.get(listOfRounds.size()-1);
        }else{
            return null;
        }
    }
    public int getId() {
        return id;
    }
    
    public void addRound(Round round){
        this.listOfRounds.add(round);
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
}
