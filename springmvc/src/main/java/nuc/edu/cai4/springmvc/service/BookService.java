package nuc.edu.cai4.springmvc.service;


import nuc.edu.cai4.springmvc.entity.Book;

import java.util.List;

public interface BookService {
    public boolean insertBook(Book book);
    public Book showBookById(Integer b_id);
    public List<Book> showBookAll();
    public List<Book> showBookAll(Book book);
}
