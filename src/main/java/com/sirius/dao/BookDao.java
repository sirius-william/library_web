package com.sirius.dao;

import com.sirius.domain.Book;

import java.util.ArrayList;
import java.util.Date;

public interface BookDao {
    /*查询*/
    // 根据书名查询
    ArrayList<Book> selectBookByName(String name);
    // 根据书名和作者查询
    ArrayList<Book> selectBookByNameAndAuthor(String name, String author);
    // 根据对象查询
    Book selectBook(Book book);
    // 根据ISBN查询
    Book selectBookByISBN(String isbn);
    // 根据类型查询
    ArrayList<Book> selectBookByType(String type);
    // 根据作者查询
    ArrayList<Book> selectBookByAuthor(String author);
    // 查询剩余量为0的书籍
    ArrayList<Book> selectBookRemainZero();
    // 查询剩余量不为0的书籍
    ArrayList<Book> selectBookRemain();
    // 根据出版时间区间查询
    ArrayList<Book> selectBookByPublishTimeSection(Date left, Date right);
    // 其他条件查询，指定字段，非选字段为null
    ArrayList<Book> selectBookByOtherCondition(Book book);
    /*增加*/
    int insertBook(Book book);
    /*修改*/
    // 根据ISBN修改
    int updateBookByName(String isbn, Book book);
    // 根据id修改
    int updateBookById(Integer id, Book book);
    // 根据对象修改
    int updateBook(Book oldBook, Book newBook);
    /*删除*/
    // 根据ISBN删除
    int deleteByISBN(String isbn);
    // 根据id删除
    int deleteById(Integer id);
    // 根据对象删除
    int deleteBook(Book book);
    // 删除一个作者的全部书籍
    int deleteBookByAuthor(String author);
    // 删除出版时间区间的书籍
    int deleteBookByPublishTimeSection(Date left, Date right);
    // 删除指定名称的全部书籍
    int deleteBookByName(String name);
    // 删除指定类型的书籍
    int deleteBookByType(String type);
    // 根据书名和作者删除书籍
    int deleteBookByNameAndAuthor(String name, String author);
    // 根据其他条件删除书籍，指定字段，非选字段为null
    int deleteBookByOtherCondition(Book book);
}
