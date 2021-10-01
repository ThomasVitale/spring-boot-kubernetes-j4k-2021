package com.thomasvitale.demonative;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoNativeApplicationTests {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void getConfiguredMessage() {
        webTestClient
                .get()
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Spring Native to the cloud!");
    }

}
