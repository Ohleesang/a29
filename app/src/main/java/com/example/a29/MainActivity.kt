package com.example.a29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(arr: IntArray): IntArray {
                var answer = intArrayOf()
                var result = mutableListOf<Int>()
                var deleteInt = 0

                if(arr.size == 1) return intArrayOf(-1)


                for(index in 0..arr.size-1){
                    result.add(index,arr.get(index))
                }
                result.sort()
                deleteInt = result.get(0)
                var temp = mutableListOf<Int>()
                for(index in 0..arr.size-1){
                    if(arr.get(index)!=deleteInt) temp.add(arr.get(index))
                }
                answer = temp.toIntArray()


                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(4,3,2,1))
        a.solution(intArrayOf(10))
    }
}