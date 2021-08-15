package invoicePackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class Invoice {
     int partNumber;
     String partDescription;
     int quantity;
     double price;
     
     Invoice(int partNumber, String partDescription, int quantity,double price){
    	 this.partNumber=partNumber;
    	 this.partDescription=partDescription;
    	 this.quantity=quantity;
    	 this.price=price;
    		
     }
	int getPartNumber() {
		return partNumber;
	}
	
	String getPartDescription() {
		return partDescription;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	double getPrice() {
		return price;
	}
	
	public static void main(String [] args) {
		
		Invoice [] invoices= {
				new Invoice(83, "Electric sandar", 7, 57.98),
				new Invoice(24, "Power saw", 18, 99.99),
				new Invoice(7, "Sledge hammer", 11, 21.50),
				new Invoice(77, "Hammer", 76, 11.99),
				new Invoice(39, "Lawn mower", 3, 79.50)
		};
		
		
		List<Invoice> list=Arrays.asList(invoices);
		
		Comparator<Invoice> descriptionComparator = Comparator.comparing(Invoice::getPartDescription);
		list.stream().sorted(descriptionComparator).forEach(System.out::println);
		
	}

}
