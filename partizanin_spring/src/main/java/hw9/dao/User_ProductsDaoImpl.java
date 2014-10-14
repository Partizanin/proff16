package hw9.dao;

import hw9.domain.User_Products;
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
 * Time: 17:12
 * To change this template use File|Setting|File Templates.
 */
@Repository
public class User_ProductsDaoImpl implements UniversalDao<User_Products> {

    private static Logger log = Logger.getLogger(ProductsDaoImpl.class);


    @Autowired
    private SessionFactory factory;


    @Override
    public void create(User_Products type) {

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
    public User_Products read(long id) {

        Session session = factory.openSession();

        try {

            return (User_Products) session.get(User_Products.class, id);

        } catch (HibernateException e) {
            log.error("crate method", e);
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return null;
    }

    @Override
    public void update(User_Products type) {

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
    public void delete(User_Products type) {

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
    public List<User_Products> findAll() {

        Session session = factory.openSession();

        try {
            return session.createCriteria(User_Products.class).list();
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
