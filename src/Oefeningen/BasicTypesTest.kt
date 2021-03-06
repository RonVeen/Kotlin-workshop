

import org.junit.Test
import kotlin.test.assertEquals

class BasicTypesTest {


    @Test
    fun valOrVar(){

        var iCanChange = 42

        val iCannotChange = "42"

        //add something here to make it pass

        assertEquals(iCanChange, iCannotChange)

    }


    @Test
    fun multilineString(){

        //change string to pass the test
        val multiline = """
            line 1
            line 3
        """.trimIndent()

        assertEquals(multiline.lines().size, 3)

    }



    @Test
    fun templateString(){

        //change string to pass the test
        val mid = "123"
        val letters = "a $mid d".trimIndent()

        assertEquals(letters, "a b c d")
    }


    @Test
    fun rangeChar(){

        val str = "hello123"
        var strip = ""
        for (c in str) {
            //fix the range to pass the test
            strip += if (c in 'a'..'a') c else '_'
        }

        assertEquals(strip,"hello___")

    }


    @Test
    fun joinString(){

        val names = listOf("John", "Horton", "Conway")
        val fullName: String =  TODO()  //  Join the strings here

        assertEquals(fullName,"[John Horton Conway]")

    }


}