package cn.zz.com.timer.service.impl;

import cn.zz.com.timer.domain.TPromotion;
import cn.zz.com.timer.mapper.TPromotionMapper;
import cn.zz.com.timer.service.ITPromotionService;
import cn.zz.com.timer.utils.RandomString;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: ZhangZhuo
 * @Date: 2019/5/7 09:40
 * @Description:
 */
@Transactional
@Service
public class TPromotionServiceImpl implements ITPromotionService {

    @Resource
    private TPromotionMapper tPromotionMapper;

    public int deleteByPrimaryKey(String CREATOR_ORG_ID, String CREATOR_ORG_NAME) {
        return tPromotionMapper.deleteByPrimaryKey(CREATOR_ORG_ID, CREATOR_ORG_NAME);
    }

    public int insert(TPromotion record) {
        return tPromotionMapper.insert(record);
    }

    public TPromotion selectByPrimaryKey(String CREATOR_ORG_ID, String CREATOR_ORG_NAME) {
        return tPromotionMapper.selectByPrimaryKey(CREATOR_ORG_ID, CREATOR_ORG_NAME);
    }

    public int updateByPrimaryKey(TPromotion record) {
        return tPromotionMapper.updateByPrimaryKey(record);
    }

    /**
     * 测试添加活动
     * @param entity
     */
    public void insertProm(TPromotion entity) {
        TPromotion prom = new TPromotion();
        BeanUtils.copyProperties(entity, prom);

        String timeId = RandomString.getTimeSequence();
        String random = RandomString.getRandom(6);
        prom.setCREATOR_ORG_ID(timeId);
        prom.setCREATOR_ORG_NAME("活动名字" + random);
        tPromotionMapper.insert(prom);
    }

    public List<TPromotion> selectAll() {
        List<TPromotion> list = tPromotionMapper.selectAll();
        return list;
    }

    public List<TPromotion> selectByUpId() {
        return tPromotionMapper.selectByUpId();
    }
}
