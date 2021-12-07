fun main() {
    fun part1(input: List<String>): Int {
        var previousDepth: Int? = null
        var currentDepth = 0
        var increaseCount = 0

        for (num in input) {
            currentDepth = num.toInt()

            if (previousDepth == null) {
                previousDepth = currentDepth
            }
            else if (currentDepth > previousDepth) {
                increaseCount++
                previousDepth = currentDepth
            }
            else {
                previousDepth = currentDepth
            }
        }

        return increaseCount
    }

    // fun part2(input: List<String>): Int {
    //     return input.size
    // }

    // test if implementation meets criteria from the description, like:
    // val testInput = readInput("Day01_test")
    // check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    // println(part2(input))
}
