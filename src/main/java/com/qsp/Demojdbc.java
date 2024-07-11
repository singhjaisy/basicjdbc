package com.qsp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Demojdbc {

        public static void main(String[] args) {
            try {
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver Class is loaded ");
                Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","tiger");
                System.out.println(con);
                Statement stm=con.createStatement();
                //inserting the data
//                stm.execute("insert into test values('xyz')");

                //deleting the data
                stm.execute("DELETE from test where name='xyz' ");
                System.out.println("ok");

            }catch(ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

    }

