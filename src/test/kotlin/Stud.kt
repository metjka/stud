import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Created by isalnikov on 8/1/2016.
 * Time 2:55 PM
 * kot
 */
class Stud {

    var romanNumConverter = RomanNumeralsConverter()

    @Test
    fun checkWhenNumbersIsEmpty() {
        try {
            romanNumConverter.convert("")
        } catch (e: IllegalArgumentException) {
            Assert.assertTrue(e is IllegalArgumentException)
        }

    }

    @Test
    fun checkIfNumberIsPositive() {
        val num = romanNumConverter.convert("V")
        assertTrue(num > 0)
    }

    @Test
    fun checkSimpleNumbers() {
        val num1 = romanNumConverter.convert("I")
        val num5 = romanNumConverter.convert("V")
        val num10 = romanNumConverter.convert("X")
        val num50 = romanNumConverter.convert("L")
        val num100 = romanNumConverter.convert("C")
        val num500 = romanNumConverter.convert("D")
        val num1000 = romanNumConverter.convert("M")


        assertEquals(num1, 1)
        assertEquals(num5, 5)
        assertEquals(num10, 10)
        assertEquals(num50, 50)
        assertEquals(num100, 100)
        assertEquals(num500, 500)
        assertEquals(num1000, 1000)
    }

    @Test
    fun checkSimpleNumbersForLowerCase() {
        val num1 = romanNumConverter.convert("I".toLowerCase())
        val num5 = romanNumConverter.convert("V".toLowerCase())
        val num10 = romanNumConverter.convert("X".toLowerCase())
        val num50 = romanNumConverter.convert("L".toLowerCase())
        val num100 = romanNumConverter.convert("C".toLowerCase())
        val num500 = romanNumConverter.convert("D".toLowerCase())
        val num1000 = romanNumConverter.convert("M".toLowerCase())


        assertEquals(num1, 1)
        assertEquals(num5, 5)
        assertEquals(num10, 10)
        assertEquals(num50, 50)
        assertEquals(num100, 100)
        assertEquals(num500, 500)
        assertEquals(num1000, 1000)
    }

    @Test
    fun checkAdvancedNumbers() {
        val num2 = romanNumConverter.convert("II")
        val num3 = romanNumConverter.convert("III")
        val num4 = romanNumConverter.convert("IV")
        val num6 = romanNumConverter.convert("VI")
        val num7 = romanNumConverter.convert("VII")
        val num8 = romanNumConverter.convert("VIII")
        val num9 = romanNumConverter.convert("IX")

        assertEquals(num2, 2)
        assertEquals(num3, 3)
        assertEquals(num4, 4)
        assertEquals(num6, 6)
        assertEquals(num7, 7)
        assertEquals(num8, 8)
        assertEquals(num9, 9)
    }

    @Test
    fun checkAdvancedNumbersForLowerCase() {
        val num2 = romanNumConverter.convert("II".toLowerCase())
        val num3 = romanNumConverter.convert("III".toLowerCase())
        val num4 = romanNumConverter.convert("IV".toLowerCase())
        val num6 = romanNumConverter.convert("VI".toLowerCase())
        val num7 = romanNumConverter.convert("VII".toLowerCase())
        val num8 = romanNumConverter.convert("VIII".toLowerCase())
        val num9 = romanNumConverter.convert("IX".toLowerCase())

        assertEquals(num2, 2)
        assertEquals(num3, 3)
        assertEquals(num4, 4)
        assertEquals(num6, 6)
        assertEquals(num7, 7)
        assertEquals(num8, 8)
        assertEquals(num9, 9)
    }

}