package com.stackroute.trackservice;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExistsException //throws TrackAlreadyExistsException
            ;

    public Track getTrackById(int trackId) throws TrackNotFoundException //throws TrackNotFoundException
            ;

    public List<Track> getAllTracks() //throws TrackNotFoundException
    ;

    public Track updateTrack(int trackId, String comment) throws TrackNotFoundException //throws TrackNotFoundException
    ;

    public Track deleteTrack(int trackId) throws TrackNotFoundException //throws TrackNotFoundException
            ;

    public List<Track> getTrackByName(String trackName) //throws TrackNotFoundException
            ;

}
