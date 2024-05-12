package com.scaler.productserviceapi.repos;

import com.scaler.productserviceapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
