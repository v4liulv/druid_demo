package com.tcfuture.bigdata.service;

import com.tcfuture.bigdata.dao.RollupTutorialMapper;
import com.tcfuture.bigdata.domain.RollupTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@Service
public class RollupTutorialService {

    @Resource
    RollupTutorialMapper rollupTutorialMapper;

    public List<RollupTutorial> getRollupTutorials(){
        return rollupTutorialMapper.getRollupList();
    }

}
