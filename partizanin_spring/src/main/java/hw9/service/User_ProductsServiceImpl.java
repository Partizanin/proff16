package hw9.service;

import hw9.dao.User_ProductsDaoImpl;
import hw9.domain.User_Products;
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
public class User_ProductsServiceImpl implements UniversalService<User_Products> {

    @Autowired
    private User_ProductsDaoImpl user_productsDao;

    @Override
    public void create(User_Products type) {
        user_productsDao.create(type);
    }

    @Override
    public User_Products read(long id) {
        return user_productsDao.read(id);
    }

    @Override
    public void update(User_Products type) {

        user_productsDao.update(type);
    }

    @Override
    public void delete(User_Products type) {

        user_productsDao.delete(type);
    }

    @Override
    public List<User_Products> findAll() {
        return user_productsDao.findAll();
    }
}
