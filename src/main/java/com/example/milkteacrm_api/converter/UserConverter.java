package com.example.milkteacrm_api.converter;

import com.example.milkteacrm_api.pojo.UserPo;
import com.example.milkteacrm_api.vo.UserVo;

public class UserConverter {
    private static final UserConverterMapper mapper = UserConverterMapper.INSTANCE;

    public static UserVo poToVo(UserPo userPo) {
        return mapper.poToVo(userPo);
    }

    public static UserPo voToPo(UserVo userVo) {
        return mapper.voToPo(userVo);
    }

    public static String convertSexCodeToSex(Integer sexCode) {
        return switch (sexCode) {
            case 0 -> "女";
            case 1 -> "男";
            case 2 -> "保密";
            default -> "未知";
        };
    }

    public static Integer convertSexToSexCode(String sex) {
        return switch (sex) {
            case "女" -> 0;
            case "男" -> 1;
            case "保密" -> 2;
            default -> null;
        };
    }
}
