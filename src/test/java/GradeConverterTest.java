import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    public GradeConverterTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = this.converter.convert(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = this.converter.convert(90);
        Assert.assertEquals(expected, actual);
    }
}
