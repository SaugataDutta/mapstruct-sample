package com.falabella.domain;

import java.time.LocalDateTime;

import com.falabella.entity.CustomFields;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SkuConfigPropEntity {

    private String id;

    private String targetAttribute;

    private String displayName;

    private String description;

    private ProdSkuConfigEntity configurationOptions;

    private LocalDateTime lastModifiedDate;

    private CustomFields[] custom;

}
