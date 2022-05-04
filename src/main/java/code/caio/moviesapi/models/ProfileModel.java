package code.caio.moviesapi.models;

import org.springframework.security.core.GrantedAuthority;

public class ProfileModel implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return null;
    }
}
