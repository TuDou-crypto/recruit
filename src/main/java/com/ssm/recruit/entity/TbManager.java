package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 管理员
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbManager extends Model<TbManager> {

    private static final long serialVersionUID=1L;

    @TableId(value = "m_id", type = IdType.AUTO)
    private Integer mId;

    /**
     * 账号 
     */
    private String mUsername;

    /**
     * 密码
     */
    private String mPassword;

    /**
     * 登录次数 
     */
    private Integer mLoginCount;

    /**
     * 登录时间 
     */
    private LocalDateTime mLoginTime;


    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public Integer getmLoginCount() {
        return mLoginCount;
    }

    public void setmLoginCount(Integer mLoginCount) {
        this.mLoginCount = mLoginCount;
    }

    public LocalDateTime getmLoginTime() {
        return mLoginTime;
    }

    public void setmLoginTime(LocalDateTime mLoginTime) {
        this.mLoginTime = mLoginTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.mId;
    }

    @Override
    public String toString() {
        return "TbManager{" +
        "mId=" + mId +
        ", mUsername=" + mUsername +
        ", mPassword=" + mPassword +
        ", mLoginCount=" + mLoginCount +
        ", mLoginTime=" + mLoginTime +
        "}";
    }
}
