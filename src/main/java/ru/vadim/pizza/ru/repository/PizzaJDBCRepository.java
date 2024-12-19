package ru.vadim.pizza.ru.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.vadim.pizza.ru.configuration.DataBaseManager;
import ru.vadim.pizza.ru.enums.PizzaType;
import ru.vadim.pizza.ru.model.Pizza;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class PizzaJDBCRepository implements PizzaRepository {

    @Autowired
    private DataBaseManager dbManager;

    @Override
    public List<Pizza> getAll() {
        String sql = "SELECT * FROM pizzas";
        Connection connection = dbManager.getConnection();
        List<Pizza> pizzaList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String type = resultSet.getString("type");
                PizzaType pizzaType = PizzaType.valueOf(type);
                Pizza pizza = new Pizza(title, pizzaType);
                pizzaList.add(pizza);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pizzaList;
    }

    @Override
    public Pizza getByTitle(String title) {
        Connection connection = dbManager.getConnection();
        String sql = "SELECT * FROM pizzas WHERE title = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, title);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String pizzaTitle = resultSet.getString("title");
                String type = resultSet.getString("type");
                PizzaType pizzaType = PizzaType.valueOf(type);
                return new Pizza(pizzaTitle, pizzaType);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

















