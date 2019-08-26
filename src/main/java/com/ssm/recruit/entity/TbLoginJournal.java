package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 登录日志
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbLoginJournal extends Model<TbLoginJournal> {

    private static final long serialVersionUID=1L;

    @TableId(value = "lj_id", type = IdType.AUTO)
    private Integer ljId;

    /**
     * 登录时间
     */
    private LocalDateTime ljLogintime;

    /**
     * 登录用户
     */
    private Integer uId;


    public Integer getLjId() {
        return ljId;
    }

    public void setLjId(Integer ljId) {
        this.ljId = ljId;
    }

    public LocalDateTime getLjLogintime() {
        return ljLogintime;
    }

    public void setLjLogintime(LocalDateTime ljLogintime) {
        this.ljLogintime = ljLogintime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    protected Serializable pkVal() {
        return this.ljId;
    }

    @Override
    public String toString() {
        return "TbLoginJournal{" +
        "ljId=" + ljId +
        ", ljLogintime=" + ljLogintime +
        ", uId=" + uId +
        "}";
    }
}
