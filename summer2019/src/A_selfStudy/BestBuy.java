package A_selfStudy;

public class BestBuy {

	public static void main(String[] args) {
		// System.out.println(brand); // its not compliewee need to create objectto use
		// brand
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand); // null
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;

		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screensize: " + cell1.screenSize);
		System.out.println("color: " + cell1.color);
		System.out.println("price: " + cell1.price);
		
		cell1.color = "Black";  // change the coor name
		System.out.println("color: " + cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Simens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("###### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screensize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		System.out.println("price: " + cell2.price);
		
		System.out.println("##### CALLING METHODS ####");
		cell1.call();
		cell1.message();
		cell2.takeAPhoto();
		
	
		
		
		
		
		
		
		

	}

}