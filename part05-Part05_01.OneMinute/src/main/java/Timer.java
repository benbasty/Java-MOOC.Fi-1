/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    public void advance() {
        this.hundredths.advance();

        if (hundredths.value() == 0) {
            seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredths;
    }
    
}
