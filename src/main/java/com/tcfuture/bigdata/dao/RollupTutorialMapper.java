package com.tcfuture.bigdata.dao;

import com.tcfuture.bigdata.domain.RollupTutorial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@Mapper
public interface RollupTutorialMapper {

    @Select("SELECT * FROM \"rollup-tutorial\"")
    List<RollupTutorial> getRollupList();
}
