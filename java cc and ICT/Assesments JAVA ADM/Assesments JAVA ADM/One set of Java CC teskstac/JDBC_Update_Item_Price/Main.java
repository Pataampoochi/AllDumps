package java_lc_cc.JDBC_Update_Item_Price;

import java.util.*;
import java.io.*;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ItemDAO obj= new ItemDAO();
		List<Item> IList =obj.getAllItems();
		System.out.println("Item details :");
		System.out.println("Item ID Item Name Price");
		for(Item i: IList)
			System.out.println(i.getId()+" "+i.getName()+" "+i.getPrice());

		System.out.println("Enter the item id to update :");
		String id = br.readLine();
		System.out.println("Enter the new price :");
		double price =Double.parseDouble(br.readLine());
		obj.updateItemPrice(id,price);
		System.out.println("Item details after update :");
		List<Item> IList1 = obj.getAllItems();
		System.out.println("Item ID Item Name Price");
		for(Item i: IList1)
			System.out.println(i.getId()+" "+i.getName()+" "+i.getPrice());

	}
}
