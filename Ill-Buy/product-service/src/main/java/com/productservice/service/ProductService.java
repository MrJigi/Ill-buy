package com.productservice.service;

import com.productservice.dto.Product.ProductRequest;
import com.productservice.model.Product;
import com.productservice.repository.IProductRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.text.Format;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
//@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final IProductRepo IProductRepository;
    @Autowired
    public ProductService(IProductRepo iProductRepo) { this.IProductRepository = iProductRepo;}
    public List<Product> getAllProducts() {
        return IProductRepository.findAll();
    }

    public Product addTestProducts() {
        Product product = new Product(
                146,
                5,
                "SKU",
                "ipone",
                "It goes brrr",
                "Electronics",
                159.65f,
                70.01f,
                Date.from(Instant.now()),
                true,
                "Yes",
                ""
                );
        return IProductRepository.save(product);
    }
    public void createProduct(ProductRequest productRequest){
        Product newProduct = Product.builder()
                .id(1)
                .quantity(productRequest.getQuantity())
                .skuCode(productRequest.getSkuCode())
                .productName(productRequest.getProductName())
                .description(productRequest.getDescription())
                .category(productRequest.getCategory())
                .price(productRequest.getPrice())
                .discountPrice(productRequest.getDiscountPrice())
                .creationDate(productRequest.getCreationDate())
                .sellableOnline(productRequest.getSellableOnline())
                .otherColors(productRequest.getOtherColors())
                .productPicture(productRequest.getProductPicture())
                .build();

        IProductRepository.save(newProduct);
        log.info("Product"+ productRequest.getProductName() + "has been saved");
    }
    public Product getProductById(UUID id) {
        return IProductRepository.findById(id).orElse(null);
    }

}
