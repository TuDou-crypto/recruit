package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 招聘类型管理
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbRecruitType extends Model<TbRecruitType> {

    private static final long serialVersionUID=1L;

    @TableId(value = "r_id", type = IdType.AUTO)
    private Integer rId;

    /**
     * 类型名称
     */
    private String rName;

    /**
     * 添加时间
     */
    private LocalDateTime rTime;

    /**
     * 1使用，0不使用
     */
    private Integer rState;


    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public LocalDateTime getrTime() {
        return rTime;
    }

    public void setrTime(LocalDateTime rTime) {
        this.rTime = rTime;
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    @Override
    protected Serializable pkVal() {
        return this.rId;
    }

    @Override
    public String toString() {
        return "TbRecruitType{" +
        "rId=" + rId +
        ", rName=" + rName +
        ", rTime=" + rTime +
        ", rState=" + rState +
        "}";
    }
}
