package br.com.rogerio.placeservice.domain;

import br.com.rogerio.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

//Entendendo como o services e os mapper funcionam
public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placerequest) {
        var place = new Place(null, placerequest.name(),
                placerequest.slug(), placerequest.state(),
                placerequest.createdAt(), placerequest.updatedAt());
        return placeRepository.save(place);
    }

}
