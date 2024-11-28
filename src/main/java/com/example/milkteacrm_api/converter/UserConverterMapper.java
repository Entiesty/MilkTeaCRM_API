package com.example.milkteacrm_api.converter;

import com.example.milkteacrm_api.pojo.UserPo;
import com.example.milkteacrm_api.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverterMapper {
    UserConverterMapper INSTANCE = Mappers.getMapper(UserConverterMapper.class);

    @Mapping(target = "sex", expression = "java(userPo.getSexCode() == null ? \"未知\" : UserConverter.convertSexCodeToSex(userPo.getSexCode()))")
    UserVo poToVo(UserPo userPo);

    @Mapping(target = "sexCode", expression = "java(userVo.getSex() == null ? null : UserConverter.convertSexToSexCode(userVo.getSex()))")
    UserPo voToPo(UserVo userVo);
}
