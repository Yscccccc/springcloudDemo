package com.ysc.order.client;

import com.ysc.order.dataobject.ProductInfo;
import com.ysc.order.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//
//@FeignClient(name = "product")
//public interface ProductClient {
////
////    @GetMapping("/msg")
////    String productMsg();
////
////    @PostMapping("/product/listForOrder")
////    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);
////
////    @PostMapping("/product/decreaseStock")
////    void decreaseStock(@RequestBody List<CartDTO> cartDTOList);
//}