package com.ysc.product.service;

import com.ysc.product.common.DecreaseStockInput;
import com.ysc.product.common.ProductInfoOutput;
import com.ysc.product.dataobject.ProductInfo;
import com.ysc.product.dto.CartDTO;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

//    List<ProductInfo> findList(List<String> productIdList);
//
//    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
