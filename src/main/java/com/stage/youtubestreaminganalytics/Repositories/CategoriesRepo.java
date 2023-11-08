package com.stage.youtubestreaminganalytics.Repositories;

import com.stage.youtubestreaminganalytics.Entity.CategorieKey;
import com.stage.youtubestreaminganalytics.Entity.Categories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepo extends JpaRepository<Categories, CategorieKey> {
}
