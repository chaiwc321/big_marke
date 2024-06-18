package cn.cwc.domain.strategy.service.armory;


/** 策略装配 （工厂模式） */
public interface IStrategyArmory {
    /** 装配抽奖策略 */
    boolean assembleLotteryStrategy(Long strategyId);
}
