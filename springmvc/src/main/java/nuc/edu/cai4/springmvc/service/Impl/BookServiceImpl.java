package nuc.edu.cai4.springmvc.service.Impl;

import nuc.edu.cai4.springmvc.dao.BookDao;
import nuc.edu.cai4.springmvc.entity.Book;
import nuc.edu.cai4.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    List<Book> books = new ArrayList<Book>();
    @Override
    public boolean insertBook(Book book) {
        Boolean flag=false;
        System.out.println(book.getB_id()+">>"+book.getB_name()+">>"+book.getB_price());
        flag=bookDao.insertBook(book);
        return flag;
    }

    @Override
    public Book showBookById(Integer b_id) {
        return bookDao.findById(b_id);
    }

    @Override
    public List<Book> showBookAll() {
        return bookDao.findAllBook();
    }

    @Override
    public List<Book> showBookAll(Book book) {
        return bookDao.findAllBook(book);
    }
}
