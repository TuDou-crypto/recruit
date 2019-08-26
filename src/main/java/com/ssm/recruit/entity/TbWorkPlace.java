package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 工作地点管理
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbWorkPlace extends Model<TbWorkPlace> {

    private static final long serialVersionUID=1L;

    @TableId(value = "w_id", type = IdType.AUTO)
    private Integer wId;

    /**
     * 名称
     */
    private String wName;

    /**
     * 添加时间
     */
    private LocalDateTime wTime;

    private String wState;


    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public LocalDateTime getwTime() {
        return wTime;
    }

    public void setwTime(LocalDateTime wTime) {
        this.wTime = wTime;
    }

    public String getwState() {
        return wState;
    }

    public void setwState(String wState) {
        this.wState = wState;
    }

    @Override
    protected Serializable pkVal() {
        return this.wId;
    }

    @Override
    public String toString() {
        return "TbWorkPlace{" +
        "wId=" + wId +
        ", wName=" + wName +
        ", wTime=" + wTime +
        ", wState=" + wState +
        "}";
    }
}
