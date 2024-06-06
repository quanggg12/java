public class PTB2 {
    double a, b ,c;

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String giaiPT() {
        String res = "";
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    res = "pt vo so nghiem";
                }
                else res = "pt vo nghiem";
            }
            else res = "Pt co 1 nghiem x = " + (-c/b);
        }
        else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                res = "pt co 2 nghiem phan biet x1 = " + (-b - (double)Math.sqrt(d)) / (a * 2) + "va x2 = " + (-b + (double)Math.sqrt(d)) / (2 * a);
            }
            else if (d == 0) {
                res = "pt co nghiem kep = " + (-b/(2 * a));
            }
            else res = "pt vo nghiem";
        }
        return res;
    }
}
