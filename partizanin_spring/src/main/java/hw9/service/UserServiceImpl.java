package hw9.service;

import hw9.dao.UserDaoImpl;
import hw9.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 21.07.2014
 * Time: 17:22
 * To change this template use File|Setting|File Templates.
 */
@Service
public class UserServiceImpl implements UniversalService<User> {

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public void create(User type) {
        userDao.create(type);
    }

    @Override
    public User read(long id) {
        return userDao.read(id);
    }

    @Override
    public void update(User type) {
        userDao.update(type);
    }

    @Override
    public void delete(User type) {
        userDao.delete(type);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
