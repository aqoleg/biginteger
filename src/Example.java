import com.aqoleg.BigInteger;

public class Example {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("requires 3 arguments");
            return;
        }
        BigInteger a, b;
        try {
            a = BigInteger.parse(args[0]);
            b = BigInteger.parse(args[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        switch (args[1]) {
            case "add":
                System.out.println(a.add(b).toHexString(true));
                return;
            case "sub":
                System.out.println(a.subtract(b).toHexString(true));
                return;
            case "mul":
                System.out.println(a.multiply(b).toHexString(true));
                return;
            case "div":
                System.out.println(a.divide(b).toHexString(true));
                return;
            default:
                System.out.println("requires command add, sub, mul or div");
        }
    }
}