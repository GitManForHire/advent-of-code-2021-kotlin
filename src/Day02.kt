fun main() {
    fun part1(input: List<String>): Int {
        var position: Int = 0
        var depth: Int = 0
        var product: Int = 0

        for (element in input) {
            val lastIndex = element.length - 1
            if (element.get(0) == 'f') {
                position += Character.getNumericValue(element.get(lastIndex))
            }
            else if (element.get(0) == 'd') {
                depth += Character.getNumericValue(element.get(lastIndex))
            }
            else if (element.get(0) == 'u') {
                depth -= Character.getNumericValue(element.get(lastIndex))
            }
        }

        product = position * depth

        return product
    }

    fun part2(input: List<String>): Int {
        var position: Int = 0
        var depth: Int = 0
        var aim: Int = 0
        var product: Int = 0

        for (element in input) {
            val lastIndex = element.length - 1
            if (element.get(0) == 'f') {
                position += Character.getNumericValue(element.get(lastIndex))
                depth += aim * Character.getNumericValue(element.get(lastIndex))
            }
            else if (element.get(0) == 'd') {
                aim += Character.getNumericValue(element.get(lastIndex))
            }
            else if (element.get(0) == 'u') {
                aim -= Character.getNumericValue(element.get(lastIndex))
            }
        }

        product = position * depth

        return product
    }

    val input = readInput("Day02")
    println("The answer to Part 1 is ${part1(input)}")
    println("The answer to Part 2 is ${part2(input)}")
}
