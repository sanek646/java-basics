package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main6 {
    static final String url = "jdbc:postgresql://127.0.0.1:5432/*******";
    static final String user = "sanek";
    static final String pass = "sanek";
    static final String bd = "Id, fistName, lastName, companiId, role";

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1695, "alex", "a", 347913, "reg"));
        users.add(new User(3273, "oleg", "b", 347913, "reg"));
        users.add(new User(3244, "bob", "c", 347913, "ing"));
        users.add(new User(3257, "den", "d", 347913, "ing"));
        users.add(new User(3266, "alex", "g", 347913, "sbor"));

        try {
          Connection con = DriverManager.getConnection(url, user, pass);
          Statement st = con.createStatement();{
                for (User user : users) {
                    String sql = "INSERT INTO user VALUES("
                            + user.getId()+ "','"
                            + user.getFistName()+ "','"
                            + user.getLastName()+ "','"
                            + user.getCompanyId()+ "','"
                            + user.getRole()+ "')";
                    st.executeUpdate(sql);
                }
          ResultSet res = st.executeQuery(bd);

              while (res.next()){
                  System.out.println("id " +res.getInt("Id"));
                  System.out.println("name " +res.getString("fistName"));
                  System.out.println("last name " +res.getString("lastName"));
                  System.out.println("compani ID" +res.getInt("companId"));
              }
          }

      } catch (SQLException e) {
          e.printStackTrace();
      }
    }
}
