package com.savvybytes.usertraumax.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programme{
    private int id;
    private String title;
    private String description;
}
