package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户投递简历表
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbDeliveryResume extends Model<TbDeliveryResume> {

    private static final long serialVersionUID=1L;

    @TableId(value = "d_id", type = IdType.AUTO)
    private Integer dId;

    /**
     * 用户ID
     */
    private Integer uId;

    /**
     * 微简历ID
     */
    private Integer mId;

    /**
     * 投递时间
     */
    private LocalDateTime dTime;

    /**
     * 职位ID
     */
    private Integer pId;

    /**
     * 状态0投递成功，1被查看,2邀面试
     */
    private Integer dState;


    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public LocalDateTime getdTime() {
        return dTime;
    }

    public void setdTime(LocalDateTime dTime) {
        this.dTime = dTime;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }

    @Override
    protected Serializable pkVal() {
        return this.dId;
    }

    @Override
    public String toString() {
        return "TbDeliveryResume{" +
        "dId=" + dId +
        ", uId=" + uId +
        ", mId=" + mId +
        ", dTime=" + dTime +
        ", pId=" + pId +
        ", dState=" + dState +
        "}";
    }
}
