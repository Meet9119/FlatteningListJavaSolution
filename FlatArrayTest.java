
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class FlatArrayTest {

    Integer[] expectedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void testNullReturnsNull() throws IllegalArgumentException {
        Assert.assertNull(
                "Testing a null argument",
                FlatArray.flat(null)
        );
    }

    @Test
    public void testEmptyArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Testing an empty array",
                new Integer[]{},
                FlatArray.flat(new Object[]{})
        );
    }

    @Test
    public void testFlatArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Testing a flat array",
                expectedArray,
                FlatArray.flat(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
        );
    }

    @Test
    public void testNestedArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Testing nested array",
                expectedArray,
                FlatArray.flat(new Object[]{1, 2, 3, 4, new Object[]{5, 6, 7, 8}, 9, 10})
        );
    }

    @Test
    public void testMultipleNestedArrays() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Testing multiple nested arrays",
                expectedArray,
                FlatArray.flat(new Object[]{1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10})
        );
    }
}