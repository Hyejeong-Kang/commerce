package com.study.commerce.product.domain

import javax.persistence.*

@Entity
class productList(
    @Id @GeneratedValue
    var productId: Int? = null,
    var category: String,
    var subCategory: String,
    var productName: String,
    var price: String
)
