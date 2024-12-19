package ru.vadim.pizza.ru.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Deprecated
//@Component
public class DataBaseManager {  // коннектор - устанавливает подключение к базе данных

//  @Value() - читает из конфигурации приложения, значение переменной
    @Value("${database.url}")
    private String dataBaseUrl;

    @Value("${database.user}")
    private String userName;

    @Value(("${database.password}"))
    private String password;

    private Connection connection;

    public DataBaseManager() {
    }

    public Connection getConnection() {  // вызывает соединение
        if (connection == null) {
            createConnection();
        }

        return connection;
    }

    @PostConstruct  // метод выполнится сразу после инъекции, что бы провести инициализацию
    private void createConnection() {  // создаёт соединение
        try {
//                       jdbc:postgresql://localhost:5432/jdbcexample_db;
            connection = DriverManager.getConnection(dataBaseUrl, userName, password);
        } catch (Exception e) {
            connection = null;
        }
    }
}
