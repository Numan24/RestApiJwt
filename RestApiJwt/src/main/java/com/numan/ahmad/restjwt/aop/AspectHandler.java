package com.numan.ahmad.restjwt.aop;

import com.numan.ahmad.restjwt.model.DTOs.CustomErrorResponses;
import com.numan.ahmad.restjwt.model.Users;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class AspectHandler {

    private final LoginValidator loginValidator;

    @Around("execution(* com.numan.ahmad.restjwt.controller.LoginController.login(..)) && args(user)")
    public Object validateUserLogin(ProceedingJoinPoint pjp, Users user) throws Throwable {

        Errors errors = new BeanPropertyBindingResult(user, "user");
        if (!Objects.isNull(user)) {
            ValidationUtils.invokeValidator(loginValidator, user, errors);
        }

        if (errors.hasErrors()) {
            List<String> errorMessage = errors.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());

            log.error(String.join(", "), errorMessage);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(CustomErrorResponses.builder()
                    .ok(false).error(String.join(", ", errorMessage))
                    .build());
        } else {
            return pjp.proceed();
        }

    }



}
