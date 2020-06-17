package com.rocketmq.mapper;

import com.rocketmq.pojo.TradeUser;
import com.rocketmq.pojo.TradeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    long countByExample(TradeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int deleteByExample(TradeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int insert(TradeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int insertSelective(TradeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    List<TradeUser> selectByExample(TradeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    TradeUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TradeUser record, @Param("example") TradeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TradeUser record, @Param("example") TradeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TradeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TradeUser record);
}