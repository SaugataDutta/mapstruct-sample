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
public class ProdSkuConfigEntity {

    private String id;

    private String displayName;

    private String description;

    private Integer itemType;

    private String itemId;

    private Long quantity;

    private Boolean pimApproved;

    private LocalDateTime lastModifiedDate;

    private CustomFields[] custom;

}
