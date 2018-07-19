package com.falabella.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CustomFields implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String name;

    private String type;

    private String label;

    private String value;

}
