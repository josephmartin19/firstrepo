package Day42_Oop_Encapsulation;

public class TestData {

	/*
	 
	 */

	private String Name = "Bekir";
	private int ID = 897;
   // getter : read the data
	public String getName() { // read the private data
		return Name;
	}

	public int getID() {
		return ID;
	}

	// setter: to change the value, modify the data
	public void setName(String str) {
		Name = str;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

}
