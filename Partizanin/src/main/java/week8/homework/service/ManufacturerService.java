package week8.homework.service;

import week8.homework.domain.Manufacturer;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 18.06.2014
 * Time: 19:35
 * To change this template use File|Setting|File Templates.
 */
public interface ManufacturerService {

    void create(Manufacturer manufacturer);
    Manufacturer read(long id);
    void update(Manufacturer manufacturer);
    void delete(Manufacturer manufacturer);
    List<Manufacturer> findAll();
}
