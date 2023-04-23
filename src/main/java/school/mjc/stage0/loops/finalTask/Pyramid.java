package school.mjc.stage0.loops.finalTask;


public class Pyramid {
    public void printPyramid(int cathetusLength) {
    	for(int height = 1; height <= cathetusLength; height++) {
    		String pyramidLineString = "";
    		for (int lenght = 1; lenght <= cathetusLength; lenght++) {
				if (lenght == 1 && lenght <= height) {
					 pyramidLineString = pyramidLineString + "1";
				} else if (lenght <= height && lenght != 1) {
					pyramidLineString = lenght + pyramidLineString + lenght;
				} else if (lenght > height) {
					pyramidLineString = " " + pyramidLineString + " ";
				}
			}
    		System.out.println(pyramidLineString);
    	}
    }
}
