package crud.dao;



import crud.model.User;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);

    public void updateUser(User user);

    public void removeUser(long id);

    public User getUserById(long id);

    public List<User> getAllUsers();
}
