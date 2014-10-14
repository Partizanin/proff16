package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.EmployeeDao;
import web.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private EmployeeDao dao;

    public UserServiceImpl() {

    }

    @Override
    public void createUser(User user) {
        dao.save(user);
    }
}
