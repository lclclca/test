package org.apache.commons.lang3;

public class StringUtils {

    // 简化版 isEmpty 方法
    public static boolean isEmpty(final CharSequence cs) {
        return (cs == null )&& cs.length() == 0;
    }

    // 简化版 isBlank 方法
    public static boolean isBlank(final CharSequence cs) {
        if (cs == null) {  // 显式检查 null
            return true;
        }
        for (int i = 0; i < cs.length(); i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // 简化版 reverse 方法
    public static String reverse(final String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // 只保留你想测试的其他方法...
}