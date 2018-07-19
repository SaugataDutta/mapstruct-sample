package com.falabella.mapper;

import com.falabella.domain.ItemEntity;
import com.falabella.domain.ProdSkuConfigEntity;
import com.falabella.domain.SkuConfigPropEntity;
import com.falabella.entity.CustomFields;
import com.falabella.entity.ProdSkuConfig;
import com.falabella.entity.Product;
import com.falabella.mapper.item.ItemEntityMapper;
import com.falabella.mapper.item.ProductSkuConfigMapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

public class MapperTest {
    public static void main(String[] args) {
        ProductSkuConfigMapper mapper = Mappers.getMapper(ProductSkuConfigMapper.class);

        ProdSkuConfigEntity prodSkuConfigEntity = new ProdSkuConfigEntity();
        CustomFields customFields = new CustomFields();
        customFields.setLabel("label");
        customFields.setName("name");
        customFields.setType("type");
        customFields.setValue("value");

        CustomFields customFields1 = new CustomFields();
        customFields1.setLabel("label-1");
        customFields1.setName("name-1");
        customFields1.setType("type-1");
        customFields1.setValue("value-1");
        CustomFields[] customFieldsList = new CustomFields[2];
        customFieldsList[0] = customFields;
        customFieldsList[1] = customFields1;

        prodSkuConfigEntity.setCustom(customFieldsList);
        prodSkuConfigEntity.setDescription("description");
        prodSkuConfigEntity.setDisplayName("displayName");
        prodSkuConfigEntity.setId("id");
        prodSkuConfigEntity.setItemId("itemId");
        prodSkuConfigEntity.setItemType(1);
        prodSkuConfigEntity.setLastModifiedDate(LocalDateTime.now());
        prodSkuConfigEntity.setPimApproved(true);
        prodSkuConfigEntity.setQuantity(12L);

        ProdSkuConfig prodSkuConfig = mapper.mapProdSkuConfigEntityToProdSkuConfig
                (prodSkuConfigEntity);


        System.out.println(prodSkuConfig.toString());


        ItemEntity itemEntity = new ItemEntity();
        ProdSkuConfigEntity[] prodSkuConfigEntities = new ProdSkuConfigEntity[1];
        prodSkuConfigEntities[0] = prodSkuConfigEntity;
        SkuConfigPropEntity skuConfigPropEntity = new SkuConfigPropEntity();
        skuConfigPropEntity.setConfigurationOptions(prodSkuConfigEntity);

        itemEntity.setBundleLinks(prodSkuConfigEntities);

        itemEntity.setConfigurableProperties(skuConfigPropEntity);

        ItemEntityMapper itemEntityMapper = Mappers.getMapper(ItemEntityMapper.class);

        Product product = itemEntityMapper.mapItemEntityToProduct(itemEntity);

        System.out.println(itemEntity.toString());
        System.out.println(product.toString());

    }
}
