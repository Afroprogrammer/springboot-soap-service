package com.example.springbootsoapservice.endpoint;

import com.example.springboot_soap_service.GetUserRequest;
import com.example.springboot_soap_service.GetUserResponse;
import com.example.springboot_soap_service.User;
import com.example.springbootsoapservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://example.com/springboot-soap-service",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse response = new GetUserResponse();
       response.setUser(userService.getUser(request.getName()));
       return response;
    }

}
