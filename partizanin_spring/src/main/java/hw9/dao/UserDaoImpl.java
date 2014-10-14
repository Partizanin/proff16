package hw9.dao;

import hw9.domain.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 21.07.2014
 * Time: 16:53
 * To change this template use File|Setting|File Templates.
 */
@Repository
public class UserDaoImpl implements UniversalDao<User> {

    private static Logger log = Logger.getLogger(ProductsDaoImpl.class);

    @Autowired
    private SessionFactory factory;

    @Override
    public void create(User type) {

        Session session = factory.openSession();
        try {
            session.beginTransaction();

            session.save(type);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            log.error("crate method", e);
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

    }

    @Override
    public User read(long id) {
        Session session = factory.openSession();

        try {

            return (User) session.get(User.class, id);

        } catch (HibernateException e) {
            log.error("read method", e);
            e.printStackTrace();
            session.getTransaction().rollback();

        } finally {
            session.close();

        }
        return null;
    }

    @Override
    public void update(User type) {

        Session session = factory.openSession();

        try {

            session.beginTransaction();

            session.update(type);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            log.error("crate method", e);
            e.printStackTrace();
            session.getTransaction().rollback();

        } finally {
            session.close();

        }
    }

    @Override
    public void delete(User type) {

        Session session = factory.openSession();

        try {

            session.beginTransaction();
            session.delete(type);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            log.error("crate method", e);
            e.printStackTrace();
            session.getTransaction().rollback();

        } finally {
            session.close();

        }
    }

    @Override
    public List<User> findAll() {

        Session session = factory.openSession();

        try {

            session.beginTransaction();

        } catch (HibernateException e) {
            log.error("crate method", e);
            e.printStackTrace();
            session.getTransaction().rollback();

        } finally {
            session.close();

        }

        return null;
    }
}
