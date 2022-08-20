package ru.job4j.dream.control;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PostControllerTest {

    @Autowired
    private PostController postController;

    @Test
    public void whenTaskNotView() {
        assertThat(postController).isNotNull();
    }

}