package com.example.springboot.gradle.SpringPlayground1.controllertest;

import com.example.springboot.gradle.SpringPlayground1.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mock;

    @Test
    public void testIndexEndpoint() throws Exception {
        this.mock.perform(get("/").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from Spring!"));
    }

    @Test
    public void testGetPiEndPoint()
    {
        try {
            this.mock.perform((get("/math/pi").accept(MediaType.TEXT_PLAIN)))
                      .andExpect(status().isOk())
                      .andExpect(content().string("3.141592653589793"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
