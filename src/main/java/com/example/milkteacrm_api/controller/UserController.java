package com.example.milkteacrm_api.controller;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.milkteacrm_api.converter.UserConverter;
import com.example.milkteacrm_api.pojo.UserPo;
import com.example.milkteacrm_api.service.UserService;
import com.example.milkteacrm_api.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody UserVo userVo) {
        try {
            userVo.setCreateTime(DateUtil.now());
            boolean isSaved = userService.save(UserConverter.voToPo(userVo));

            if(isSaved) {
                return new ResponseEntity<>("User saved successfully", HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>("User saved failed", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("An error occurred: " + e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/check-username/{userName}")
    public ResponseEntity<Boolean> checkUserName(@PathVariable("userName") String userName) {
        QueryWrapper<UserPo> userPoQueryWrapper = new QueryWrapper<>();
        userPoQueryWrapper.eq("user_name", userName);
        boolean isExist = userService.getOne(userPoQueryWrapper) != null;

        return ResponseEntity.ok(isExist);
    }

    @GetMapping("/check-email/{email}")
    public ResponseEntity<Boolean> checkEmail(@PathVariable("email") String email) {
        QueryWrapper<UserPo> userPoQueryWrapper = new QueryWrapper<>();
        userPoQueryWrapper.eq("email", email);
        boolean isExist = userService.getOne(userPoQueryWrapper) != null;

        return ResponseEntity.ok(isExist);
    }
}
