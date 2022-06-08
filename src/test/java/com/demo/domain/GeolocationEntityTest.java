package com.demo.domain;

import com.demo.GeoApi;
import com.google.protobuf.Empty;
import kalix.javasdk.testkit.ValueEntityResult;
import kalix.javasdk.valueentity.ValueEntity;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GeolocationEntityTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    GeolocationEntityTestKit service = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // // use the testkit to execute a command
    // // of events emitted, or a final updated state:
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ValueEntityResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
    // // verify the final state after the command
    // assertEquals(expectedState, service.getState());
  }

  @Test
  @Ignore("to be implemented")
  public void addItemTest() {
    GeolocationEntityTestKit service = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // AddGeolocationItem command = AddGeolocationItem.newBuilder()...build();
    // ValueEntityResult<Empty> result = service.addItem(command);
  }


  @Test
  @Ignore("to be implemented")
  public void getAllTest() {
    GeolocationEntityTestKit service = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // GetGeolocations command = GetGeolocations.newBuilder()...build();
    // ValueEntityResult<Geolocations> result = service.getAll(command);
  }

}
