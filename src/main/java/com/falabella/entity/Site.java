package com.falabella.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.falabella.entity.enums.SiteType;
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
@Table(name = "site")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TypeDef(name = "JsonType", typeClass = JsonType.class)
@TypeDef(name = "StringArray", typeClass = StringArrayType.class)
@TypeDef(name = "site_type", typeClass = PostgreSQLEnumType.class)
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String business;

    private String country;

    private String displayName;

    private String metaTitle;

    private String metaDescription;

    private String metaKeywords;

    private String catalogId;

    @Enumerated(EnumType.STRING)
    @Type(type = "site_type")
    private SiteType type;

    private String salesChannel;

    private Boolean companyPayShippingCost;

    private Boolean userShipAddrModifiable;

    private String passwordLevel;

    private String dataSourceType;

    private Double conversionRate;

    private String ocStatus;

    private Boolean sendMarketEmail;

    private String currency;

    private String description;

    private Boolean status;

    private String invoiceType;

    private String cardPinSupport;

    private String email2;

    private Integer deadlinePayment;

    private String meansOfPayment;

    private String redirectionUrl;

    private Integer lengthOfBin;

    private Integer shippingProcessingDelayDays;

    private Boolean useProfileAddress;

    private Boolean loyaltyShippingAsNormalSite;

    @Type(type = "StringArray")
    private String[] nonAvailableShippingOptions;

    private String bins;

    private String pimObjectType;

    private Boolean pimApproved;

    private LocalDateTime lastModifiedDate;

    @Type(type = "JsonType")
    private CustomFields[] custom;

}
