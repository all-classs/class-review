package org.classreviewsite.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUserResponse {

    private int status;

    private String name;

    private String token;

    private String message;

    public static LoginUserResponse of(int status, String name , String token, String message){
        return new LoginUserResponse(status, name, token, message);
    }

}
