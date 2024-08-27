package org.classreviewsite.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.user.data.User;

@Data
@AllArgsConstructor
public class UserInfo {

    private int userNumber;
    private String username;
    private String profile;

    public static UserInfo from(User user){
        return new UserInfo(
                user.getUserNumber(),
                user.getNickname(),
                "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/profile.png"
        );
    }


}
