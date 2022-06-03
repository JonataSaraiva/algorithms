/**
 *
 *  CONVERTING A ROMAM NUMBER TO A DECIMAL ALGORITM
 *
 *
 **/
fun main(args: Array<String>) {
    var romanNumber = "MCDLXXVI"
    var count = 0

    RomanNumber.getSpecialCases().forEach {
        if(romanNumber.contains(it.name, true)){
            count+= it.integerValue
            romanNumber = romanNumber.replace(it.name, "")
        }
    }

    romanNumber.forEach {
        val romanNumberEnum = RomanNumber.valueOf(it.toString())
        count+= romanNumberEnum.integerValue
    }

    println("Final number is $count")
}

enum class RomanNumber(val integerValue: Int){
    I(1), IV(4), IX(9),
    V(5),
    X(10), XL(40), XC(90),
    L(50),
    C(100), CD(400), CM(900),
    D(500),
    M(1000);

    companion object {
        fun getSpecialCases() : List<RomanNumber> =
            listOf(IV, IX , XL, XC, CD, CM)
    }
}