package com.productservice.dto.Product;

import java.util.Date;

public class ProductResponse {

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
