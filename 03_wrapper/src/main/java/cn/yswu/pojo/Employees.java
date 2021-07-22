package cn.yswu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

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

    public Employees() {
    }

    public Employees(Integer id, String lastName, String email, Integer gender, Integer age, Integer enabled) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.enabled = enabled;
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
