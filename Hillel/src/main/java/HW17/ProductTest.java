package HW17;

import org.testng.Assert;
import org.testng.annotations.*;

public class ProductTest {

    private HW17.Product laptop;
    private HW17.Product smartphone;
    private HW17.Product Product;
    @BeforeMethod
    public void setUp() {
        laptop = new HW17.Product("Laptop", 1000, 5);
        smartphone = new HW17.Product("Smartphone", 500, 10);
    }

    @Test
    public void testGetTotalQuantity() {
        int expectedTotalQuantity = 15; // 5 (laptop) + 10 (smartphone)
        int actualTotalQuantity = Product.getTotalQuantity();
        Assert.assertEquals(actualTotalQuantity, expectedTotalQuantity);
    }

    @Test
    public void testProductName() {
        String expectedName = "Laptop";
        String actualName = laptop.getName();
        Assert.assertEquals(actualName, expectedName);
    }

    // Додайте інші тести за необхідністю

    @AfterMethod
    public void tearDown() {
        // Звільнення ресурсів, якщо потрібно
    }
}
