package com.demo.domain;

import com.akkaserverless.javasdk.testkit.ValueEntityResult;
import com.akkaserverless.javasdk.valueentity.ValueEntity;
import com.demo.GeoApi;
import com.google.protobuf.Empty;
import org.junit.Test;

import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GeolocationEntityTest {

  @Test
  public void exampleTest() {
    //GeolocationEntityTestKit testKit = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // use the testkit to execute a command
    // of events emitted, or a final updated state:
    // ValueEntityResult<SomeResponse> result = testKit.someOperation(SomeRequest);
    // verify the response
    // SomeResponse actualResponse = result.getReply();
    // assertEquals(expectedResponse, actualResponse);
    // verify the final state after the command
    // assertEquals(expectedState, testKit.getState());
  }

  @Test
  public void addItemTest() {
    //GeolocationEntityTestKit testKit = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // ValueEntityResult<Empty> result = testKit.addItem(AddGeolocationItem.newBuilder()...build());
  }


  @Test
  public void getAllTest() {
    //GeolocationEntityTestKit testKit = GeolocationEntityTestKit.of(GeolocationEntity::new);
    // ValueEntityResult<Geolocations> result = testKit.getAll(GetGeolocations.newBuilder()...build());
  }

}
