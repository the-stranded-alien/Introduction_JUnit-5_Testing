package junit5.testing.intro;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once ...");
    }
    @BeforeEach
    void setUp() {
        System.out.println("In before each ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Test-1"));
    }

    @Test
    void helloWorld12() {
        System.out.println(greeting.helloWorld("Test-2"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each ...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called once ...");
    }
}