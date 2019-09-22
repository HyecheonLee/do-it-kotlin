package com.section03;

import com.hyecheon.section03.OCustomer;

public class OCustomerAccess {
    public static void main(String[] args) {
        final String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
