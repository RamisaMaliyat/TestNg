package framework.models;

import lombok.Getter;

@Getter
public class UserData {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassward() {
        return password;
    }
}
