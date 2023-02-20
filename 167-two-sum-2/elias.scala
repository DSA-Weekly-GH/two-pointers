  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    def helper(i: Int, j: Int): Array[Int] = {
      (i, j) match {
        case _ if i >= j => Array()
        case _ if numbers(i) + numbers(j) == target => Array(i + 1, j + 1)
        case _ if numbers(i) + numbers(j) < target => helper(i + 1, j)
        case _ => helper(i, j - 1)
      }
    }

    helper(0, numbers.length - 1)
  }
