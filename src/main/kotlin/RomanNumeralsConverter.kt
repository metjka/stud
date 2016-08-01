import com.sun.deploy.util.ArrayUtil
import org.apache.commons.lang.ArrayUtils

/**
 * Created by isalnikov on 8/1/2016.
 * Time 3:42 PM
 * kot
 */
class RomanNumeralsConverter : IRomanNumeralsConverter {


    val MAIN_NUM = "IVXLCDM".toUpperCase().toCharArray()

    private val I = 1
    private val V = 5
    private val X = 10
    private val L = 50
    private val C = 100
    private val D = 500
    private val M = 1000

    override fun convert(number: String): Int {
        val uppercaseNum = number.toUpperCase().trim().toCharArray()
        val count = uppercaseNum.count()

        when {
            count == 1 -> return basicConverter(uppercaseNum[0])
            count > 0 -> return advancedConverter(uppercaseNum)
            else -> throw IllegalArgumentException("String is funny!")
        }
    }

    private fun advancedConverter(uppercaseNum: CharArray): Int {
        val count = uppercaseNum.count()
        var list = uppercaseNum

        while (list.isNotEmpty()) {
            val last = list.lastIndex
            
            if ()
                ArrayUtils.removeElement
        }
        return 1;
    }
}


private fun basicConverter(later: Char): Int {
    when (later) {
        'I' -> return I
        'V' -> return V
        'X' -> return X
        'L' -> return L
        'C' -> return C
        'D' -> return D
        'M' -> return M
        else -> throw IllegalArgumentException("Number is invalid!")
    }
}

}

