package com.falabella.domain;

import java.time.LocalDateTime;

import com.falabella.entity.CustomFields;
import com.falabella.entity.MatrixAttribute;
import com.falabella.entity.OrderedMedia;

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
public class ItemEntity {

    private String id;

    private String displayName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime creationDate;

    private String description;
    
    private String prodClassification;

    private String longDescription;

    private Integer productType;

    private String[] keywords;

    private String[] childSkus;

    private String[] relatedProducts;

    private String[] upsellProducts;

    private String[] parentCategories;

    private String defaultParentCategory;

    private Boolean showSecondView;

    private MatrixAttribute[] attributes;

    private String[] attributeExclusion;

    private Integer applicableGender;

    private Integer applicableAge;

    private String externalReferenceId;

    private Integer activeStatus;

    private Boolean internetExclusiveIcon;

    private Boolean cashOnDeliveryIcon;

    private String model;

    private Boolean doNotSendF12;

    private String sizeChartName;

    private String sizeChartUrl;

    private Boolean multiProduct;

    private Integer variationView;

    private Integer newIconThresholdDays;

    private String brandId;

    private String sizeGuide;

    private String otherDimensionGuide;

    private String otherDimensionName;

    private String view360ImageFolderName;

    private Boolean marketPlace;

    private String sellerName;

    private Integer pageTemplate;

    private String[] extendedWarrantyProds;

    private String[] installationServiceProds;

    private String[] bicycleAssembleServiceProds;

    private OrderedMedia[] assetList;

    private String metaTitle;

    private String metaKeywords;

    private String metaDescription;

    private Boolean pimApproved;

    private String pimObjectType;

    private LocalDateTime lastModifiedDate;

    private CustomFields[] custom;

    private Integer pimProductType;

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

    private Integer shippingDimension;

    private Integer shippingSize;

    private Double weight;

    private Integer noviosSKUFlag;

    private String size;

    private String color;

    private String colorSwatch;

    private Integer colorGroup;

    private String internalRevenueTaxCode;

    private Double internalRevenueTaxPercent;

    private Double localInternalRevenueTaxAmount;

    private ProdSkuConfigEntity[] bundleLinks;

    private SkuConfigPropEntity configurableProperties;



}
