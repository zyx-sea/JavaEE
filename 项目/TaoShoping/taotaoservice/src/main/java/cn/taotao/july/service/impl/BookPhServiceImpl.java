package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.BookMapper;
import cn.taotao.july.pojo.Book;
import cn.taotao.july.service.BookPhService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 哲学类书籍<br>
 * create:2017-05-09 15:04
 *
 * @author zhou
 */
@Service
public class BookPhServiceImpl implements BookPhService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findBookPh() {
        // 查询类型为哲学的所有书籍记录
        List<Book> bookList = bookMapper.selectList(
                new EntityWrapper<Book>().eq("bt_id", 2)
        );
        return bookList;
    }
}
