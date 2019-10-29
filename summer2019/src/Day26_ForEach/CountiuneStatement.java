package Day26_ForEach;

public class CountiuneStatement {
	
	public static void main(String[] args) {
		
	for ( int i =0; i<5; i++) {
		if ( i==2) {
			continue;      // it will skip 2
		}
		System.out.print(i+ " ");
	}
		System.out.println();
	
		int [] numbers = {1,2,3,4,5};
		
		for ( int i=0; i< numbers.length; i++) {
			
			if (numbers[i]<3) {       // 3 den kucuk olani print yap demek.
				continue;
			}
			System.out.print(numbers[i] + " ");
		}
		
		
	}

}
