import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022212018_16_Test {
    // 等价类划分：根据输入的不同特性（如所有数字都相同、包含0、有前导零、正整数等），将输入划分为不同的等价类。
    //边界值分析：测试数组为空、只有一个元素的情况。
    //异常值：考虑一些极端情况，比如非常大的数或者全是0的数组。
    @Test
    public void testEmptyArray() {
        // 测试目的: 当输入数组为空时，应该返回"0"
        int[] nums = {};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("0", result, "Failed on empty array");
    }

    @Test
    public void testSingleElement() {
        // 测试目的: 当输入数组只有一个元素时，直接返回该元素
        int[] nums = {5};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("5", result, "Failed on single element array");
    }

    @Test
    public void testAllZeros() {
        // 测试目的: 如果数组中全是0，输出应该是"0"
        int[] nums = {0, 0, 0, 0};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("0", result, "Failed on all zeros array");
    }

    @Test
    public void testExample1() {
        // 测试目的: 根据题目示例1，输入[10, 2]应该返回"210"
        int[] nums = {10, 2};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("210", result, "Failed on example 1");
    }

    @Test
    public void testExample2() {
        // 测试目的: 根据题目示例2，输入[3, 30, 34, 5, 9]应该返回"9534330"
        int[] nums = {3, 30, 34, 5, 9};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("9534330", result, "Failed on example 2");
    }
}