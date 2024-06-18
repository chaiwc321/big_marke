package cn.cwc.domain.strategy.repository;

import cn.cwc.domain.strategy.model.entity.StrategyAwardEntity;
import cn.cwc.domain.strategy.model.entity.StrategyEntity;
import cn.cwc.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

// 连接基础层接口
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    // 得到概率的范围？
    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

}
