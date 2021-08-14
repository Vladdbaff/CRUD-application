package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Component
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return manager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        manager.persist(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        manager.merge(user);
    }

    @Override
    @Transactional
    public void removeUser(long id) {
        manager.remove(getUserById(id));
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return manager.find(User.class, id);
    }

}
