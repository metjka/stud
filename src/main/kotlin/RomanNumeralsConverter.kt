/**
 * Created by isalnikov on 8/1/2016.
 * Time 3:42 PM
 * kot
 */
class RomanNumeralsConverter {

    val regex = Regex("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$")

    fun convert(num: String): Int {
        val numToUpperCase = num.toUpperCase()
        if (regex.matches(numToUpperCase)) {
            return toArabic(num.toUpperCase())
        }
        throw IllegalArgumentException("This is not romain number!")
    }

    fun toArabic(romainNumber: String): Int {
        when {
            romainNumber.isEmpty() -> return 0
            romainNumber.startsWith("M") -> return 1000 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("CM") -> return 900 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("D") -> return 500 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("CD") -> return 400 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("C") -> return 100 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("XC") -> return 90 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("L") -> return 50 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("XL") -> return 40 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("X") -> return 10 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("IX") -> return 9 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("V") -> return 5 + toArabic(romainNumber.removeRange(0, 1))
            romainNumber.startsWith("IV") -> return 4 + toArabic(romainNumber.removeRange(0, 2))
            romainNumber.startsWith("I") -> return 1 + toArabic(romainNumber.removeRange(0, 1))
            else -> throw IllegalArgumentException("Wrong romain number!")
        }
    }

    fun toRomain(): String {
        return "I"
    }


}



