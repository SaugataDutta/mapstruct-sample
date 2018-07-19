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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Table(name = "catalog")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
public class Catalog implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String business;

    private String country;

    private String displayName;

    @Type(type = "StringArray")
    private String[] rootCategories;

    private Boolean pimApproved;
    
    private String pimObjectType;

    private LocalDateTime lastModifiedDate;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
