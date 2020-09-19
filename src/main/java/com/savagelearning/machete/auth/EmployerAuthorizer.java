package com.savagelearning.machete.auth;

import com.savagelearning.machete.core.User;
import io.dropwizard.auth.Authorizer;

public class EmployerAuthorizer implements Authorizer<User> {

    @Override
    public boolean authorize(User user, String role) {
        return user.getRoles() != null && user.getRoles().contains(role);
    }
}
