package com.pzy.study.C17责任链模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class MainTest {

    public static void main(String[] args) {
        //客户
        Client client = new Client();
        //组长
        Approver groupApprover = new GroupApprover("Tom");
        //部长
        Approver departmentApprover = new DepartmentApprover("Jeery");
        //总裁助理
        Approver vicePresidentApprover = new VicePresidentApprover("Kate");
        //总裁
        Approver presidentApprover = new PresidentApprover("Bush");

        groupApprover.setSuccessor(departmentApprover);
        departmentApprover.setSuccessor(vicePresidentApprover);
        vicePresidentApprover.setSuccessor(presidentApprover);
        presidentApprover.setSuccessor(groupApprover);

        groupApprover.ProcessRequest(client.sendRequest(1 ,100 , 40));
        groupApprover.ProcessRequest(client.sendRequest(2 ,200 , 40));
        groupApprover.ProcessRequest(client.sendRequest(3,300 , 40));
        groupApprover.ProcessRequest(client.sendRequest(4 ,400 , 140));

    }
}
