package web.dao;

import web.domain.Employee;
import web.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 3/16/13
 */
public interface EmployeeDao {
    List<Employee> findAll();

    void save(User user);
}
