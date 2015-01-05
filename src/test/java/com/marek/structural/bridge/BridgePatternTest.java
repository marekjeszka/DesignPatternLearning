package com.marek.structural.bridge;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BridgePatternTest {
    @Mock BigEngine bigEngine;
    @Mock SmallEngine smallEngine;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        when(smallEngine.go()).thenReturn(100);
        when(bigEngine.go()).thenReturn(350);
    }

    @Test
    public void testBridgePattern() {
        Vehicle vehicle = new BigBus(smallEngine);
        vehicle.drive();

        vehicle.setEngine(bigEngine);
        vehicle.drive();

        verify(smallEngine).go();
        verify(bigEngine).go();
    }
}
