package com.hsshy.beam.modular.common.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hsshy.beam.modular.common.entity.SysConfig;

import java.util.Optional;

/**
 * <p>
 * 系统配置信息表 服务类
 * </p>
 *
 * @author stylefeng
 * @since 2018-10-15
 */
public interface ISysConfigService extends IService<SysConfig> {

     <T> T getConfigObject(String key, Class<T> clazz);

     void updateValueByKey(String key, String value);

     String getValue(String key, String defaultValue) ;

}
