package com.stage.youtubestreaminganalytics.Services;

import com.stage.youtubestreaminganalytics.Entity.Categories;
import com.stage.youtubestreaminganalytics.Entity.Channels;
import com.stage.youtubestreaminganalytics.Repositories.CategoriesRepo;
import com.stage.youtubestreaminganalytics.Repositories.ChannelsintrendsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoriesService {
    private CategoriesRepo categoriesRepo;
    public List<Categories> getAll(){
        return categoriesRepo.findAll();
    }
    public List<Categories> getToday(){
        return categoriesRepo.findAll().stream().filter(x->x.getId().getDate().isEqual(LocalDate.now())).collect(Collectors.toList());
    }
}
