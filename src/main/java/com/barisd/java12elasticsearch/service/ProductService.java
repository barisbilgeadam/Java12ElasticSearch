package com.barisd.java12elasticsearch.service;

import com.barisd.java12elasticsearch.repository.ProductRepository;
import com.barisd.java12elasticsearch.repository.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ElasticsearchTemplate elasticsearchTemplate;

    public Product save(Product product){
        try {
            return productRepository.save(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void deleteById(String id){
        productRepository.deleteById(id);
    }

    public List<Product> findBySimilarName(String keyword){
        Criteria criteria=new Criteria("ad").fuzzy(keyword);
        CriteriaQuery criteriaQuery = new CriteriaQuery(criteria);
        SearchHits<Product> searchHits = elasticsearchTemplate.search(criteriaQuery, Product.class);

        return searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
    }

}
