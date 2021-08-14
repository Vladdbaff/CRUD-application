package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public User getUserById(long id);

    public List<User> getAllUsers();

    public void removeUser(long id);

    public void updateUser(User user);
}
