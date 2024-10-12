import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022212018_16_Test {
    // 等价类划分 ： 根据输入的不同特性，将输入划分为若干等价类
    //
    @Test
    public void testEmptyArray() {
        // 测试目的: 当输入数组为空时，应该返回"0"
        int[] nums = {};
        Solution solution = new Solution();
        String result = solution.largestNumber(nums);
        assertEquals("0", result, "Failed on empty array");
    }
}