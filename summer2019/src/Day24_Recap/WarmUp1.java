package Day24_Recap;

public class WarmUp1 {

	public static void main(String[] args) {
		
		int[] arr = { 20, 200, 30, 40, 50, 500 };  // what is the max number?
		
		int max = 0;
		
		for ( int i = 0; i< arr.length; i++) {
			if ( arr[i] > max) {
				max = arr[i];
			}
		}
	
		System.out.println("max is: "+ max);   // max: 500
		
		
		int min = 99999;
		
		for ( int j =0; j<arr.length; j++) {
			if ( arr[j] < min) {
				min = arr[j];
			}
		}
	System.out.println("min: "+min);
	
	
}

}
	
		
		
	

