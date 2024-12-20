package ru.vadim.pizza.ru.repository.old;

import ru.vadim.pizza.ru.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
//@Component
public class UserInMemoryRepository implements UserRepository {

    private Map<String, User> storage = new HashMap<>();

    public UserInMemoryRepository() {
        init();
    }

    private void init() {
//        User user1 = new User("vadim", "123", "vadim@mail.ru");
//        User user2 = new User("max", "123", "max@mail.ru");
//        storage.put(user1.getLogin(), user1);
//        storage.put(user2.getLogin(), user2);
    }

    @Override
    public List<User> getAll() {
        return storage.values().stream().toList();
    }

    @Override
    public User create(User user) {
//    User newUser = new User(user.getLogin(), user.getPassword(), user.getEmail());
//        storage.put(newUser.getLogin(),newUser);
        return null;
}

@Override
public User getByLogin(String login) {
    return storage.get(login);
}

@Override
public void deleteByLogin(String login) {
    storage.remove(login);
}
}