package cn.yswu.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @author yswu
 * @date 2021-07-19 22:33
 */

@TableName("tbl_employee")
public class Employees {
    @TableId(value="id",type = IdType.AUTO)
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;

//    @TableLogic(value = "1",delval = "0")
    private Integer enabled;

    //创建时间：希望在添加数据的时候进行填充
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    //希望修改的时候对数据进行填充
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;

    public Employees(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Employees() {
    }

    public Employees(Integer id, String lastName, String email, Integer gender, Integer age) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", enabled=" + enabled +
                '}';
    }
}
