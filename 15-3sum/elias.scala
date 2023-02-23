object Solution {
   import scala.collection.mutable.ListBuffer

    def threeSum(nums: Array[Int]): List[List[Int]] = {
    val numSorted = nums.sorted
    var solutionList: List[List[Int]] = List()

    for {
        i <- 0 until numSorted.length - 2
        if i == 0 || (i > 0 && numSorted(i) != numSorted(i-1))
    } {
        var j = i + 1
        var k = numSorted.length - 1
        while (j < k) {
        val sum = numSorted(i) + numSorted(j) + numSorted(k)
        if (sum == 0) {
            solutionList = List(numSorted(i), numSorted(j), numSorted(k)) :: solutionList
            while (j < k && numSorted(j) == numSorted(j+1)) j += 1
            while (j < k && numSorted(k) == numSorted(k-1)) k -= 1
            j += 1
            k -= 1
        } else if (sum < 0) {
            j += 1
        } else {
            k -= 1
        }
        }
    }

    solutionList.reverse
    }


}
