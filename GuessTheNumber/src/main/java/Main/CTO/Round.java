/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.CTO;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel
 */
public class Round {
    private int partial;
    private int exact;
    private String guess;
    private LocalDateTime timeOfGuess;

    public Round(int exact, int partial, String guess) {
        this.partial = partial;
        this.exact = exact;
        this.guess = guess;
        this.timeOfGuess = LocalDateTime.now();
    }

    public int getPartial() {
        return partial;
    }

    public void setPartial(int partial) {
        this.partial = partial;
    }

    public int getExact() {
        return exact;
    }

    public void setExact(int exact) {
        this.exact = exact;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public LocalDateTime getTimeOfGuess() {
        return timeOfGuess;
    }

    public void setTimeOfGuess(LocalDateTime timeOfGuess) {
        this.timeOfGuess = timeOfGuess;
    }
}
