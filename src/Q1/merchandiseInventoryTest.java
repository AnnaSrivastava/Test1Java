package Q1;
/**
 * Organization: Yamaha Motor Solutions India
 * Project Name:LabTest1
 * Package: Q1
 * Class: merchandiseInventoryTest
 * Description: Read from .dat file and insert into ArrayList, sort in alphabetical ascending order and price descending order
 * Created On:05 August 2021
 * @author Ananya Srivastava
 */
import java.io.*;
import java.util.*;

//class for merchandise objects
class Merchandise implements Comparable<Merchandise>{
	private String ItemId;
	private int Qty;
	private double price;
	
	//constructor
	Merchandise(String ItemId, int Qty, double price){
		this.ItemId = ItemId;
		this.Qty = Qty;
		this.price = price;
	}

	//getter for ItemId
	public String getItemId() {
		return ItemId;
	}

	//setter for ItemId
	public void setItemId(String itemId) {
		ItemId = itemId;
	}
	
	//getter for Qty
	public int getQty() {
		return Qty;
	}
	
	//setter for Qty
	public void setQty(int qty) {
		Qty = qty;
	}
	
	//getter for Price
	public double getPrice() {
		return price;
	}

	//setter for Price
	public void setPrice(double price) {
		this.price = price;
	}

	//overriding compare for lexicographically sorting by ItemId
	@Override
	public int compareTo(Merchandise merch) {
		return this.getItemId().compareTo(merch.getItemId());
	}

	//overriding toString() method
	@Override
	public String toString() {
		return "Merchandise ItemId=" + ItemId + ", Qty=" + Qty + ", price=" + price;
	}
	
}

//tester class
public class merchandiseInventoryTest {
	
	//tester main method
	public static void main(String[] args) {
		String data = null;
		//ArrayList with generics
		ArrayList<Merchandise> merchList = new ArrayList<Merchandise>();
		
		//Using ARM along with exception handling
		try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym261\\Desktop\\Java Eclipse WorkSpace\\LabTest1\\src\\Q1\\input.dat")))){
			int counter = 0;
			while((data=br.readLine())!=null){
				counter++;
				if(counter>=3)
				{
					//adding to merchList
					StringTokenizer tokens = new StringTokenizer(data, " ");
				    String ItemId = (String) tokens.nextToken();
				    int qty = Integer.parseInt(tokens.nextToken());
				    double price = Double.parseDouble(tokens.nextToken());
					merchList.add(new Merchandise(ItemId, qty, price));
				}
			}
			
			//sorting merchandise list by ItemsId alphabetical ascending order
			merchList.sort(null);
			for(Merchandise merch:merchList) {
				System.out.println(merch);
			}
			System.out.println();
			
			//sorting merchandise list by price descending order
			Collections.sort(merchList, new Comparator<Merchandise>() {
				@Override
				public int compare(Merchandise m1, Merchandise m2) {
					return Double.compare(m2.getPrice(), m1.getPrice());
				}
			});;
			for(Merchandise merch:merchList) {
				System.out.println(merch);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}//end-of-main
}//end-of-class
