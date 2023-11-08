package com.stage.youtubestreaminganalytics.Services;

import com.stage.youtubestreaminganalytics.Entity.trendsvideos;
import com.stage.youtubestreaminganalytics.Repositories.TrendsvideosRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TrendsvideosService {
    private TrendsvideosRepo trendsvideosRepo;
    public List<trendsvideos>getAll(){
        return trendsvideosRepo.findAll();
    }
}
