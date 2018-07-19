package com.falabella.entity;

import static com.falabella.config.AppConstants.STRING_ARRAY;
import static com.falabella.config.AppConstants.JSON_TYPE;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.falabella.entity.enums.Classification;
import com.falabella.entity.types.JsonType;
import com.falabella.entity.types.StringArrayType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Table(name = "item")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
@TypeDef(name = "classification", typeClass = PostgreSQLEnumType.class)
public class Product implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String displayName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime creationDate;

    private String description;

    @Enumerated(EnumType.STRING)
    @Type(type = "classification")
    private Classification prodClassification;

    private String longDescription;

    private String productType;

    @Type(type = STRING_ARRAY)
    private String[] keywords;

    @Type(type = STRING_ARRAY)
    private String[] childSkus;

    @Type(type = STRING_ARRAY)
    private String[] relatedProducts;

    @Type(type = STRING_ARRAY)
    private String[] upsellProducts;

    @Type(type = STRING_ARRAY)
    private String[] parentCategories;

    private String defaultParentCategory;

    private Boolean showSecondView;

    @Type(type = JSON_TYPE)
    private MatrixAttribute[] attributes;

    @Type(type = STRING_ARRAY)
    private String[] attributeExclusion;

    private String applicableGender;

    private String applicableAge;

    private String externalReferenceId;

    private String activeStatus;

    private Boolean internetExclusiveIcon;

    private Boolean cashOnDeliveryIcon;

    private String model;

    @Column(name = "do_not_send_f12")
    private Boolean doNotSendF12;

    private String sizeChartName;

    private String sizeChartUrl;

    private Boolean multiProduct;

    private String variationView;

    private Integer newIconThresholdDays;

    private String brandId;

    private String sizeGuide;

    private String otherDimensionGuide;

    private String otherDimensionName;

    @Column(name = "view360_image_folder_name")
    private String view360ImageFolderName;

    private Boolean marketPlace;

    private String sellerName;

    private String pageTemplate;

    @Type(type = STRING_ARRAY)
    private String[] extendedWarrantyProds;

    @Type(type = STRING_ARRAY)
    private String[] installationServiceProds;

    @Type(type = STRING_ARRAY)
    private String[] bicycleAssembleServiceProds;

    @Type(type = JSON_TYPE)
    private OrderedMedia[] assetList;

    private String metaTitle;

    private String metaKeywords;

    private String metaDescription;

    private Boolean pimApproved;

    private String pimObjectType;

    private LocalDateTime lastModifiedDate;

    @Type(type = JSON_TYPE)
    private CustomFields[] custom;

    private String pimProductType;

    private String otherDimensions;

    private Boolean forceDisplay;

    private String providerId;

    private String providerCode;

    private String providerName;

    private String upc;

    private String unitForSale;

    private Boolean onlyPromotion;

    private Integer expiredTimePeriod;

    private Boolean externalItem;

    private Boolean generatedPrice;

    private String shippingDimension;

    private String shippingSize;

    private Double weight;

    @Column(name = "novios_skuflag")
    private String noviosSKUFlag;

    private String size;

    private String color;

    private String colorSwatch;

    private String colorGroup;

    private String internalRevenueTaxCode;

    private Double internalRevenueTaxPercent;

    private Double localInternalRevenueTaxAmount;

    @Type(type = JSON_TYPE)
    private ProdSkuConfig[] bundleLinks;

    @Type(type = JSON_TYPE)
    private SkuConfigProp configurableProperties;

}
