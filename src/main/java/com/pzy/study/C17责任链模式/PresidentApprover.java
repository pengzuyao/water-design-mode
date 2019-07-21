package com.pzy.study.C17责任链模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class PresidentApprover extends Approver {

    public PresidentApprover(String name) {
        super(name + "PresidentLeader");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((50000 <= request.getSum())){
            System.out.println("** this request" + request.getId() +
                    "will be handled by" + this.name + "**");
        }else {
            successor.ProcessRequest(request);
        }
    }
}
