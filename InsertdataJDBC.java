package com.secondquestion;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertdataJDBC {

    public static void main(String[] args)  {

        try {
            Class.forName("oracle.jdbc.driver.oracleDriver"); // loading the driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@loaclhost:3306:orcl", "root", "root");

            Statement statement = con.createStatement();

            statement.executeUpdate("insert into employee values(101,'jenny',25,10000)");
            statement.executeUpdate("insert into employee values(102,'jacky',30,20000)");
            statement.executeUpdate("insert into employee values(103,'joe',20,10000)");
            statement.executeUpdate("insert into employee values(104,'john',40,40000)");
            statement.executeUpdate("insert into employee values(105,'Shameer',25,90000)");
            System.out.println("The records been inserted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
