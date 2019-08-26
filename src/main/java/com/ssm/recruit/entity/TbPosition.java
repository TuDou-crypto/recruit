package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 职位
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbPosition extends Model<TbPosition> {

    private static final long serialVersionUID=1L;

    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    /**
     * 职位名称
     */
    private String pName;

    /**
     * 薪资空为面议
     */
    private String pMoneg;

    /**
     * 职位类型ID
     */
    private Integer ptId;

    /**
     * 职位地点ID
     */
    private Integer wId;

    /**
     * 职位描述
     */
    private String pPositionDescribe;

    /**
     * 发布时间
     */
    private LocalDateTime pTime;

    /**
     * 职位状态1启用，0停用
     */
    private Integer pState;


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpMoneg() {
        return pMoneg;
    }

    public void setpMoneg(String pMoneg) {
        this.pMoneg = pMoneg;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getpPositionDescribe() {
        return pPositionDescribe;
    }

    public void setpPositionDescribe(String pPositionDescribe) {
        this.pPositionDescribe = pPositionDescribe;
    }

    public LocalDateTime getpTime() {
        return pTime;
    }

    public void setpTime(LocalDateTime pTime) {
        this.pTime = pTime;
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }

    @Override
    protected Serializable pkVal() {
        return this.pId;
    }

    @Override
    public String toString() {
        return "TbPosition{" +
        "pId=" + pId +
        ", pName=" + pName +
        ", pMoneg=" + pMoneg +
        ", ptId=" + ptId +
        ", wId=" + wId +
        ", pPositionDescribe=" + pPositionDescribe +
        ", pTime=" + pTime +
        ", pState=" + pState +
        "}";
    }
}
