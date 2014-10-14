package web.dao;

import web.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 3/16/13
 */
public interface EmployeeDao {
    List findAll();

    void save(User user);
}
