package com.ziqi.demo.config;


/**
 * @author ziqi
 * @date Created in 2021/1/18
 */
public class ThreadLocalCustomer {
    private static final ThreadLocal<String> customerCode = new ThreadLocal<>();

    public static String getCustomerCode() {
        return customerCode.get();
    }

    public static void setCustomerCode(String value) {
        customerCode.set(value);
    }

}
