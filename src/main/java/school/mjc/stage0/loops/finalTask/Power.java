package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
    	int multiplier = numberToPrint;
    	for(int numberOfPower = 2; numberOfPower <= power; numberOfPower++) {
    		if (power == 0) {
				System.out.println(1);
				break;
			}
    		if (numberToPrint == 0) {
				System.out.println(0);
				break;
			}
    		if (power == 1) {
				System.out.println(numberToPrint);
				break;
			}
    		numberToPrint = numberToPrint * multiplier;
    	}
    	System.out.println(numberToPrint);
    }
}
