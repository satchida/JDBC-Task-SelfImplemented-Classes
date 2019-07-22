package com.stackroute.jdbc;

import java.sql.*;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JdbcRowSetImpl;
import com.sun.rowset.CachedRowSetImpl;

import javax.sql.rowset.CachedRowSet;

public class RowSetDemo{

    public  void  jdbcRowSet(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satchida", "root", "Root@123");)
        {

            //Creating and Executing RowSet
            JdbcRowSetImpl rowSet=new JdbcRowSetImpl(connection);
            rowSet.setCommand("select * from employee");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Age: " + rowSet.getInt(3));
                System.out.println("Gender: " + rowSet.getString(4));
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public  void cachedRowSet(){

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satchida", "root", "Root@123");)
            {
                CachedRowSet rowSet=new CachedRowSetImpl();
                Statement st=connection.createStatement();
                ResultSet rs=st.executeQuery("Select *from employee");
                rowSet.populate(rs);

                while (rowSet.next()) {
                    // Generating cursor Moved event
                    System.out.println("Id: " + rowSet.getInt(1));
                    System.out.println("Name: " + rowSet.getString(2));
                    System.out.println("Age: " + rowSet.getInt(3));
                    System.out.println("Gender: " + rowSet.getString(4));
                    System.out.println();
                }


            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


}
