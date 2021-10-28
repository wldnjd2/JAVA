package exam_date0914;

public class Avr {
	//7¹ø¹®Á¦
	int average(int[] array) {
		int totalAvr = 0;
		for(int i=0; i<array.length; i++) {
		totalAvr += array[i];
		}
		int totalAvr1 = totalAvr/array.length;
		return totalAvr1;
		
	}
}
