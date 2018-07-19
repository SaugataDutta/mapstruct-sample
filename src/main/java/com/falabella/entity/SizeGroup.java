package com.falabella.entity;

import com.falabella.entity.types.JsonType;
import com.falabella.entity.types.StringArrayType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "size_group")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
public class SizeGroup {

    @Id
    private String id;

    private String displayName;

    @Type(type = "StringArray")
    private String[] targetCategories;

    @Type(type = "StringArray")
    private String[] targetBrands;

    @Type(type = "JsonType")
    private SizeElement[] sizes;

    private Boolean pimApproved;

    private String pimObjectType;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime lastModifiedDate;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
