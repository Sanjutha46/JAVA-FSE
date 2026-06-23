import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call service method
        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);
    }
}
