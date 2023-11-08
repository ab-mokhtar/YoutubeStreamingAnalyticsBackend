package com.stage.youtubestreaminganalytics.Repositories;

import com.stage.youtubestreaminganalytics.Entity.ChannelsInTrendsKey;
import com.stage.youtubestreaminganalytics.Entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsintrendsRepo extends JpaRepository<Channels, ChannelsInTrendsKey> {
}
