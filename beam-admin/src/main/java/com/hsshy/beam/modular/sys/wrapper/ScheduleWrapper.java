package com.hsshy.beam.modular.sys.wrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hsshy.beam.modular.base.warpper.BaseControllerWrapper;
import com.hsshy.beam.common.factory.impl.ConstantFactory;
import com.hsshy.beam.common.quartz.ScheduleJob;

import java.util.Map;

public class ScheduleWrapper extends BaseControllerWrapper {


    public ScheduleWrapper(IPage<ScheduleJob> page) {
        super(page);
    }


    @Override
    protected void wrapTheMap(Map<String, Object> map) {
        map.put("statusName",ConstantFactory.me().getDictsByCode("schedule_status",map.get("status")+""));
    }



}
