package com.ssm.recruit.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 简历表
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
public class TbResume extends Model<TbResume> {

    private static final long serialVersionUID=1L;

    @TableId(value = "r_id", type = IdType.AUTO)
    private Integer rId;

    /**
     * 名称
     */
    private String rName;

    /**
     * 年龄
     */
    private Integer rAge;

    /**
     * 1.男。0女
     */
    private Integer rSex;

    /**
     * 经验时长
     */
    private BigDecimal rExperienceDuration;

    /**
     * 学历
     */
    private String rEducation;

    /**
     * 自我评价
     */
    private String rSelfEvaluation;

    /**
     * 求职期望（期望职位）
     */
    private String rJobWanted;

    /**
     * 工作经历
     */
    private String rWorkHistory;

    /**
     * 教育经历（毕业学校）
     */
    private String rHighSchool;


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

    public Integer getrAge() {
        return rAge;
    }

    public void setrAge(Integer rAge) {
        this.rAge = rAge;
    }

    public Integer getrSex() {
        return rSex;
    }

    public void setrSex(Integer rSex) {
        this.rSex = rSex;
    }

    public BigDecimal getrExperienceDuration() {
        return rExperienceDuration;
    }

    public void setrExperienceDuration(BigDecimal rExperienceDuration) {
        this.rExperienceDuration = rExperienceDuration;
    }

    public String getrEducation() {
        return rEducation;
    }

    public void setrEducation(String rEducation) {
        this.rEducation = rEducation;
    }

    public String getrSelfEvaluation() {
        return rSelfEvaluation;
    }

    public void setrSelfEvaluation(String rSelfEvaluation) {
        this.rSelfEvaluation = rSelfEvaluation;
    }

    public String getrJobWanted() {
        return rJobWanted;
    }

    public void setrJobWanted(String rJobWanted) {
        this.rJobWanted = rJobWanted;
    }

    public String getrWorkHistory() {
        return rWorkHistory;
    }

    public void setrWorkHistory(String rWorkHistory) {
        this.rWorkHistory = rWorkHistory;
    }

    public String getrHighSchool() {
        return rHighSchool;
    }

    public void setrHighSchool(String rHighSchool) {
        this.rHighSchool = rHighSchool;
    }

    @Override
    protected Serializable pkVal() {
        return this.rId;
    }

    @Override
    public String toString() {
        return "TbResume{" +
        "rId=" + rId +
        ", rName=" + rName +
        ", rAge=" + rAge +
        ", rSex=" + rSex +
        ", rExperienceDuration=" + rExperienceDuration +
        ", rEducation=" + rEducation +
        ", rSelfEvaluation=" + rSelfEvaluation +
        ", rJobWanted=" + rJobWanted +
        ", rWorkHistory=" + rWorkHistory +
        ", rHighSchool=" + rHighSchool +
        "}";
    }
}
