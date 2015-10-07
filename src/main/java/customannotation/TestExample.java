package customannotation;

/**
 * @author ajay
 */
@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        tags = {"shubham","aman"},
        createdBy = "ajay"
)
public class TestExample {

    @Test
    void TestA() {
        if (true) throw new RuntimeException("Annotation is true");
    }

    @Test(enabled = false)
    void TestB() {
        if (false) throw new RuntimeException("Annotation is false");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            System.out.println("=====aa gya bhai ======");
        }
    }
}
