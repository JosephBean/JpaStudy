package com.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.domain.TestEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@SpringBootApplication
public class JpaStudyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaStudyApplication.class, args);
	}

	private final EntityManagerFactory emf;
	
	@Override
	public void run(String... args) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			// JPA를 처리하는 코드를 작성하는 영역
			// 입력
//			TestEntity t = new TestEntity();
//			t.setTxt("8교시");
//			em.persist(t);
			
			// 가져오기
//			TestEntity t = em.find(TestEntity.class, 1);
//			log.info("Find : {}", t);
			
			// 수정
//			t.setTxt2("값 추가");
			
			// 삭제
//			em.remove(t);
			
			et.commit();
		} catch (Exception e) {
			et.rollback();
		} finally {
			em.close();
		}
		
	}
}
