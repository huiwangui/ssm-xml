package com.hxyc.dao;

import com.hxyc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * creater: 13116
 * create time: 2021/1/13
 * describe:
 */
public interface BookDao {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(@Param("bookID") int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    /**
     * 1、在接口方法的参数前加 @Param属性
     * 2、Sql语句编写的时候，直接取@Param中设置的值即可，不需要单独设置参数类型
     *
     */
    Books queryBookById(@Param("bookID") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName")String bookName);

}
