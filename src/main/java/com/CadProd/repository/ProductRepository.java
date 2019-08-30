package com.CadProd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CadProd.models.*;

public interface ProductRepository extends JpaRepository<ProductsModel, Integer> {

}
