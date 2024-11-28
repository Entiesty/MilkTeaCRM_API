package com.example.milkteacrm_api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class UserPo {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String userName;
    private String password;
    private String nickName;
    private String telephone;
    private String mobile;
    private String email;
    @TableField("sex")
    private Integer sexCode;
    private Integer useful;
    private String createTime;
    private Integer type;
}
