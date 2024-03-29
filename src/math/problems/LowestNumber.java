package math.problems;

import databases.ConnectToSqlDB;

import javax.imageio.IIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) throws IIOException, SQLException {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int[] array = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		int lowestNumber = array[0];
		for (int i : array) {
			if (i < lowestNumber){
				lowestNumber = i;
			}
		}
		System.out.println(" lowest number is :   " + lowestNumber);

		//find lowest number from the array
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		int [ ]newArray = new int[1];
		List<String> lowestValue = new ArrayList<String>();

		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(" Data is reading from the Table (tbl_lowestnumber) and displaying to the console ");
		for(String st:lowestValue) {
			System.out.println(st);

		}

	}

}
