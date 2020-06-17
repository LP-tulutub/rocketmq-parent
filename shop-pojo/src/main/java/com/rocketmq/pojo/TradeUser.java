package com.rocketmq.pojo;

import java.io.Serializable;
import java.util.Date;

public class TradeUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_mobile
     *
     * @mbg.generated
     */
    private String userMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_score
     *
     * @mbg.generated
     */
    private Integer userScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_reg_time
     *
     * @mbg.generated
     */
    private Date userRegTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user.user_money
     *
     * @mbg.generated
     */
    private Long userMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_id
     *
     * @return the value of trade_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_id
     *
     * @param userId the value for trade_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_name
     *
     * @return the value of trade_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_name
     *
     * @param userName the value for trade_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_password
     *
     * @return the value of trade_user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_password
     *
     * @param userPassword the value for trade_user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_mobile
     *
     * @return the value of trade_user.user_mobile
     *
     * @mbg.generated
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_mobile
     *
     * @param userMobile the value for trade_user.user_mobile
     *
     * @mbg.generated
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_score
     *
     * @return the value of trade_user.user_score
     *
     * @mbg.generated
     */
    public Integer getUserScore() {
        return userScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_score
     *
     * @param userScore the value for trade_user.user_score
     *
     * @mbg.generated
     */
    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_reg_time
     *
     * @return the value of trade_user.user_reg_time
     *
     * @mbg.generated
     */
    public Date getUserRegTime() {
        return userRegTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_reg_time
     *
     * @param userRegTime the value for trade_user.user_reg_time
     *
     * @mbg.generated
     */
    public void setUserRegTime(Date userRegTime) {
        this.userRegTime = userRegTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user.user_money
     *
     * @return the value of trade_user.user_money
     *
     * @mbg.generated
     */
    public Long getUserMoney() {
        return userMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user.user_money
     *
     * @param userMoney the value for trade_user.user_money
     *
     * @mbg.generated
     */
    public void setUserMoney(Long userMoney) {
        this.userMoney = userMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userScore=").append(userScore);
        sb.append(", userRegTime=").append(userRegTime);
        sb.append(", userMoney=").append(userMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}