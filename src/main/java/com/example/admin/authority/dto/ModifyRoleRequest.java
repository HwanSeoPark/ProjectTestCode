package com.example.admin.authority.dto;

import com.example.account.user.constant.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModifyRoleRequest {

    private long userKey;

    private UserRole userRole;

}
