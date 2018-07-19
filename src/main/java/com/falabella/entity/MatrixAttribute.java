package com.falabella.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatrixAttribute implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String id;
    
    private String name;
    
    private String value;
    
    private String order;
    
    private Boolean pimApproved;
    
    private LocalDateTime lastModifiedDate;
    
    private CustomFields[] custom;
    
}
