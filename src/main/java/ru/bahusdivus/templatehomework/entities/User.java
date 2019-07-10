package ru.bahusdivus.templatehomework.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private boolean registered;
    private int bonusAccount;
}
