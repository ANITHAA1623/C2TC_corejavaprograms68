package Com.tnsif.dayEight.interfaces.nestedinterfaces;


public interface MyInterface {
	void calculateArea();
	
	interface MyInnerInterface{
		int id = 100;
		void print();
	}
}