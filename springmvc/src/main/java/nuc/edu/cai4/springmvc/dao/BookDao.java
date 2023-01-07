package nuc.edu.cai4.springmvc.dao;

import nuc.edu.cai4.springmvc.entity.Book;

import java.util.List;

public interface BookDao {
    public Book findById(Integer b_id);
    public Boolean insertBook(Book book);
    public List<Book> findAllBook();
    public List<Book> findAllBook(Book book);
}
