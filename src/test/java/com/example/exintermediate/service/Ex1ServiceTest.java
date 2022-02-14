package com.example.exintermediate.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.example.exintermediate.domain.BaseballTeam;
import com.example.exintermediate.repository.Ex1Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class Ex1ServiceTest {
	@Autowired
	private Ex1Service service;

	@MockBean
	private Ex1Repository repository;

	@BeforeEach
	public void initMocks() {
		// @Beforeが付与されているメソッドのなかにinitMocksメソッドを書くことで、各テストメソッドを実行する前に毎回実行できる
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testShowDetail() {
		BaseballTeam baseballTeam =
				new BaseballTeam(1, "testLeague", "testTeam", "本拠地1", "1111年11月11日", "testHistory");
		when(repository.load(1)).thenReturn(baseballTeam);
		BaseballTeam result = service.showDetail(1);
		assertSame(result, baseballTeam);
		verify(repository, times(1)).load(1);
	}

	@Test
	void testShowList() {

	}
}
