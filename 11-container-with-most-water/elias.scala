object Solution {
    def maxArea(height: Array[Int]): Int = {
        var l = 0
        var r = height.length - 1
        var res = 0
        
        while (l < r) {
            val area = (r - l) * height(l).min(height(r))
            res = res.max(area)
            
            if (height(l) <= height(r)) {
                l += 1
            } else {
                r -= 1
            }
        }
        
        res
    }
