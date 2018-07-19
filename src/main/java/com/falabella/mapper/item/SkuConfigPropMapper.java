package com.falabella.mapper.item;

import com.falabella.domain.SkuConfigPropEntity;
import com.falabella.entity.SkuConfigProp;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper(uses = {ProductSkuConfigMapper.class})
public abstract class SkuConfigPropMapper {

    @Mappings({})
    public abstract SkuConfigProp mapSkuConfigPropEntityToSkuConfigProp(
            SkuConfigPropEntity skuConfigPropEntity);

}
