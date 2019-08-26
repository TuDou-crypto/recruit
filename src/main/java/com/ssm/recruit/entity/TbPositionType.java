package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 职位类型
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbPositionType extends Model<TbPositionType> {

    private static final long serialVersionUID=1L;

    @TableId(value = "pt_id", type = IdType.AUTO)
    private Integer ptId;

    /**
     * 职位名称
     */
    private String ptName;

    /**
     * 添加时间
     */
    private LocalDateTime ptTime;

    /**
     * 状态1使用，0不使用
     */
    private Integer ptState;


    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public LocalDateTime getPtTime() {
        return ptTime;
    }

    public void setPtTime(LocalDateTime ptTime) {
        this.ptTime = ptTime;
    }

    public Integer getPtState() {
        return ptState;
    }

    public void setPtState(Integer ptState) {
        this.ptState = ptState;
    }

    @Override
    protected Serializable pkVal() {
        return this.ptId;
    }

    @Override
    public String toString() {
        return "TbPositionType{" +
        "ptId=" + ptId +
        ", ptName=" + ptName +
        ", ptTime=" + ptTime +
        ", ptState=" + ptState +
        "}";
    }
}
