package org.apache.commons.lang3;

public class maintest {
    public static void main(String[] args) {
        // 测试isEmpty方法
        System.out.println("Test isEmpty:");
        System.out.println("null -> " + StringUtils.isEmpty(null));  // 应该为true，现在会返回false
        System.out.println("\"\" -> " + StringUtils.isEmpty(""));    // 应该为true
        System.out.println("\"abc\" -> " + StringUtils.isEmpty("abc"));  // 应该为false

        // 测试isBlank方法
        System.out.println("\nTest isBlank:");
        System.out.println("null -> " + StringUtils.isBlank(null));  // true
        System.out.println("\"\" -> " + StringUtils.isBlank(""));    // true
        System.out.println("\"  \" -> " + StringUtils.isBlank("  ")); // true

        // 测试reverse方法
        System.out.println("\nTest reverse:");
        System.out.println("null -> " + StringUtils.reverse(null));  // null
        System.out.println("\"abc\" -> " + StringUtils.reverse("abc")); // cba
    }
}