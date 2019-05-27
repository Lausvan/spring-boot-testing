package br.com.michelmilezzi.DemoApp.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class	)
@SpringBootTest
public class FibonacciTests { 
	
// 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584 
	
	@Autowired
	private FibonacciService fibonacciService;
	
	
	@Test
	public void testFibonacci() {
		
		Long fibo = fibonacciService.calculateFibonacci(6);
		
		assertThat(fibo).isEqualTo(8);
	
	}
}
