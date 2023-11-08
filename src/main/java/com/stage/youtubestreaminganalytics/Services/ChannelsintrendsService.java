package com.stage.youtubestreaminganalytics.Services;

import com.stage.youtubestreaminganalytics.Entity.Channels;
import com.stage.youtubestreaminganalytics.Repositories.ChannelsintrendsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ChannelsintrendsService {
    private ChannelsintrendsRepo channelsintrendsRepo;
    public List<Channels>getAll(){
        return channelsintrendsRepo.findAll();
    }
    public Channels AddChannel(Channels ch){
        return channelsintrendsRepo.save(ch);
    }
}
