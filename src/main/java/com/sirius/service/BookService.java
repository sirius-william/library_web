/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-14 19:35
 */
package com.sirius.service;

import com.sirius.domain.Book;

import java.util.ArrayList;

public interface BookService {
    ArrayList<Book> showAllBooks();
    ArrayList<Book> showBooks(String name);
    Book showBooks(Integer id);
    Book showBooksByAuthor(String author);
    ArrayList<Book> showBooksByType(String type);
    Book showBooksByISBN(String isbn);
    Boolean borrowBook(Book book);
    Boolean borrowBook(ArrayList<Book> books);
    Boolean returnBook(Book book);
    Boolean returnBook(ArrayList<Book> books);
    Integer addBook(Book book);
    Integer addBook(ArrayList<Book> books);
}
