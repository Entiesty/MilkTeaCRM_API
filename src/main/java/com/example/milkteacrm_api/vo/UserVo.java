package com.example.milkteacrm_api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    private String id;
    private String userName;
    private String password;
    private String nickName;
    private String telephone;
    private String mobile;
    private String email;
    private String sex;
    private Integer useful;
    private String createTime;
    private Integer type;
}
