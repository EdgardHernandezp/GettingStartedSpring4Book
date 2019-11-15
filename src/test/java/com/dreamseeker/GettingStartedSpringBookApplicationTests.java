package com.dreamseeker;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamseeker.beans.CompactDisc;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
class GettingStartedSpringBookApplicationTests {

	@Autowired
	private CompactDisc cd;
	
	@Test
	void cdShouldNotBeNull() {
		assertNotNull(cd);
		cd.play();
	}

}
