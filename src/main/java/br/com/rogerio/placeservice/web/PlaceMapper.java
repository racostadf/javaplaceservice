package br.com.rogerio.placeservice.web;

import br.com.rogerio.placeservice.api.PlaceResponse;
import br.com.rogerio.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.state(), place.slug(), place.createdAt(), place.updatedAt());
    }
}
