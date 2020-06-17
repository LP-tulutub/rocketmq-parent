package com.rocketmq.pojo;

import java.io.Serializable;
import java.util.Date;

public class TradeMqProducerTemp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.msg_topic
     *
     * @mbg.generated
     */
    private String msgTopic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.msg_tag
     *
     * @mbg.generated
     */
    private String msgTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.msg_key
     *
     * @mbg.generated
     */
    private String msgKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.msg_body
     *
     * @mbg.generated
     */
    private String msgBody;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.msg_status
     *
     * @mbg.generated
     */
    private Integer msgStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_mq_producer_temp.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade_mq_producer_temp
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.id
     *
     * @return the value of trade_mq_producer_temp.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.id
     *
     * @param id the value for trade_mq_producer_temp.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.group_name
     *
     * @return the value of trade_mq_producer_temp.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.group_name
     *
     * @param groupName the value for trade_mq_producer_temp.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.msg_topic
     *
     * @return the value of trade_mq_producer_temp.msg_topic
     *
     * @mbg.generated
     */
    public String getMsgTopic() {
        return msgTopic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.msg_topic
     *
     * @param msgTopic the value for trade_mq_producer_temp.msg_topic
     *
     * @mbg.generated
     */
    public void setMsgTopic(String msgTopic) {
        this.msgTopic = msgTopic == null ? null : msgTopic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.msg_tag
     *
     * @return the value of trade_mq_producer_temp.msg_tag
     *
     * @mbg.generated
     */
    public String getMsgTag() {
        return msgTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.msg_tag
     *
     * @param msgTag the value for trade_mq_producer_temp.msg_tag
     *
     * @mbg.generated
     */
    public void setMsgTag(String msgTag) {
        this.msgTag = msgTag == null ? null : msgTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.msg_key
     *
     * @return the value of trade_mq_producer_temp.msg_key
     *
     * @mbg.generated
     */
    public String getMsgKey() {
        return msgKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.msg_key
     *
     * @param msgKey the value for trade_mq_producer_temp.msg_key
     *
     * @mbg.generated
     */
    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.msg_body
     *
     * @return the value of trade_mq_producer_temp.msg_body
     *
     * @mbg.generated
     */
    public String getMsgBody() {
        return msgBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.msg_body
     *
     * @param msgBody the value for trade_mq_producer_temp.msg_body
     *
     * @mbg.generated
     */
    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.msg_status
     *
     * @return the value of trade_mq_producer_temp.msg_status
     *
     * @mbg.generated
     */
    public Integer getMsgStatus() {
        return msgStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.msg_status
     *
     * @param msgStatus the value for trade_mq_producer_temp.msg_status
     *
     * @mbg.generated
     */
    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_mq_producer_temp.create_time
     *
     * @return the value of trade_mq_producer_temp.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_mq_producer_temp.create_time
     *
     * @param createTime the value for trade_mq_producer_temp.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_mq_producer_temp
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupName=").append(groupName);
        sb.append(", msgTopic=").append(msgTopic);
        sb.append(", msgTag=").append(msgTag);
        sb.append(", msgKey=").append(msgKey);
        sb.append(", msgBody=").append(msgBody);
        sb.append(", msgStatus=").append(msgStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}