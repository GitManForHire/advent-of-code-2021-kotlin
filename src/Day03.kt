fun main() {
    fun part1(input: List<String>): Long {
        val mostCommonArr = IntArray(12)
        val leastCommonArr = IntArray(12)
        var zerosCount = 0
        var onesCount = 0
        val product: Long

        for (i in 0..11) {
            for (number in input) {
                if (Character.getNumericValue(number[i]) == 0) {
                    zerosCount++
                }
                else if (Character.getNumericValue(number[i]) == 1) {
                    onesCount++
                }
            }

            if (zerosCount > onesCount) {
                mostCommonArr[i] = 0
            }
            else if (onesCount > zerosCount) {
                mostCommonArr[i] = 1
            }

            zerosCount = 0
            onesCount = 0
        }

        for (j in 0..11) {
            if (mostCommonArr[j] == 0) {
                leastCommonArr[j] = 1
            }
            else if (mostCommonArr[j] == 1) {
                leastCommonArr[j] = 0
            }
        }

        val mostCommonStr = mostCommonArr.joinToString(separator = "")
        val leastCommonStr = leastCommonArr.joinToString(separator = "")

        val mostCommon: Long = mostCommonStr.toLong(2)
        val leastCommon: Long = leastCommonStr.toLong(2)

        product = mostCommon * leastCommon

        return product
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val input = readInput("Day03")
    println("The answer to Part 1 is ${part1(input)}")
    println("Part 2 was not attempted")
}