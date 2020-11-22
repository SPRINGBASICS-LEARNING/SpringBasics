package com.learning.spring.basics.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CdiBusinessTest {

    @InjectMocks
    CdiBusiness cdiBusiness;

    @Mock
    CdiDao cdiDaoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(cdiDaoMock.getData()).thenReturn(new int[]{2,4});
      int actualResult = cdiBusiness.findGreatest();
      assertEquals(4, actualResult);
    }

    @Test
    public void testBasicScenario_NoElements() {
        Mockito.when(cdiDaoMock.getData()).thenReturn(new int[]{});
        int actualResult = cdiBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(cdiDaoMock.getData()).thenReturn(new int[]{2,2});
        int actualResult = cdiBusiness.findGreatest();
        assertEquals(2, actualResult);
    }
}
