package com.product_service.productservice.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private Integer id;
    private Integer quantity;
    private String SkuCode;
    private String productName;
    private String description;
    private String category;
    private Float price;
    private Float discountPrice;
    private Date creationDate;
    private Boolean sellableOnline;
    private String otherColors;
    private String productPicture;

}
