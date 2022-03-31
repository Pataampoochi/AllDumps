package java_lc_cc.Filter_from_table_using_JDBC;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Cargo> cargoList = new ArrayList<>();
        System.out.println("Enter the weight to filter:");
		Float weight = Float.parseFloat(br.readLine());
		CargoDAO cDAO = new CargoDAO();
        cargoList = cDAO.filterCargoByWeight(weight);
        if(cargoList.size() == 0)
            System.out.println("No cargo found");
        else
        {
            System.out.format("%-15s %-25s %-15s %-15s %s\n", "Cargo id","Cargo name","Width","Height","Cargo weight");
            for (Cargo cargo : cargoList) {
            	System.out.format("%-15s %-25s %-15s %-15s %s\n", cargo.getId(),cargo.getName(),cargo.getWidth(),cargo.getHeight(),cargo.getWeight());
			}
            
        }
    }
}

