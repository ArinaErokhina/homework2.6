package com.homework26.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Сотрудник уже добавлен в массив")
public class EmployeeAlreadyAddedException extends RuntimeException {
}