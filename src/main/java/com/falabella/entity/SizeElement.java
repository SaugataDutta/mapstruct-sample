package com.falabella.entity;

import com.falabella.entity.types.HstoreType;
import com.falabella.entity.types.JsonType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "HStoreType", typeClass = HstoreType.class)
public class SizeElement {

    @Id
    private String id;

    private String title;

    private String sizeKey;

    @Type(type = "HStoreType")
    private Map<String, String> sizeElements;

    private Boolean pimApproved;

    private String pimObjectType;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime lastModifiedDate;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
