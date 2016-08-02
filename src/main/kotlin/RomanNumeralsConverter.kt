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
        val uppercaseNum: CharArray = number.toUpperCase().trim().toCharArray()
        val count = uppercaseNum.count()

        when {
            count == 1 -> return basicConverter(uppercaseNum[0])
            count > 1 -> return advancedConverter(uppercaseNum)
            else -> throw IllegalArgumentException("String is funny!")
        }
    }

    private fun advancedConverter(uppercaseNum: CharArray): Int {
        var list: Array<Char> = uppercaseNum.toTypedArray()
        var sum: Int = 0
        while (list.isNotEmpty()) {
            val lastIndex = list.lastIndex
            val last = basicConverter(list.last())
            var dummySum: Int = last
            var c: Int = 0
            if (lastIndex > 3) {
                for (i in lastIndex downTo lastIndex - 3) {
                    if (last >= basicConverter(list[i])) {
                        c++
                        dummySum += basicConverter(list[i])
                    } else if (last < basicConverter(list[i])) {
                        break
                    }
                }
            }
            var ac = advancedSum(list.takeLast(c))
            list = list.dropLast(c).toTypedArray()
        }
        return 1;
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


    private fun advancedSum(lis: List<Char>) {

        val numlist: List<Int> = lis.map { it -> basicConverter(it) }
        val maxIndex: Int? = numlist.maxBy { numlist[it] } ?: -1

        var num: Int = 0

        if (maxIndex == numlist.lastIndex) {
            for (i in  0..numlist.lastIndex - 1) {
                 numlist.get(i)
            }
        }


    }

}



