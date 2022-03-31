package java_lc_cc.Fancy_Shop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("unchecked")
public class FancyShop {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  no of Face Creams you want to store");
		int n = Integer.parseInt(br.readLine());
		Map<Integer, String> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the key " + i);
			int key = Integer.parseInt(br.readLine());
			System.out.println("Enter the value " + i);
			String value = br.readLine();
			map.put(key, value);
		}
		System.out.println("Face Cream Details");
		Set<Integer> keys = map.keySet();
		List<Integer> l = new ArrayList<>();
		for (int k : keys)
			l.add(k);
		Collections.sort(l);
		for (int key : l)
			System.out.println(key + " " + map.get(key));

	}

}
