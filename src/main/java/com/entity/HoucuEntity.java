package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 后厨
 *
 * @author 
 * @email
 */
@TableName("houcu")
public class HoucuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HoucuEntity() {

	}

	public HoucuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 后厨姓名
     */
    @TableField(value = "houcu_name")

    private String houcuName;


    /**
     * 后厨手机号
     */
    @TableField(value = "houcu_phone")

    private String houcuPhone;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "houcu_email")

    private String houcuEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：后厨姓名
	 */
    public String getHoucuName() {
        return houcuName;
    }


    /**
	 * 获取：后厨姓名
	 */

    public void setHoucuName(String houcuName) {
        this.houcuName = houcuName;
    }
    /**
	 * 设置：后厨手机号
	 */
    public String getHoucuPhone() {
        return houcuPhone;
    }


    /**
	 * 获取：后厨手机号
	 */

    public void setHoucuPhone(String houcuPhone) {
        this.houcuPhone = houcuPhone;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getHoucuEmail() {
        return houcuEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setHoucuEmail(String houcuEmail) {
        this.houcuEmail = houcuEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Houcu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", houcuName=" + houcuName +
            ", houcuPhone=" + houcuPhone +
            ", sexTypes=" + sexTypes +
            ", houcuEmail=" + houcuEmail +
            ", createTime=" + createTime +
        "}";
    }
}
