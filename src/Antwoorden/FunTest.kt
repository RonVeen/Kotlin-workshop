import org.junit.Test
import kotlin.test.assert
import kotlin.test.assertEquals

class FunTest {

    @Test
    fun defineAFunctionWithoutAClass(){

        //replace TODO with a value to make the test pass
        fun myfun(): String { return "Kotlin is Fun"}

        assertEquals(myfun(), "Kotlin is Fun")
    }

    @Test
    fun singleStatementFunctionsDontNeedReturn(){

        //replace TODO with a value to make the test pass
        fun myfun(): String = "Kotlin is Fun"

        assertEquals(myfun(),"Kotlin is Fun")
    }

    @Test
    fun nestedFun(){

        //replace TODO with a value to make the test pass
        fun myFun(): String {
            fun myNestedFun(): String {
                return "Kotlin Fun can be nested!"
            }
            return myNestedFun()
        }

        assertEquals(myFun(),"Kotlin Fun can be nested!")
    }


    @Test
    fun singleStatementFunDeclaration(){

        //replace TODO with a value to make the test pass
        fun double(x: Int): Int = x * 2

        assertEquals(double(5),10)

    }



    @Test
    fun defaultParameter(){

        // fix it to make test pass
        fun answer(x: Int = 37) = x.toString()

        assertEquals(answer(12),"12")
        assertEquals(answer(), "37")

    }



    @Test
    fun namedParameters(){

        //replace TODO with a value to make the test pass
        fun calc(x: Int, y: Int, z: Int = 0): Int = x * y + z

        assertEquals(calc(6,5), 30)
        assertEquals(calc(5, 4, z=3), 23)

    }



    @Test
    fun spreadAndVarArgs(){

        fun myConcat(vararg xs: String): String{

            return xs.joinToString()

        }

        val nums = arrayOf("1","2","3")

        val result = myConcat(*nums)

        val result2 = myConcat("1","2","3") //choose correct arguments

        assertEquals(result, result2)
    }


}