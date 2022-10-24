package com.nttdata.nttdata.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * clase para recoger archivo yml desde un repositorio GIT
 * @author agometej
 *
 */
@EnableConfigServer
@SpringBootApplication
public class NttdataConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataConfigServerApplication.class, args);
	}

}
