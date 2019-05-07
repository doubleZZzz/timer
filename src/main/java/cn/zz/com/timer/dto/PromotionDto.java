package cn.zz.com.timer.dto;

/**
 * @Auther: ZhangZhuo
 * @Date: 2019/5/7 09:49
 * @Description:
 */
public class PromotionDto {

    /**
     * 活动ID
     */
    private String CREATOR_ORG_ID;

    /**
     * 活动名称
     */
    private String CREATOR_ORG_NAME;

    /**
     * 上级活动ID
     */
    private String UP_PROM_ID;

    /**
     * 活动开始时间
     */
    private String START_TIME;

    /**
     * 活动结束时间
     */
    private String END_TIME;

    /**
     * 报名开始时间
     */
    private String REGISTER_START_TIME;

    /**
     * 报名结束时间
     */
    private String REGISTER_END_TIME;

    /**
     * 报名状态:(1未开始;2报名中;3已结束;4已强制关闭)
     */
    private Integer REGISTER_STATUS;

    /**
     * 活动状态:(1未开始;2报名中;3已结束;4已强制关闭)
     */
    private Integer STATUS;

    /**
     * 获取: UP_PROM_ID.
     *
     * @return the value of UP_PROM_ID
     */
    public String getUP_PROM_ID() {
        return UP_PROM_ID;
    }

    /**
     * 设置: UP_PROM_ID.
     *
     * @param UP_PROM_ID UP_PROM_ID
     */
    public void setUP_PROM_ID(String UP_PROM_ID) {
        this.UP_PROM_ID = UP_PROM_ID;
    }

    public String getCREATOR_ORG_ID() {
        return CREATOR_ORG_ID;
    }

    public void setCREATOR_ORG_ID(String CREATOR_ORG_ID) {
        this.CREATOR_ORG_ID = CREATOR_ORG_ID;
    }

    public String getCREATOR_ORG_NAME() {
        return CREATOR_ORG_NAME;
    }

    public void setCREATOR_ORG_NAME(String CREATOR_ORG_NAME) {
        this.CREATOR_ORG_NAME = CREATOR_ORG_NAME;
    }

    public String getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(String START_TIME) {
        this.START_TIME = START_TIME;
    }

    public String getEND_TIME() {
        return END_TIME;
    }

    public void setEND_TIME(String END_TIME) {
        this.END_TIME = END_TIME;
    }

    public String getREGISTER_START_TIME() {
        return REGISTER_START_TIME;
    }

    public void setREGISTER_START_TIME(String REGISTER_START_TIME) {
        this.REGISTER_START_TIME = REGISTER_START_TIME;
    }

    public String getREGISTER_END_TIME() {
        return REGISTER_END_TIME;
    }

    public void setREGISTER_END_TIME(String REGISTER_END_TIME) {
        this.REGISTER_END_TIME = REGISTER_END_TIME;
    }

    public Integer getREGISTER_STATUS() {
        return REGISTER_STATUS;
    }

    public void setREGISTER_STATUS(Integer REGISTER_STATUS) {
        this.REGISTER_STATUS = REGISTER_STATUS;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String toString() {
        return "TPromotion{" +
                "CREATOR_ORG_ID='" + CREATOR_ORG_ID + '\'' +
                ", CREATOR_ORG_NAME='" + CREATOR_ORG_NAME + '\'' +
                ", UP_PROM_ID='" + UP_PROM_ID + '\'' +
                ", START_TIME='" + START_TIME + '\'' +
                ", END_TIME='" + END_TIME + '\'' +
                ", REGISTER_START_TIME='" + REGISTER_START_TIME + '\'' +
                ", REGISTER_END_TIME='" + REGISTER_END_TIME + '\'' +
                ", REGISTER_STATUS=" + REGISTER_STATUS +
                ", STATUS=" + STATUS +
                '}';
    }
}
