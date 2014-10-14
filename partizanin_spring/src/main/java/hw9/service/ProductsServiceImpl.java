package hw9.service;

import hw9.dao.ProductsDaoImpl;
import hw9.domain.Product;
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
public class ProductsServiceImpl implements UniversalService<Product> {

    @Autowired
    private ProductsDaoImpl productsDao;

    @Override
    public void create(Product type) {

        productsDao.create(type);
    }

    @Override
    public Product read(long id) {
        return productsDao.read(id);
    }

    @Override
    public void update(Product type) {

        productsDao.update(type);

    }

    @Override
    public void delete(Product type) {

        productsDao.delete(type);
    }

    @Override
    public List<Product> findAll() {
        return productsDao.findAll();
    }
}
