package week8.homework.DAO.daoimpl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import week8.homework.domain.Sales;
import week8.homework.DAO.SalesDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 18.06.2014
 * Time: 19:33
 * To change this template use File|Setting|File Templates.
 */
public class SalesDaoImpl implements SalesDAO {


    private static Logger log = Logger.getLogger(SalesDaoImpl.class);

    private SessionFactory factory;

    public SalesDaoImpl(SessionFactory factory){

        this.factory = factory;
    }

    @Override
    public void create(Sales sales) {

        Session session = factory.openSession();

        try {
            session.beginTransaction();
            session.save(sales);
            session.getTransaction().commit();
        }catch (HibernateException e){
            log.error("Transaction failed", e);
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    @Override
    public Sales read(long id) {
        Session session = factory.openSession();

        try {
            return (Sales)session.get(Sales.class,id);
        }catch (HibernateException e){
            log.error("Fetch error",e);
            e.printStackTrace();
        }finally {
            session.close();
        }

        return null;
    }

    @Override
    public void update(Sales sales) {
        Session session = factory.openSession();

        try {
            session.beginTransaction();
            session.update(sales);
            session.getTransaction().commit();
        }catch (HibernateException e){
            log.error("Transaction failed",e);
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Sales sales) {
        Session session = factory.openSession();

        try {
            session.beginTransaction();
            session.delete(sales);
            session.getTransaction().commit();
        }catch (HibernateException e){
            log.error("Transaction failed",e);
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Sales> findAll() {
        Session session = factory.openSession();
        List<Sales> list = new ArrayList<>();
        try {
            list = session.createCriteria(Sales.class).list();
        } catch(HibernateException e) {
            log.error("Fetch error", e);
            e.printStackTrace();
        } finally {
            session.close();
        }

        return list;
    }
}
