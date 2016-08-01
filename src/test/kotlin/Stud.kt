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
    fun checkIfNumbersIsEmty() {
        romanNumConverter.

    }

    @Test
    fun checkIfNumberIsPositiv() {
        val num = romanNumConverter.convert("V")
        assertTrue(num > 0)
    }

    @Test
    fun checkSimpleNumbers() {
        val num1 = romanNumConverter.convert("I")
        val num2 = romanNumConverter.convert("II")
        val num3 = romanNumConverter.convert("III")
        val num4 = romanNumConverter.convert("IV")
        val num5 = romanNumConverter.convert("V")
        val num6 = romanNumConverter.convert("VI")
        val num7 = romanNumConverter.convert("VII")
        val num8 = romanNumConverter.convert("VIII")
        val num9 = romanNumConverter.convert("IX")
        val num10 = romanNumConverter.convert("X")

        assertEquals(num1, 1)
        assertEquals(num2, 2)
        assertEquals(num3, 3)
        assertEquals(num4, 4)
        assertEquals(num5, 5)
        assertEquals(num6, 6)
        assertEquals(num7, 7)
        assertEquals(num8, 8)
        assertEquals(num9, 9)
        assertEquals(num10, 10)
    }

    @Test
    fun checkForLowerCase() {

    }

}