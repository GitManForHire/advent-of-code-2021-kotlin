import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val inputStr: String = input[0]
        val inputArr = inputStr.split(",").toTypedArray()
        var biggestPos = 0
        var fuelSum = 0
        var mostEfficient = 1000000000

        for (position in inputArr) {
            if (position.toInt() > biggestPos) {
                biggestPos = position.toInt()
            }
        }

        for (i in 0..(biggestPos)) {
            for (position in inputArr) {
                fuelSum += abs(position.toInt() - i)
            }

            if (fuelSum < mostEfficient) {
                mostEfficient = fuelSum
            }

            fuelSum = 0
        }

        return mostEfficient
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val input = readInput("Day07")
    println("The answer to Part 1 is ${part1(input)}")
    println("Part 2 was not attempted")
}