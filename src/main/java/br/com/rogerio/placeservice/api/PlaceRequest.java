package br.com.rogerio.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
 Long id, String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {

}
