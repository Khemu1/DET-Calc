package DET;

public class ICalculator1 extends ICalculator {
    public int sign() {
        if (currentValue > 0) {
            return 1;
        } else if (currentValue < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
