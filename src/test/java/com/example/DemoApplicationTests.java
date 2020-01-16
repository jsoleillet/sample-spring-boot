package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

        @Ignore("This test is ignored")
        @Test
        public void testIgnore() {
        }

        @Test
        public void shouldPass() {
          assertTrue(true);
        }

        @Test
        public void alwaysFail() {
          assertTrue(false);
        }

}
