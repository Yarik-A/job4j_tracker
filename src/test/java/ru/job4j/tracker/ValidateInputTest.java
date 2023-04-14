package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1", "2", "3", "-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int[] selected = {
                input.askInt("Enter menu:"),
                input.askInt("Enter menu:"),
                input.askInt("Enter menu:"),
                input.askInt("Enter menu:")
        };
        assertThat(selected).isEqualTo(new int[] {1, 2, 3, -1});
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("Please enter valid data" + ln);
    }
}