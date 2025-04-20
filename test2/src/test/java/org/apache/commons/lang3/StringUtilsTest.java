//package org.apache.commons.lang3;
//
//import org.junit.Test;
//
//public class StringUtilsTest {
//
//    @Test
//    public void testIsEmpty() {
//        verify(StringUtils.isEmpty(null), "null should be empty");
//        verify(StringUtils.isEmpty(""), "\"\" should be empty");
//        verify(!StringUtils.isEmpty(" "), "\" \" should not be empty");
//        verify(!StringUtils.isEmpty("test"), "\"test\" should not be empty");
//    }
//
//    @Test
//    public void testIsBlank() {
//        verify(StringUtils.isBlank(null), "null should be blank");
//        verify(StringUtils.isBlank(""), "\"\" should be blank");
//        verify(StringUtils.isBlank(" "), "\" \" should be blank");
//        verify(StringUtils.isBlank("\t"), "\"\\t\" should be blank");
//        verify(!StringUtils.isBlank(" a "), "\" a \" should not be blank");
//        verify(!StringUtils.isBlank("test"), "\"test\" should not be blank");
//    }
//
//    @Test
//    public void testReverse() {
//        verify(StringUtils.reverse(null) == null, "reverse(null) should return null");
//        verify("".equals(StringUtils.reverse("")), "reverse(\"\") should return \"\"");
//        verify("cba".equals(StringUtils.reverse("abc")), "reverse(\"abc\") should return \"cba\"");
//        verify("dlrow olleh".equals(StringUtils.reverse("hello world")),
//                "reverse(\"hello world\") should return \"dlrow olleh\"");
//    }
//
//    // 辅助方法，简化验证逻辑
//    private void verify(boolean condition, String message) {
//        if (!condition) {
//            throw new AssertionError(message);
//        }
//    }
//}
package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {


    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("  ", StringUtils.reverse("  "));
    }
}