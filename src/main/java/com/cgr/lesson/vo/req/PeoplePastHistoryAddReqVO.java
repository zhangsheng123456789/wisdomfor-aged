package com.cgr.lesson.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ Author     ：cgr
 * @ Date       ：Created in 21:04 2020-05-27
 * @ Description：既往史新增接收VO
 * @ Modified By：
 */
@Data
public class PeoplePastHistoryAddReqVO {
    @NotBlank(message = "外键ID不能为空")
    @ApiModelProperty(value = "基本信息个人ID")
    private String pid;

    @ApiModelProperty(value = "疾病史")
    private Integer diseaseHistory;

    @ApiModelProperty(value="手术史")
    private Integer operationHistory;

    @ApiModelProperty("外伤史")
    private Integer traumaHistory;

    @ApiModelProperty(value = "输血史")
    private Integer bunkoHistory;

    @ApiModelProperty(value = "父亲病史")
    private Integer fatherDisease;

    @ApiModelProperty(value = "母亲病史")
    private Integer montherDisease;

    @ApiModelProperty(value = "兄弟姐妹病史")
    private Integer brotherDisease;

    @ApiModelProperty(value = "子女病史")
    private Integer childrenDisease;

    @ApiModelProperty(value = "遗传病史")
    private Integer heredityDisease;

    @ApiModelProperty(value = "残疾病史")
    private Integer disability;

    @ApiModelProperty(value = "残疾病史其他")
    private String disabilityText;

    @ApiModelProperty(value = "残疾证号")
    private String disabilityNum;

    @ApiModelProperty(value = "残疾等级")
    private Integer disabilityGrade;
}
