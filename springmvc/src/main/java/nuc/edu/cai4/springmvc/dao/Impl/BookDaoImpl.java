package nuc.edu.cai4.springmvc.dao.Impl;

import nuc.edu.cai4.springmvc.dao.BookDao;
import nuc.edu.cai4.springmvc.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    List<Book> books = new ArrayList<Book>();

    public BookDaoImpl() {
        super();
        books.add(new Book(1, "book_name_1", 20));
        books.add(new Book(2, "book_name_2", 20.1f));
        books.add(new Book(3, "book_name_3", 20.2f));
    }
    @Override
    public Book findById(Integer b_id) {
        for (Book book :books) {
            if (book.getB_id() == b_id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Boolean insertBook(Book book) {
        Boolean flag=false;
        System.out.println(book.getB_id()+">>"+book.getB_name()+">>"+book.getB_price());
        books.add(book);
        flag=true;
        return flag;
    }

    @Override
    public List<Book> findAllBook() {
        return books;
    }

    @Override
    public List<Book> findAllBook(Book book) {
        return books;
    }
}
