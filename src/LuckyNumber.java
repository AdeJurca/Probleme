//input:nr n; output:true/false
//lucky reprezinta un nr care are cifra de control divizibila cu nr 7
//cifra de control rep suma cifrelor din numar care se recalculeaza pana suma devine <10

public class LuckyNumber {
    public static void main(String[] args) {
        int n =21412421;
        int controlNumber=n;
        while(controlNumber>=10) {
            controlNumber=calculateSum(controlNumber);
        }
        System.out.println(controlNumber%7==0);
    }

    public static Integer calculateSum(int n) {
        int sum=0;
        while(n!=0) {
            sum=n%10;
            n/=10;
        }
        return sum;
    }
}

//SIMPLIFICARE
//public static void main(String[] args) {
//    int n=871;
//    System.out.println(n%9==7);
//}

//FACT
//Cifra de control a unui nr este restul impartirii la 9; este 9 cand acesta
//se divide cu 9 ("n%9==0") si astfel se pune o conditie "if(n%9==0) { return 9;}"

//??Cate grade sunt intre 3:15 a unui ceas. R:7,5. La 12:00 sunt 0 grade.