package com.hsshy.beam.modular.blog.service.impl;
import com.hsshy.beam.common.constant.Constant;
import com.hsshy.beam.common.utils.R;
import com.hsshy.beam.modular.blog.dao.ArticleCategoryMapper;
import com.hsshy.beam.modular.blog.entity.Article;
import com.hsshy.beam.modular.blog.entity.ArticleCategory;
import com.hsshy.beam.modular.blog.service.IArticleCategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 
 *
 * @author hs
 * @email 457030599@qq.com
 * @date 2019-08-14 10:56:42
 */
@Service
public class ArticleCategoryServiceImpl extends ServiceImpl<ArticleCategoryMapper, ArticleCategory> implements IArticleCategoryService {


    @Override
    public void changeFrozen(Long id, Integer frozen) {
        baseMapper.changeFrozen(id,frozen);
    }

    @Override
    public int countAcRef(Long categoryId) {
        return baseMapper.countAcRef(categoryId);
    }

    @Override
    public List<ArticleCategory> getArticleCategoryList() {
        return baseMapper.getArticleCategoryList();
    }


}
