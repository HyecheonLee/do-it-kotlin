package com.section03;

import com.hyecheon.section03.KCustomer;
import com.hyecheon.section03.KJob;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

        final KJob kJob = KCustomer.JOB;
        System.out.println(kJob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
