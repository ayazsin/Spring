package bank;

import bean.Player;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"bankContext.xml"});
        BankLoan bankLoan = (BankLoan) appContext.getBean("loanbean");
        BankLoan bankLoan2 = (BankLoan) appContext.getBean("loanbean2");

        bankLoan.calculBankBenfit();
        bankLoan2.calculBankBenfit();
        System.out.println(bankLoan);
        System.out.println(bankLoan2);
        appContext.close();
    }
}
