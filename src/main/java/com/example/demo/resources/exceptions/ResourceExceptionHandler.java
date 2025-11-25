package com.example.demo.resources.exceptions;

import com.example.demo.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    /*
    Sempre que houver uma exceção do tipo ResourceNotFoundException
    ela vai ser capturada e tratada por meio do método colocado abaixo
    dessa anotação.
    */
    @ExceptionHandler(ResourceNotFoundException.class) //anotação que monitora e que sobe a stackTrace para a classe atual
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource not found"; //Mensagem que aparece para o usuário
        HttpStatus status = HttpStatus.NOT_FOUND; //Retorna o código 404 (o mais apropriado para "não encontrado")
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err); //Retorna o body dos campos JSON personalizados
    }
}
