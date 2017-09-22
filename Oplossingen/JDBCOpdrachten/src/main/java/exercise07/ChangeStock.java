package exercise07;

import java.sql.*;

public class ChangeStock {
   private static final String SQL1 = "UPDATE Beers SET Stock=100 WHERE Name ='Jupiler'";
   private static final String SQL2 = "UPDATE Beers SET Stock=100 WHERE Name ='Piraat'";

   public static void main(String[] args) throws Exception {
      try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB",
                                                        "student",
                                                        "student123")) {
         try (Statement stmt = con.createStatement()) {
            con.setAutoCommit(false);   // Take control of transactions
            stmt.executeUpdate(SQL1);   // Transaction start            
            stmt.executeUpdate(SQL2);
            //con.rollback();             // Transaction rollback
            con.commit();               // Transaction commit
         } catch (Exception e) {            
            con.rollback();             // Transaction rollback
            e.printStackTrace(System.out);
         }
      }
   }
}