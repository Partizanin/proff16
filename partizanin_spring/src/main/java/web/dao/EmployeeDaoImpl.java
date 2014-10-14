package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.domain.Employee;
import web.domain.User;

import java.util.List;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory factory;

    public EmployeeDaoImpl() {

    }

    @Transactional(readOnly = true)
    @Override
    public List<Employee> findAll() {
        Session session = factory.getCurrentSession();
        return session.createCriteria(Employee.class).list();
    }

    @Override
    public void save(User user) {
        Session session = factory.getCurrentSession();
        session.save(user);
    }
}
