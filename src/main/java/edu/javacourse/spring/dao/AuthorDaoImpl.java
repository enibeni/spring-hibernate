package edu.javacourse.spring.dao;


import edu.javacourse.spring.model.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by enibeni on 19.12.15.
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

    @Autowired
    SessionFactory sFactory;

    @Override
    public Integer addAuthor(Author author) {
        Integer r = (Integer) sFactory.getCurrentSession().save(author);
        return r;

    }
}
