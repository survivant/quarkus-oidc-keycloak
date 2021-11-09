package org.acme.security.openid.connect.model;

import io.quarkus.security.identity.SecurityIdentity;

public class User {

    public User(){
        userName="empty";
    }

    private final String userName;

    public User(SecurityIdentity identity) {
        this.userName = identity.getPrincipal().getName();
    }

    public String getUserName() {
        return userName;
    }
}
