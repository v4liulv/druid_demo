package com.tcfuture.bigdata.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RollupTutorial {

    private String __time;
    private Integer bytes;
    private Integer count;
    private String dstIP;
    private Integer packets;
    private String srcIP;
}
