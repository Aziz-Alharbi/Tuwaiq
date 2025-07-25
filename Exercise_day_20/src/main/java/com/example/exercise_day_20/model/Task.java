package com.example.exercise_day_20.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean status;

}