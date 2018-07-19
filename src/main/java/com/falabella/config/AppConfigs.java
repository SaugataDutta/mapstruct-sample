package com.falabella.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppConfigs {

    public static final Map<Integer, String> ACTIVATION_STATUS;
    public static final Map<Integer, String> AGE;
    public static final Map<Integer, String> COLOR_GROUP;
    public static final Map<Integer, String> SHIPPING_DIMENSION;
    public static final Map<Integer, String> GENDER;
    public static final Map<Integer, String> NOVIOS_SKU_FLAG;
    public static final Map<Integer, String> PROD_TYPE;
    public static final Map<Integer, String> VARIATION_VIEW;
    public static final Map<Integer, String> SHIPPING_SIZE;
    public static final Map<Integer, String> ITEM_TYPE;
    public static final Map<Integer, String> CATEGORY_TYPE;
    public static final List<Integer> GRID_DISPLAY_RAW;
    public static final Map<Integer, String> GRID_DISPLAY_FORMAT;
    public static final Map<Integer, String> TEMPLATE;
    public static final Map<Integer, String> PAGE_TEMPLATE;
    public static final Map<Integer, String> PIM_PRODUCT_TYPE;
    public static final Map<Integer, String> SALES_CHANNEL;
    public static final Map<Integer, String> PASSWORD_LEVEL;
    public static final Map<Integer, String> DATA_SOURCE_TYPE;
    public static final Map<Integer, String> OC_STATUS;
    public static final Map<Integer, String> INVOICE_TYPE;
    public static final Map<Integer, String> CARD_PIN_SUPPORT;

    static {

        Map<Integer, String> activeStatusTempMap = new HashMap<>();
        activeStatusTempMap.put(0, "ACTIVO");
        activeStatusTempMap.put(1, "INACTIVO");
        activeStatusTempMap.put(2, "ELIMINADO");
        activeStatusTempMap.put(3, "DESCONTINUADO DE COMPRAS AUT.");
        activeStatusTempMap.put(4, "OBSOLETO");
        activeStatusTempMap.put(5, "COMPRA UNICA");
        ACTIVATION_STATUS = Collections.unmodifiableMap(activeStatusTempMap);

        Map<Integer, String> ageTempMap = new HashMap<>();
        ageTempMap.put(0, "Unlimited");
        ageTempMap.put(1, "0-6 Months");
        ageTempMap.put(2, "6-12 Months");
        ageTempMap.put(3, "One Year Old");
        AGE = Collections.unmodifiableMap(ageTempMap);
        
        Map<Integer, String> invoiceTempMap = new HashMap<>();
        invoiceTempMap.put(1, "FACTURA_A");
        invoiceTempMap.put(4, "FACTURA_B_EXEMPTED");
        invoiceTempMap.put(6, "FACTURA_B_SIMPLIFIED");
        INVOICE_TYPE = Collections.unmodifiableMap(invoiceTempMap);
        
        Map<Integer, String> cardPinTempMap = new HashMap<>();
        cardPinTempMap.put(0, "Lufthansa");
        cardPinTempMap.put(1, "normal");
        CARD_PIN_SUPPORT = Collections.unmodifiableMap(cardPinTempMap);
        
        
        Map<Integer, String> pageTemplateTempMap = new HashMap<>();
        pageTemplateTempMap.put(0, "normal");
        PAGE_TEMPLATE = Collections.unmodifiableMap(pageTemplateTempMap);


        Map<Integer, String> colorGroupTempMap = new HashMap<>();
        colorGroupTempMap.put(0, "White");
        colorGroupTempMap.put(1, "Black");
        colorGroupTempMap.put(2, "Blue");
        colorGroupTempMap.put(3, "Green");
        colorGroupTempMap.put(4, "Yellow");
        colorGroupTempMap.put(5, "Red");
        colorGroupTempMap.put(6, "Brown");
        colorGroupTempMap.put(7, "Light Blue");
        colorGroupTempMap.put(8, "Pink");
        colorGroupTempMap.put(9, "Purple");
        colorGroupTempMap.put(10, "Orange");
        colorGroupTempMap.put(11, "Gray");
        colorGroupTempMap.put(12, "Beige");
        colorGroupTempMap.put(13, "Cream");
        colorGroupTempMap.put(14, "Fucsia");
        colorGroupTempMap.put(15, "Burgundy");
        COLOR_GROUP = Collections.unmodifiableMap(colorGroupTempMap);

        Map<Integer, String> shippingDimTempMap = new HashMap<>();
        shippingDimTempMap.put(0, "weight");
        shippingDimTempMap.put(1, "shippingSize");
        SHIPPING_DIMENSION = Collections.unmodifiableMap(shippingDimTempMap);

        Map<Integer, String> genderTempMap = new HashMap<>();
        genderTempMap.put(0, "Unlimited");
        genderTempMap.put(1, "Male");
        genderTempMap.put(2, "Female");
        GENDER = Collections.unmodifiableMap(genderTempMap);
        
        Map<Integer, String> salesChannelTempMap = new HashMap<>();
        salesChannelTempMap.put(0, "internet");
        salesChannelTempMap.put(1, "telephone");
        salesChannelTempMap.put(2, "internet/telephone");
        SALES_CHANNEL = Collections.unmodifiableMap(salesChannelTempMap);

        Map<Integer, String> novSkuTempMap = new HashMap<>();
        novSkuTempMap.put(0, "noviosOnly");
        novSkuTempMap.put(1, "bothNoviosAndRegular");
        novSkuTempMap.put(2, "regularOnly");
        novSkuTempMap.put(3, "exception_abnormal");
        NOVIOS_SKU_FLAG = Collections.unmodifiableMap(novSkuTempMap);

        Map<Integer, String> prodTypeTempMap = new HashMap<>();
        prodTypeTempMap.put(0, "Regular");
        prodTypeTempMap.put(1, "Service");
        prodTypeTempMap.put(2, "Manual");
        prodTypeTempMap.put(3, "Warranty");
        prodTypeTempMap.put(4, "Gift Card");
        PROD_TYPE = Collections.unmodifiableMap(prodTypeTempMap);

        Map<Integer, String> varViewTempMap = new HashMap<>();
        varViewTempMap.put(0, "normalView");
        varViewTempMap.put(1, "enhancedView");
        VARIATION_VIEW = Collections.unmodifiableMap(varViewTempMap);
        
        Map<Integer, String> passLevelTempMap = new HashMap<>();
        passLevelTempMap.put(0, "systemLevel");
        passLevelTempMap.put(1, "clientLevel");
        PASSWORD_LEVEL = Collections.unmodifiableMap(passLevelTempMap);
        
        Map<Integer, String> dsTempMap = new HashMap<>();
        dsTempMap.put(0, "ctc");
        dsTempMap.put(1, "clientLevel");
        DATA_SOURCE_TYPE = Collections.unmodifiableMap(dsTempMap);
        
        Map<Integer, String> ocTempMap = new HashMap<>();
        ocTempMap.put(0, "C");
        ocTempMap.put(1, "AC");
        OC_STATUS = Collections.unmodifiableMap(ocTempMap);

        Map<Integer, String> shippingSizeTempMap = new HashMap<>();
        shippingSizeTempMap.put(1, "SMALL");
        shippingSizeTempMap.put(2, "MEDIUM");
        shippingSizeTempMap.put(3, "LARGE");
        shippingSizeTempMap.put(4, "EXTRA_LARGE");
        SHIPPING_SIZE = Collections.unmodifiableMap(shippingSizeTempMap);

        Map<Integer, String> itemTypeTempMap = new HashMap<>();
        itemTypeTempMap.put(0, "sku");
        itemTypeTempMap.put(1, "product");
        ITEM_TYPE = Collections.unmodifiableMap(itemTypeTempMap);
        
        Map<Integer, String> typeTempMap = new HashMap<>();
        typeTempMap.put(0, "normal");
        typeTempMap.put(1, "static content");
        CATEGORY_TYPE = Collections.unmodifiableMap(typeTempMap);
        
        Integer[] tempArr = {4, 10, 20, 25, 30, 50};
        GRID_DISPLAY_RAW = Collections.unmodifiableList(Arrays.asList(tempArr));
        
        Map<Integer, String> gridDispTempMap = new HashMap<>();
        gridDispTempMap.put(0, "5x4");
        gridDispTempMap.put(1, "4x4");
        gridDispTempMap.put(2, "3x4");
        gridDispTempMap.put(3, "2x4");
        GRID_DISPLAY_FORMAT = Collections.unmodifiableMap(gridDispTempMap);
        
        Map<Integer, String> templateTempMap = new HashMap<>();
        templateTempMap.put(0, "landing");
        templateTempMap.put(1, "normalPLP");
        templateTempMap.put(2, "connectPLP");
        TEMPLATE = Collections.unmodifiableMap(templateTempMap);
        
        Map<Integer, String> pimProdTempMap = new HashMap<>();
        pimProdTempMap.put(0, "itemWithVariation");
        pimProdTempMap.put(1, "itemWithoutVariation");
        pimProdTempMap.put(2, "warrant");
        pimProdTempMap.put(3, "service");
        PIM_PRODUCT_TYPE = Collections.unmodifiableMap(pimProdTempMap);
         
    }

}
