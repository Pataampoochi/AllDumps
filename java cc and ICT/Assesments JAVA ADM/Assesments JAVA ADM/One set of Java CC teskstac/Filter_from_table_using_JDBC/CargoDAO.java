package java_lc_cc.Filter_from_table_using_JDBC;

import java.util.*;
import java.sql.*;

public class CargoDAO {

	public List<Cargo> filterCargoByWeight(Float weight) throws Exception {

		List<Cargo> cargoList = new ArrayList<>();
		Connection c1 = DbConnection.getConnection();
		Statement st1 = c1.createStatement();
		String query1 = "select * from cargodetail where weight > " + weight;
		ResultSet rs = st1.executeQuery(query1);
		while(rs.next()) {
			cargoList.add(new Cargo(rs.getInt("id"), rs.getString("name"), rs.getFloat("width"), rs.getFloat("height"), rs.getFloat("weight")));
		}
		return cargoList;

	}

}