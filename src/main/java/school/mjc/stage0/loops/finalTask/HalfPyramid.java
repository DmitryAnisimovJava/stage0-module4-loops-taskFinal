package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
    	for(int size1 = 1; size1 <= cathetusLength; size1++) {
    		for(int size2 = 1; cathetusLength >= size2; size2++) {
    			if (size2 <= cathetusLength - size1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
    		}
    	System.out.println();
    	}
    }
}
