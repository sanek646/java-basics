package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main6 {
    /* static final String url = "jdbc:postgresql://127.0.0.1:5432/new";
     static final String user = "sanek";
     static final String pass = "sanek";
     String bd = "Id, fistName, lastName, companyId, role";
 */
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1695, "alex", "a", 347913, "reg"));
        users.add(new User(3273, "oleg", "b", 347913, "reg"));
        users.add(new User(3244, "bob", "c", 347913, "ing"));
        users.add(new User(3257, "den", "d", 347913, "ing"));
        users.add(new User(3266, "alex", "g", 347913, "sbor"));
        String bd = "SELECT Idwork, fistName, lastName, companyId, rolework FROM worker";

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/new","sanek","sanek");
             Statement st = con.createStatement()) {
            for (User user : users) {
                String sql = "INSERT INTO worker VALUES("
                        + user.getId() + ",'"
                        + user.getFistName() + "','"
                        + user.getLastName() + "', "
                        + user.getCompanyId() + " ,'"
                        + user.getRole() + "')";
                st.executeUpdate(sql);
            }
            ResultSet res = st.executeQuery(bd);

            while (res.next()) {
                System.out.println("id " + res.getInt("Idwork")
                        + " name " + res.getString("fistName")
                        + " last name " + res.getString("lastName")
                        + " company ID " + res.getInt("companyId"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
