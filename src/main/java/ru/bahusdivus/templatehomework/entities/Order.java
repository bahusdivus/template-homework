package ru.bahusdivus.templatehomework.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Order implements Serializable {
    private long number;
    private LocalDate date;
    private Map<Item, Integer> items;
}
