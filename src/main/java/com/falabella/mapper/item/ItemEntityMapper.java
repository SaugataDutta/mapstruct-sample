package com.falabella.mapper.item;

import com.falabella.config.AppConfigs;
import com.falabella.domain.ItemEntity;
import com.falabella.entity.Product;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(uses = {ProductSkuConfigMapper.class, SkuConfigPropMapper
        .class})
public abstract class ItemEntityMapper {

    @Mappings({
            @Mapping(target = "activeStatus", ignore = true),
            @Mapping(target = "applicableAge", ignore = true),
            @Mapping(target = "applicableGender", ignore = true),
            @Mapping(target = "colorGroup", ignore = true),
            @Mapping(target = "noviosSKUFlag", ignore = true),
            @Mapping(target = "pageTemplate", ignore = true),
            @Mapping(target = "pimProductType", ignore = true),
            @Mapping(target = "productType", ignore = true),
            @Mapping(target = "shippingDimension", ignore = true),
            @Mapping(target = "shippingSize", ignore = true),
            @Mapping(target = "variationView", ignore = true)
    })
    public abstract Product mapItemEntityToProduct(ItemEntity item);


    @AfterMapping
    protected void setMapTypes(ItemEntity item, @MappingTarget Product product) {
        product.setActiveStatus(AppConfigs.ACTIVATION_STATUS.get(item.getActiveStatus()));
        product.setApplicableAge(AppConfigs.AGE.get(item.getApplicableAge()));
        product.setApplicableGender(AppConfigs.GENDER.get(item.getApplicableGender()));
        product.setColorGroup(AppConfigs.COLOR_GROUP.get(item.getColorGroup()));
        product.setNoviosSKUFlag(AppConfigs.NOVIOS_SKU_FLAG.get(item.getNoviosSKUFlag()));
        product.setPageTemplate(AppConfigs.PAGE_TEMPLATE.get(item.getPageTemplate()));
        product.setPimProductType(AppConfigs.PIM_PRODUCT_TYPE.get(item.getPimProductType()));
        product.setShippingDimension(AppConfigs.SHIPPING_DIMENSION.get(item
                .getShippingDimension()));
        product.setShippingSize(AppConfigs.SHIPPING_SIZE.get(item.getShippingSize()));
        product.setVariationView(AppConfigs.VARIATION_VIEW.get(item.getVariationView()));
    }


}
