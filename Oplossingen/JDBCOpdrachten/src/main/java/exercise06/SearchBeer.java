package exercise06;

import java.sql.*;

public class SearchBeer {
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
      String sql = "SELECT * FROM Beers WHERE Alcohol=?";
      try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");
            PreparedStatement stmt = con.prepareStatement(sql);) {
         for (int i = 5; i <= 10; i++) {
            stmt.setFloat(1, i);
            try (ResultSet rs1 = stmt.executeQuery()) {
               while (rs1.next()) {
                  String beerName = rs1.getString("Name");
                  double alcohol = rs1.getDouble("Alcohol");
                  double price = rs1.getDouble("Price");
                  System.out.println(beerName + " \t " + alcohol + " \t " + price);
               }
            }
         }
      }
   }
}