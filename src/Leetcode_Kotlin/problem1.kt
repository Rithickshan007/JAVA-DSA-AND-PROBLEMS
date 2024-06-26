package Leetcode_Kotlin


//Problem 1 Two Sum
//Using the simple for Loop
class KtSolution1Prob1 {
    fun twoSum1(nums: IntArray, target: Int): IntArray? {
        for (i in  nums.indices) {
            for (j in i+1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return null
    }
}
//Using Hashmap
class KtSolution2Prob1{
    fun twoSum2(nums: IntArray, target: Int): IntArray? {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return null
    }
}

fun main(){
    val nums= intArrayOf(2,7,11,15)
    val target=9;
    val solution1=KtSolution1Prob1();
    val result1=solution1.twoSum1(nums,target)
    val solution2=KtSolution2Prob1()
    val result2=solution2.twoSum2(nums,target)
    println(result1?.joinToString(prefix = "[", postfix = "]", separator = ", ") ?: "No solution found")
    println(result2?.joinToString(prefix = "[", postfix = "]", separator = ", ") ?: "No solution found")
}

