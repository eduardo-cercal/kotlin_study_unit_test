import org.junit.jupiter.api.*

class MainTest  {
    @Test
    fun testCountXO(){
        Assertions.assertTrue(countXO("xxoo"))

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxxo"))},
            {Assertions.assertTrue(countXO("xxOo"))},

        )
    }

    @Test
    @Disabled
    fun notImplemented(){}

    @Test
    fun willFail(){
        fail("This will fail")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))

        assertThrows<Exception> { exception() }
    }
}