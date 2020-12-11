package com.tcfuture.bigdata;

import com.tcfuture.bigdata.dao.RollupTutorialMapper;
import com.tcfuture.bigdata.domain.RollupTutorial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 *
 */
@SpringBootTest
class SpringbootDruidApplicationTests {

    @Autowired
    RollupTutorialMapper rollupTutorialMapper;

    @Test
    void contextLoads(){

        List<RollupTutorial> rollupList = rollupTutorialMapper.getRollupList();
        for (RollupTutorial rollupTutorial : rollupList) {
            System.out.println(rollupTutorial);
        }

    }

}