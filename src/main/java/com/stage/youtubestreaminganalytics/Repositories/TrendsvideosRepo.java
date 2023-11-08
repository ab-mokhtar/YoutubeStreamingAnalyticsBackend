package com.stage.youtubestreaminganalytics.Repositories;

import com.stage.youtubestreaminganalytics.Entity.ChannelsInTrendsKey;
import com.stage.youtubestreaminganalytics.Entity.trendsvideos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendsvideosRepo extends JpaRepository<trendsvideos, ChannelsInTrendsKey> {
}
