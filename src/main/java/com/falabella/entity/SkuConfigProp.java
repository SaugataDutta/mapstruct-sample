package com.falabella.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class SkuConfigProp implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String id;
    
    private String targetAttribute;
    
    private String displayName;
    
    private String description;
    
    private ProdSkuConfig configurationOptions;
    
    private LocalDateTime lastModifiedDate;
    
    private CustomFields[] custom;
    
}
