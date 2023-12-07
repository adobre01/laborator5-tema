package tema_2;

public class PerecheNumere {
    private int numar1;
    private int numar2;


    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    public PerecheNumere() {

    }


    public int getNumar1() {
        return numar1;
    }

    public void setNumar1(int numar1) {
        this.numar1 = numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public void setNumar2(int numar2) {
        this.numar2 = numar2;
    }


    @Override
    public String toString() {
        return "PerecheNumere{" +
                "numar1=" + numar1 +
                ", numar2=" + numar2 +
                '}';
    }



    public boolean suntConsecutiveInFibonacci() {
        if (esteFib(numar1) && esteFib(numar2)) {
            int c = numar1 + numar2;
            if (esteFib(c) && numar1<numar2) {
                return true;
            }

        }
        return false;
    }





    static boolean estePP(int x)
    {
        int root = (int) Math.sqrt(x);

        if (root * root == x)
            return true;
        return false;
    }

    static boolean esteFib(int n)
    {
        if (estePP(5*n*n + 4) || estePP(5*n*n - 4))
            return true;
        return false;
    }



    public int cmmc() {
        int a = numar1;
        int b = numar2;

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }

        return a;
    }



    public boolean sumaCifrelorEgala() {
        int sumaCifreNumar1 = sumaCifre(numar1);
        int sumaCifreNumar2 = sumaCifre(numar2);

        if(sumaCifreNumar1 == sumaCifreNumar2)
            return true;
    return false;
    }



    private int sumaCifre(int numar) {
        int suma = 0;
        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }


    public boolean numarCifrePare() {
        if(numarCifrePare(numar1) == numarCifrePare(numar2))
            return true;
        return false;
    }


    private int numarCifrePare(int numar) {
        int numarCifrePare = 0;

        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 == 0) {
                numarCifrePare++;
            }
            numar /= 10;
        }

        return numarCifrePare;
    }
}

