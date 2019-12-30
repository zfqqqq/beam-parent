package com.hsshy.beam.modular.blog.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hsshy.beam.common.utils.R;
import com.hsshy.beam.modular.blog.entity.Article;
import com.hsshy.beam.modular.blog.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 *
 * @author hs
 * @email 457030599@qq.com
 * @date 2019-08-14 10:56:42
 */
public interface IArticleCategoryService extends IService<ArticleCategory> {

    void changeFrozen(Long id, Integer frozen);

    int countAcRef(Long categoryId);

    List<ArticleCategory> getArticleCategoryList();

}
