package com.ssm.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbUser extends Model<TbUser> {

    private static final long serialVersionUID=1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    /**
     *  用户名
     */
    private String uName;

    /**
     * 用户头像
     */
    private String uPhoto;

    /**
     * 用户唯一标识
     */
    private String uOpenId;

    /**
     * 登录时间
     */
    private LocalDateTime uLoginTime;


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getuOpenId() {
        return uOpenId;
    }

    public void setuOpenId(String uOpenId) {
        this.uOpenId = uOpenId;
    }

    public LocalDateTime getuLoginTime() {
        return uLoginTime;
    }

    public void setuLoginTime(LocalDateTime uLoginTime) {
        this.uLoginTime = uLoginTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.uId;
    }

    @Override
    public String toString() {
        return "TbUser{" +
        "uId=" + uId +
        ", uName=" + uName +
        ", uPhoto=" + uPhoto +
        ", uOpenId=" + uOpenId +
        ", uLoginTime=" + uLoginTime +
        "}";
    }
}
