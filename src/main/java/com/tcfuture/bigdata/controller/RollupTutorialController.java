package com.tcfuture.bigdata.controller;

import com.tcfuture.bigdata.domain.RollupTutorial;
import com.tcfuture.bigdata.service.RollupTutorialService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@RestController()
@RequestMapping("/rollupTutorial")
public class RollupTutorialController {

    @Resource
    private RollupTutorialService rollupTutorialService ;

    @GetMapping("/selectList")
    public List<RollupTutorial> list(){
        return rollupTutorialService.getRollupTutorials();
    }
}
