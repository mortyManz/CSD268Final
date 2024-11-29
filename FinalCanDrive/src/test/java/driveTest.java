import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class driveTest {

    @Test
    public void testCanDrive_MinInteger() {
        // Test for Integer.MIN_VALUE
        assertEquals(false, drive.canDrive(Integer.MIN_VALUE));
    }

    @Test
    public void testCanDrive_MinIntegerPlusOne() {
        // Test for Integer.MIN_VALUE + 1
        assertEquals(false, drive.canDrive(Integer.MIN_VALUE + 1));
    }

    @Test
    public void testCanDrive_BoundaryMinusOne() {
        // Test for age 15 (boundary condition - 1)
        assertEquals(false, drive.canDrive(15));
    }

    @Test
    public void testCanDrive_ExactBoundary() {
        // Test for age 16 (exact boundary condition)
        assertEquals(true, drive.canDrive(16));
    }

    @Test
    public void testCanDrive_BoundaryPlusOne() {
        // Test for age 17 (boundary condition + 1)
        assertEquals(true, drive.canDrive(17));
    }

    @Test
    public void testCanDrive_MaxIntegerMinusOne() {
        // Test for Integer.MAX_VALUE - 1
        assertEquals(true, drive.canDrive(Integer.MAX_VALUE - 1));
    }

    @Test
    public void testCanDrive_MaxInteger() {
        // Test for Integer.MAX_VALUE
        assertEquals(true, drive.canDrive(Integer.MAX_VALUE));
    }
}
