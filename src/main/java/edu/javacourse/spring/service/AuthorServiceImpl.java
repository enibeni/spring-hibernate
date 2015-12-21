package edu.javacourse.spring.service;



import edu.javacourse.spring.dao.AuthorDao;
import edu.javacourse.spring.model.Author;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by enibeni on 19.12.15.
 */
@Transactional
public class AuthorServiceImpl implements AuthorService {
    AuthorDao authorDao;

    public void setAuthorDao(AuthorDao authorDao){
        this.authorDao = authorDao;
    }


    @Override
    @Transactional
    public Author addAuthor(Author author) {
        int id = authorDao.addAuthor(author);
        return author;
    }
}
