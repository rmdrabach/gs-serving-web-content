package hello;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FizzBuzzControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void fizzBuzzWithoutParams() throws Exception {
        mockMvc.perform(get("/fizzbuzz"))
                .andExpect(content().string(containsString("Inform a number to calculate like <a href=\"/fizzbuzz?n=3\">/fizzbuzz?n=3")));
    }
	
	@Test
    public void fizzBuzzWithParam0() throws Exception {
        mockMvc.perform(get("/fizzbuzz?n=0"))
                .andExpect(content().string(containsString("FizzBuzz to number 0: Number should be greater than zero.")));
    }
	
	@Test
    public void fizzBuzzWithParam4() throws Exception {
        mockMvc.perform(get("/fizzbuzz?n=4"))
                .andExpect(content().string(containsString("FizzBuzz to number 4: 4")));
    }
	
	@Test
    public void fizzBuzzWithParam5() throws Exception {
        mockMvc.perform(get("/fizzbuzz?n=5"))
                .andExpect(content().string(containsString("FizzBuzz to number 5: Buzz")));
    }
	
	@Test
    public void fizzBuzzWithParam6() throws Exception {
        mockMvc.perform(get("/fizzbuzz?n=6"))
                .andExpect(content().string(containsString("FizzBuzz to number 6: Fizz")));
    }
	
	@Test
    public void fizzBuzzWithParam15() throws Exception {
        mockMvc.perform(get("/fizzbuzz?n=15"))
                .andExpect(content().string(containsString("FizzBuzz to number 15: FizzBuzz")));
    }
}
