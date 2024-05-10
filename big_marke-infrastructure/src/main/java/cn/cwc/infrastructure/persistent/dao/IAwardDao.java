package cn.cwc.infrastructure.persistent.dao;

import cn.cwc.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAwardDao {

    /** 查询奖品列表 */
    List<Award> queryAwardList();
}
