package doit.apihw.api.controller.dto;

import lombok.Data;

@Data
public class AuthPasswordChangeRequest {
    private String oldPassword;
    private String newPassword;
}
