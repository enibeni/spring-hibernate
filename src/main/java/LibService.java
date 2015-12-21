import edu.javacourse.spring.model.Author;
import edu.javacourse.spring.service.AuthorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by enibeni on 19.12.15.
 */
public class LibService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springExample.xml"});

        AuthorService authorService = (AuthorService) context.getBean("authorService");

        Author author1 = new Author();
        author1.setFname("author1");
        authorService.addAuthor(author1);
    }
}
