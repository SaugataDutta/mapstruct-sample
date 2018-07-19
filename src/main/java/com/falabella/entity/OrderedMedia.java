package com.falabella.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OrderedMedia implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String mediaId;

    private Integer priority;
    
}
