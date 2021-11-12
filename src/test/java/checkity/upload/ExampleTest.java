package checkity.upload;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExampleTest {
    private final Example example = new Example();

    @Test
    public void even() {
        assertThat(example.isEven(0), is(true));
        assertThat(example.isEven(2), is(true));
        assertThat(example.isEven(4), is(true));
    }

    @Test
    public void odd() {
        assertThat(example.isEven(1), is(false));
        assertThat(example.isEven(3), is(false));
        assertThat(example.isEven(5), is(false));
    }

}
