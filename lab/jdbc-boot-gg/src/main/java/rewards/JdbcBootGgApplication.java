package rewards;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcBootGgApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcBootGgApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(JdbcTemplate jdbcTemplate){

		String QUERY = "SELECT count(*) FROM T_ACCOUNT";

		// Use Lambda expression to display the result
		return args -> System.out.println("Hello GG great, there are "
				+ jdbcTemplate.queryForObject(QUERY, Long.class)
				+ " accounts");
	}

}
