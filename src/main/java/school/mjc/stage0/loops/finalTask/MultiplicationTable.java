package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
    	for(int factor = 1; factor <= 10; factor++) {
    		System.out.println(factor + " x " + numberTableToPrint + " = " + factor * numberTableToPrint);
    	}
    }
}
