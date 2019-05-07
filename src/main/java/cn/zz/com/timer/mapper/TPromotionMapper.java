package cn.zz.com.timer.mapper;

import cn.zz.com.timer.domain.TPromotion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TPromotionMapper {
    int deleteByPrimaryKey(@Param("CREATOR_ORG_ID") String CREATOR_ORG_ID, @Param("CREATOR_ORG_NAME") String CREATOR_ORG_NAME);

    int insert(TPromotion record);

    TPromotion selectByPrimaryKey(@Param("CREATOR_ORG_ID") String CREATOR_ORG_ID, @Param("CREATOR_ORG_NAME") String CREATOR_ORG_NAME);

    List<TPromotion> selectAll();

    int updateByPrimaryKey(TPromotion record);

    /**
     *  展示上级活动id为null的所有活动
     * @return
     */
    List<TPromotion> selectByUpId();
}