package Chapter7.polymorphism;

import java.util.concurrent.AbstractExecutorService;

/**
 * protected 예야어
 *  외부 클래스에는 private 으로 하위 클래스에서 public 의 기능을 구현한 키워드
 *  상위 클래스에 protected 으로 선언된 변수나 메소드는 다른 외부 클래스에서는 활욜할수없지만 하위 클래스에서는 사용가능
 */

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*	public Customer() {
            customerGrade = "SILVER";
            bonusRatio = 0.01;

            System.out.println("Customer() 생성자 호출");
        }
    */
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        //	System.out.println("Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}

class VIPCustomer extends Customer{

    double salesRatio;
    private int agentID;

	/*public VIPCustomer() {


		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer() 새성자호출");
	}*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        //	System.out.println("VIPCustomer(int, String) 생성자호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}

class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}

class CustomerTest {
    public static void main(String[] args) {

    }
}