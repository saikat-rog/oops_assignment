// Write a JAVA program apply the concept of method overriding, consider the case where Bank is a class that provides functionality to get the rate of interest. The rate of interest varies according to bank are, SBI, PNB and Bank of Baroda banks could provide 9%, 10%, and 11% rate of interest.

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}

class PNB extends Bank {
    @Override
    double getRateOfInterest() {
        return 10.0;
    }
}

class BankOfBaroda extends Bank {
    @Override
    double getRateOfInterest() {
        return 11.0;
    }
}

public class Q1 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        PNB pnb = new PNB();
        BankOfBaroda bob = new BankOfBaroda();

        System.out.println("Rate of Interest in SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in PNB: " + pnb.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in Bank of Baroda: " + bob.getRateOfInterest() + "%");
    }
}
