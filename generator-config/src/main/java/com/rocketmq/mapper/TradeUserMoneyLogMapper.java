package com.rocketmq.mapper;

import com.rocketmq.pojo.TradeUserMoneyLog;
import com.rocketmq.pojo.TradeUserMoneyLogExample;
import com.rocketmq.pojo.TradeUserMoneyLogKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeUserMoneyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    long countByExample(TradeUserMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int deleteByExample(TradeUserMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(TradeUserMoneyLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int insert(TradeUserMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int insertSelective(TradeUserMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    List<TradeUserMoneyLog> selectByExample(TradeUserMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    TradeUserMoneyLog selectByPrimaryKey(TradeUserMoneyLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TradeUserMoneyLog record, @Param("example") TradeUserMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TradeUserMoneyLog record, @Param("example") TradeUserMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TradeUserMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user_money_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TradeUserMoneyLog record);
}