package com.falabella.mapper.item;

import com.falabella.config.AppConfigs;
import com.falabella.domain.ProdSkuConfigEntity;
import com.falabella.entity.ProdSkuConfig;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper
public abstract class ProductSkuConfigMapper {

    @Mappings({
            @Mapping(target = "itemType", ignore = true)
    })
    public abstract ProdSkuConfig mapProdSkuConfigEntityToProdSkuConfig(
            ProdSkuConfigEntity prodSkuConfigEntity);


    @AfterMapping
    public void setItemType(
            ProdSkuConfigEntity prodSkuConfigEntity,
            @MappingTarget ProdSkuConfig prodSkuConfig) {
        prodSkuConfig.setItemType(AppConfigs.ITEM_TYPE.get(prodSkuConfigEntity.getItemType()));
    }

}
