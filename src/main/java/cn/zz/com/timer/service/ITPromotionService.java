package cn.zz.com.timer.service;

import cn.zz.com.timer.domain.TPromotion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: ZhangZhuo
 * @Date: 2019/5/7 09:39
 * @Description:
 */
public interface ITPromotionService {

    int deleteByPrimaryKey(@Param("CREATOR_ORG_ID") String CREATOR_ORG_ID, @Param("CREATOR_ORG_NAME") String CREATOR_ORG_NAME);

    int insert(TPromotion record);

    TPromotion selectByPrimaryKey(@Param("CREATOR_ORG_ID") String CREATOR_ORG_ID, @Param("CREATOR_ORG_NAME") String CREATOR_ORG_NAME);

    int updateByPrimaryKey(TPromotion record);

    /**
     * 活动录入
     * @param entity
     */
    void insertProm(TPromotion entity);

    /**
     *  查找所有
     * @return
     */
    List<TPromotion> selectAll();

    List<TPromotion> selectByUpId();

}
