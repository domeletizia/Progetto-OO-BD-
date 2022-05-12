package net.codejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnessioneDatabase {

    public static void main(String[] args) {


        String jdbcURL = "jdbc:postgresql://localhost:5432/progetto2022";
        String username = "postgres";
        String password = "admin";


        try{
            Connection connection = DriverManager.getConnection(jdbcURL,username,password);
            System.out.println("Connected to PostgreSQL server");

            connection.close();
        }

        catch (SQLException e){
            System.out.println("Error in connecting to PostgreSQL server");
            e.printStackTrace();
        }




    }

}