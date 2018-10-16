import org.junit.Test
import kotlin.test.assert
import kotlin.test.assertEquals

class FunTest {

    @Test
    fun defineAFunctionWithoutAClass(){

        //replace TODO with a value to make the test pass
        fun myfun(): String { return TODO()}

        assertEquals(myfun(),"Kotlin is Fun")
    }



    @Test
    fun singleStatementFunctionsDontNeedReturn(){

        //replace TODO with a value to make the test pass
        fun myfun(): String = TODO()

        assertEquals(myfun(),"Kotlin is Fun")
    }



    @Test
    fun nestedFun(){

        //replace TODO with a value to make the test pass
        fun myFun(): String {
            fun myNestedFun(): String {
                return TODO()
            }
            return myNestedFun()
        }

        assertEquals(myFun(), "Kotlin Fun can be nested!")
    }


    @Test
    fun singleStatementFunDeclaration(){

        //replace TODO with a value to make the test pass
        fun double(x: Int): Int = TODO()
        assertEquals(double(5),10)

    }



    @Test
    fun defaultParameter(){

        // fix it to make test pass
        fun answer(x: Int = 37) = x.toString()

        assertEquals(answer(12),"12")
        assertEquals(answer(0), "37")  // Change the parameter here, not the outcome

    }



    @Test
    fun namedParameters(){

        //replace TODO with a value to make the test pass
        fun calc(x: Int, y: Int, z: Int = 0): Int = x * y + z


        //  Change the parameters to the desired outcome (do not change the outcome)
        assertEquals(calc(1,2), 30)
        assertEquals(calc(2, 4), 23)

    }



    @Test
    fun spreadAndVarArgs(){

        fun myConcat(vararg xs: String): String{

            return xs.joinToString()

        }

        val nums = arrayOf("1","2","3")

        val result = myConcat(*nums)

        val result2 = myConcat() //choose correct arguments

        assertEquals(result, result2)
    }


}