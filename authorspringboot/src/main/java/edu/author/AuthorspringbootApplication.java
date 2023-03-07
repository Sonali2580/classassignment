package edu.author;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.author.entity.Author;

@SpringBootApplication
public class AuthorspringbootApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(AuthorspringbootApplication.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(AuthorspringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**********************CALLING RUN**************************");
		Author a = new Author();
		a.setId(12);
		a.setFirstName("amitava");
		a.setLastName("Chatterjee");
		System.out.println(a.getId() + " I am " + a.getFirstName() + " " + a.getLastName());

	}

	// The PostConstruct annotation is used on a method thatneeds to be executed
	// after dependency injection is done to performany initialization. This method
	// must be invoked before the classis put into service. This annotation must be
	// supported on all classesthat support dependency injection.
	@PostConstruct
	public void talkToH2() {
		System.out.println("---------ALL JDBC CODE RUNNING-----------------");
		logger.info("---------ALL JDBC CODE RUNNING-----------------" + new java.util.Date());
		Author a02 = new Author();
		a02.setId(100);
		a02.setFirstName("Gunjan");
		a02.setLastName("Nayyar");
		Author a03 = new Author();
		a03.setId(200);
		a03.setFirstName("Monalisa");
		a03.setLastName("Chakraborty");
		Author a01 = new Author();
		a01.setId(1);
		a01.setFirstName("VibhorSir");
		a01.setLastName("Goyel");

		List<Author> authors = new ArrayList<>();
		authors.add(a01);
		authors.add(a02);
		authors.add(a03);
		System.out.println("-----------ALL authors added Now we should store them in DB-------------");
		logger.info(
				"---------ALL authors added Now we should store them in DB-----------------" + new java.util.Date());

		jdbcTemplate.execute("DROP TABLE AUTHOR IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE AUTHOR(" + " ID INTEGER,FIRST_NAME VARCHAR(20),LAST_NAME VARCHAR(30))");
		System.out.println("The table is ready......");
		authors.forEach(x -> jdbcTemplate.update("INSERT INTO AUTHOR VALUES(?,?,?)", x.getId(), x.getFirstName(),
				x.getLastName()));
		System.out.println("---------all saved---------------");
		logger.info("---------all saved------------------" + new java.util.Date());
		System.out.println("----------------fetching all.................");
		authors = jdbcTemplate.query("select * from author",
				(rs, rowNum) -> new Author(rs.getInt("id"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME")));
		authors.forEach(d -> System.out.println(d.getId() + " " + d.getFirstName() + " " + d.getLastName()));
		logger.info("---------all are fetched in the time------------------" + new java.util.Date());

	}

}
