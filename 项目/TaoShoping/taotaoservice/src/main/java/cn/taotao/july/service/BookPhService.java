package cn.taotao.july.service;

import cn.taotao.july.pojo.Book;

import java.util.List;

/**
 * 哲学类书籍<br>
 * create:2017-05-09 15:03
 *
 * @author zhou
 */
public interface BookPhService {
    /*按照类型查找书*/
    List<Book>  findBookPh(int btid);
    /*按照书的编号查找*/
    Book findBookByno(Book book);
    /*显示所有书籍*/
    List<Book> findAllBook();
    /*插入新书*/
    public Integer insertBook(Book book);
    /*更新图书信息*/
    public int updateBook(Book book);
    /*删除用户信息*/
    public int deleteBook(Book book);
}
