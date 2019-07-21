package com.pzy.study.C17责任链模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class GroupApprover extends Approver {

    public GroupApprover(String name) {
        super(name + "GroupLeader");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if (request.getSum() < 5000){
            System.out.println("** this request" + request.getId() + 
                    "will be handled by" + this.name + "**");
        }else {
            successor.ProcessRequest(request);
        }
    }

}
