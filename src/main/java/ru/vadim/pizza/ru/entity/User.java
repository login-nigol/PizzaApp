package ru.vadim.pizza.ru.entity;

//JPA - standard
//Hibernate - ORM Framework, который реализует стандарт JPA
//ORM - Object Relational Mapping, технология которая позволяет
//маппить джава классы в таблицы базы данных, поля классов в
//колонки базы данных и наоборот
//Spring Data JPA - набор интерфейсов для доступа к базе дынных

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity  // Объекты данного класса будут сохраняться в бд
@Table(name = "shop_users")  // указываем имя таблицы для сохранения объектов
public class User {

    @Id  // данное поле является первичным ключом
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // авто увеличение поля
    private Long id;

    private String login;

    private String password;

    private String email;

    private String userInfo;

    @Column(name = "description") // Optional
    private String information;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")  // колонка будет создана в таблице адресов
    private List<Address> addresses = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disc_card_id", referencedColumnName = "id")  // колонка создастся в пользователе
    private DiscountCard discountCard;

    public User() {
        //
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }
}