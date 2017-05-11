package cn.taotao.july.service.impl;

import cn.taotao.july.pojo.Content;
import cn.taotao.july.mapper.ContentMapper;
import cn.taotao.july.service.IContentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhou
 * @since 2017-05-07
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {
	
}
