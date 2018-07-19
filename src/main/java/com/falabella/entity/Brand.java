package com.falabella.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.falabella.entity.types.JsonType;
import com.falabella.entity.types.StringArrayType;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Table(name = "brand")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
public class Brand implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String name;

    private String description;

    private String image;

    private String brandHighlightImage;

    private Integer sort;

    private String megaMenuUrl;

    private String brandModuleUrl;

    private String rootBackEndCategory;

    private String parent;

    private Boolean pimApproved;

    private String pimObjectType;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime lastModifiedDate;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
