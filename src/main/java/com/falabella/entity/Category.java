package com.falabella.entity;

import static com.falabella.config.AppConstants.STRING_ARRAY;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.falabella.entity.enums.ContentType;
import com.falabella.entity.enums.DisplayFormat;
import com.falabella.entity.enums.Template;
import com.falabella.entity.types.JsonType;
import com.falabella.entity.types.StringArrayType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Table(name = "category")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
@TypeDef(name = "content_type", typeClass = PostgreSQLEnumType.class)
@TypeDef(name = "display_format", typeClass = PostgreSQLEnumType.class)
@TypeDef(name = "template", typeClass = PostgreSQLEnumType.class)
public class Category implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String displayName;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime startDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime endDate;

    private String description;

    private String longDescription;

    @Enumerated(EnumType.STRING)
    @Type(type = "content_type")
    private ContentType type;

    private String pimObjectType;

    @Type(type = STRING_ARRAY)
    private String[] pimMatrixIds;

    private String catalogTypeId;

    @Type(type = STRING_ARRAY)
    private String[] parentCategories;

    private String defaultParentCategory;

    @Type(type = STRING_ARRAY)
    private String[] relatedCategories;

    @Type(type = STRING_ARRAY)
    private String[] childProducts;

    @Type(type = STRING_ARRAY)
    private String[] childCategories;

    private String externalReferenceId;

    private Integer orderOfMenu;

    private Boolean isVisible;

    private Boolean viewMore;

    private Integer gridDisplayRaw;

    @Enumerated(EnumType.STRING)
    @Type(type = "display_format")
    private DisplayFormat gridDisplayFormat;

    private Integer maxSubCategoriesShowOnLeftMenu;

    private Integer leafCategoryMaxSize;

    private Boolean isNewTaxonomy;

    private Boolean isDisplayTopMenu;

    private Integer orderOfLeftMenu;

    private Boolean showSecondView;

    private Integer percentageOffMinimum;

    private Boolean noIndex;

    private Boolean noFollow;

    private Integer newIconThresholdDays;

    private String leftPromotionContent;

    private Boolean showRecipientFilter;

    private String suggestedGiftTitle;

    private String sizeGuideMediaId;

    private String otherDimensionGuideMediaId;

    private String otherDimensionName;

    private Boolean giftWrapping;

    private String staticPageId;

    private Integer qpInterestRateCode;

    private Boolean pimApproved;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime lastModifiedDate;

    @Enumerated(EnumType.STRING)
    @Type(type = "template")
    private Template template;

    private String metaTitle;

    private String metaKeywords;

    private String metaDescription;

    @Type(type = STRING_ARRAY)
    private String[] featuredBrands;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
