
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = 0;
        for (Suitcase suitCase : suitcases) {
            holdWeight += suitCase.totalWeight();
        }
        if ((this.maximumWeight - holdWeight) >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int holdWeight = 0;
        for (Suitcase suitCase : suitcases) {
            holdWeight += suitCase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + holdWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
