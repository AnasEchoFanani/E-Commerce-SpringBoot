package com.siteWeb.eCommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomProduit;
    private int qnt;
    private Double prix;
    @Column(nullable = true, length = 600)
    private String image_1;
    @Column(nullable = true, length = 600)
    private String image_2;
    @Column(nullable = true, length = 600)
    private String image_3;
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private  Category category;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdAt;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date releaseDate;
}