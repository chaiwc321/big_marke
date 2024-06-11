package cn.cwc.domain.strategy.repository;

import cn.cwc.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

// 连接基础层接口
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    // 得到概率的范围？
    int getRateRange(Long strategyId);
}
