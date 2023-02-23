import "sort"

func threeSum(nums []int) (res [][]int) {
  sort.Ints(nums)
  
  for i := 0; i < len(nums) - 2; i++ {
    // skip repetitions
    if i > 0 && nums[i] == nums[i - 1] {
      continue
    }
    
    j, k := i + 1, len(nums) - 1
    for j < k {
      sum := nums[i] + nums[j] + nums[k]
      
      if sum > 0 {
        k--
      } else if sum < 0 {
        j++
      } else {
        res = append(res, []int{nums[i], nums[j], nums[k]})
        j++
        for nums[j] == nums[j - 1] && j < k {
          j++
        }
      }
    }
  }
  
  return
}
