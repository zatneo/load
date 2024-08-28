package com.testing.load;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoadApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(true,true);
	}

}
