package com.rocketmq.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeUserMoneyLog extends TradeUserMoneyLogKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_money_log.use_money
     *
     * @mbg.generated
     */
    private BigDecimal useMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_money_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_money_log.use_money
     *
     * @return the value of trade_user_money_log.use_money
     *
     * @mbg.generated
     */
    public BigDecimal getUseMoney() {
        return useMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_money_log.use_money
     *
     * @param useMoney the value for trade_user_money_log.use_money
     *
     * @mbg.generated
     */
    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_money_log.create_time
     *
     * @return the value of trade_user_money_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_money_log.create_time
     *
     * @param createTime the value for trade_user_money_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", useMoney=").append(useMoney);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}