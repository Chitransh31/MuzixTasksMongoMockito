package com.stackroute.repository;

import com.stackroute.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, Integer> {

    //@Query(value = "from Track where trackName=?1")
    @Query("{ 'trackName' : ?0}")
    public List<Track> findByName(String trackName);

}
