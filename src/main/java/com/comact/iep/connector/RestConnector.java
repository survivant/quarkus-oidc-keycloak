package com.comact.iep.connector;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.acme.security.openid.connect.model.User;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.oidc.client.filter.OidcClientFilter;
import io.quarkus.oidc.token.propagation.AccessToken;

@ApplicationScoped
@RegisterRestClient
@OidcClientFilter
@AccessToken
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api")
public interface RestConnector {

    @GET
    @Path("/users/me")
    User getUser();

}

