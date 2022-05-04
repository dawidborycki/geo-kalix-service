package com.demo.domain;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.akkaserverless.javasdk.valueentity.ValueEntityContext;
import com.demo.GeoApi;
import com.google.protobuf.Empty;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
// This is the implementation for the Value Entity Service described in your com/demo/geo_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GeolocationEntity extends AbstractGeolocationEntity {
  @SuppressWarnings("unused")
  private final String entityId;

  public GeolocationEntity(ValueEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public GeolocationDomain.GeolocationState emptyState() {
    return GeolocationDomain.GeolocationState.getDefaultInstance();
  }

  @Override
  public Effect<Empty> addItem(GeolocationDomain.GeolocationState currentState, GeoApi.AddGeolocationItem addGeolocationItem) {
    Map<Integer, GeoApi.Geolocation> state = domainStateToMap(currentState);

    GeoApi.Geolocation newItem = domainItemToApi(addGeolocationItem);

    state.put(addGeolocationItem.getUserId(), newItem);

    return effects().reply(Empty.getDefaultInstance());
  }

  @Override
  public Effect<GeoApi.Geolocations> getAll(GeolocationDomain.GeolocationState currentState, GeoApi.GetGeolocations getGeolocations) {
    List<GeoApi.Geolocation> items = currentState.getItemsList().stream()
                  .map(this::convert)                  
                  .collect(Collectors.toList());
    
    GeoApi.Geolocations geolocations =
      GeoApi.Geolocations.newBuilder().addAllItems(items).build();

    return effects().reply(geolocations);
  }

  private GeoApi.Geolocation convert(GeolocationDomain.Geolocation item) {
    return GeoApi.Geolocation.newBuilder()
            .setLat(item.getLat())
            .setLong(item.getLong())
            .build();
  }

  private GeoApi.Geolocation domainItemToApi(GeoApi.AddGeolocationItem item) {
    return GeoApi.Geolocation.newBuilder()
            .setLat(item.getLat())
            .setLong(item.getLong())
            .build();
  }

  private Map<Integer, GeoApi.Geolocation> domainStateToMap(GeolocationDomain.GeolocationState state) {
    return state.getItemsList().stream().collect(Collectors.toMap(GeolocationDomain.Geolocation::getUserId, this::apiItemToDomain));
  }
 
  private GeoApi.Geolocation apiItemToDomain(GeolocationDomain.Geolocation item) {
    return GeoApi.Geolocation.newBuilder()    
      .setLat(item.getLat())
      .setLong(item.getLong())
      .build();
  } 
}