package reqres_user_objects;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserForRegistrationAndLogin {

    String email;
    String password;
}
