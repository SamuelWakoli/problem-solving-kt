fun isLeapYear(year: Int): Boolean {
  // A year is a leap year if it is divisible by 4 and not divisible by 100, unless it is also divisible by 400.
  return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun main(args: Array<String>) {
  val year = 2024
  val isLeapYear = isLeapYear(year)
  println("$year is a leap year: $isLeapYear")
}
