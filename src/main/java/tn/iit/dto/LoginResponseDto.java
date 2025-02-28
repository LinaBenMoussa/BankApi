package tn.iit.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.apache.catalina.User;

@Builder
@Getter
@Data
public class LoginResponseDto {
    private String accessToken;
    private User user;
}
