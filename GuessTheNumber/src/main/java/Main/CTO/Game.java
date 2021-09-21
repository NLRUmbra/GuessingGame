/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.CTO;

/**
 *
 * @author Noah McElroy
 */
public class Game {
    private int id;
    private String answer;
    private boolean finished;
    private int exactMatch;
    private int partialMatch;

    public Game(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public int getExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(int exactMatch) {
        this.exactMatch = exactMatch;
    }

    public int getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(int partialMatch) {
        this.partialMatch = partialMatch;
    }

    public int getId() {
        return id;
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
