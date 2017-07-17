package com.shop.bean;

import org.springframework.jdbc.core.RowMapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class UserInfo implements RowMapper<UserInfo>, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1569004441805474845L;

    private Integer id;
    private String uname;
    private Integer unumber;
    private Date uRegisterTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUnumber() {
        return unumber;
    }

    public void setUnumber(Integer unumber) {
        this.unumber = unumber;
    }

    public Date getuRegisterTime() {
        return uRegisterTime;
    }

    public void setuRegisterTime(Date uRegisterTime) {
        this.uRegisterTime = uRegisterTime;
    }

    // 实现RowMapper接口是为了方便SpringJDBC管理实体与数据库字段的映射。
    @Override
    public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(rs.getInt("id"));
        userInfo.setUname(rs.getString("uname"));
        userInfo.setUnumber(rs.getInt("unumber"));
        userInfo.setuRegisterTime(rs.getDate("uregister_time"));
        return userInfo;
    }

    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", uname=" + uname + ", unumber=" + unumber + ", uRegisterTime=" + uRegisterTime
            + "]";
    }

}
