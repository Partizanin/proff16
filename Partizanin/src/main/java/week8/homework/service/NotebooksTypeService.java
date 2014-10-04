package week8.homework.service;

import week8.homework.domain.Notebook;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 18.06.2014
 * Time: 19:36
 * To change this template use File|Setting|File Templates.
 */
public interface NotebooksTypeService {

    void create(Notebook notebook);
    Notebook read(long id);
    void update(Notebook notebook);
    void delete(Notebook notebook);
    List<Notebook> showAll();
}
