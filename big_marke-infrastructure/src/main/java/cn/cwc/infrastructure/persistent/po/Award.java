package cn.cwc.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class Award {
    /** 自增id */
    private Long id;
    /** 抽奖奖品id， 内部流转使用？ */
    private Integer awardId;
    /** 奖品对应标识， 每一个都是对应一个发奖策略 */
    private String awardKey;
    /** 奖品配置信息 */
    private String awardConfig;
    /** 奖品内容描述 */
    private String awardDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
    /**  */
    /**  */
    /**  */
}
