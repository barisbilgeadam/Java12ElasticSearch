package com.barisd.java12elasticsearch.repository;

import com.barisd.java12elasticsearch.repository.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,String> {
}
