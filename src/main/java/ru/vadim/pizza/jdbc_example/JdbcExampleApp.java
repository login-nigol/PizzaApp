package ru.vadim.pizza.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Deprecated
public class JdbcExampleApp {

    public static void main(String[] args) {
//        String url = "localhost:5432";
//        String dbName = "jdbcexample_db";
        String userName = "postgres";
        String password = "postgres";

//        String connString = "jdbc:postgresql://" + url + "/" + dbName;
        String conn2String = "jdbc:postgresql://localhost:5432/jdbcexample_db";

        try {
            Connection connection = DriverManager.getConnection(conn2String, userName, password);
            String sql = "SELECT * FROM evolution";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(); // ResultSet - набор строк ответа
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + " | Name:  " + name);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
