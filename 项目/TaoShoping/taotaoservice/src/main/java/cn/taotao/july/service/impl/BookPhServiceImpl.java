package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.ContentMapper;
import cn.taotao.july.pojo.Content;
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
    private ContentMapper contentMapper;

    @Override
    public List<Content> findBookPh() {
        // 查询类型为哲学的所有书籍记录
        List<Content> bookList = contentMapper.selectList(
                new EntityWrapper<Content>().eq("type", "哲学")
        );
        return bookList;
    }
}
