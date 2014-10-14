package hw9.dao;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 21.07.2014
 * Time: 16:33
 * To change this template use File|Setting|File Templates.
 */
public interface UniversalDao<K> {

    void create(K type);

    K read(long id);

    void update(K type);

    void delete(K type);

    List<K> findAll();

}
