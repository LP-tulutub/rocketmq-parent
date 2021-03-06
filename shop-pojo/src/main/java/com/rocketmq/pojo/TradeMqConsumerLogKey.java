package com.rocketmq.pojo;

import java.io.Serializable;

public class TradeMqConsumerLogKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_consumer_log.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_consumer_log.msg_tag
     *
     * @mbg.generated
     */
    private String msgTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_consumer_log.msg_key
     *
     * @mbg.generated
     */
    private String msgKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade_mq_consumer_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_consumer_log.group_name
     *
     * @return the value of trade_mq_consumer_log.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_consumer_log.group_name
     *
     * @param groupName the value for trade_mq_consumer_log.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_consumer_log.msg_tag
     *
     * @return the value of trade_mq_consumer_log.msg_tag
     *
     * @mbg.generated
     */
    public String getMsgTag() {
        return msgTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_consumer_log.msg_tag
     *
     * @param msgTag the value for trade_mq_consumer_log.msg_tag
     *
     * @mbg.generated
     */
    public void setMsgTag(String msgTag) {
        this.msgTag = msgTag == null ? null : msgTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_consumer_log.msg_key
     *
     * @return the value of trade_mq_consumer_log.msg_key
     *
     * @mbg.generated
     */
    public String getMsgKey() {
        return msgKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_consumer_log.msg_key
     *
     * @param msgKey the value for trade_mq_consumer_log.msg_key
     *
     * @mbg.generated
     */
    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_mq_consumer_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupName=").append(groupName);
        sb.append(", msgTag=").append(msgTag);
        sb.append(", msgKey=").append(msgKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}