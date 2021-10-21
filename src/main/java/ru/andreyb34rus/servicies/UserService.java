package ru.andreyb34rus.servicies;

import ru.andreyb34rus.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(long id);

    void save(User user);

    void delete(User user);

    void update(int id, User user);
}
