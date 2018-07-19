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
public class ProdSkuConfig implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String  id;
    
    private String displayName;
    
    private String description;
    
    private String itemType;

    private String itemId;

    private Long quantity;
    
    private Boolean pimApproved;
   
    private LocalDateTime lastModifiedDate;
    
    private CustomFields[] custom;
    
    
}
