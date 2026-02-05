package com.javanauta.agendadortarefas.infrastructure.exception;

import org.apache.tomcat.util.http.parser.Authorization;

import javax.naming.AuthenticationException;

public class UnauthorizedException extends AuthenticationException {

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String message, Throwable throwable){
        super(message);
    }
}
