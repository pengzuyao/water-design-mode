package com.pzy.study.C17责任链模式;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name + "DepartmentLeader");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((5000 <= request.getSum()) && (request.getSum() < 10000)){
            System.out.println("** this request" + request.getId() +
                    "will be handled by" + this.name + "**");
        }else {
            successor.ProcessRequest(request);
        }

    }
}
