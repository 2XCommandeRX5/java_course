package L11;

import java.util.List;

public enum RomanNum {
    ONE(1),
    FIVE(5),
    TEN(10);

    private int value;

    RomanNum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int convertToArabic(List<RomanNum> romans) {
        int sum = 0;

        for (int i = 0; i < romans.size() - 1; i++) {
            int curNum = romans.get(i).getValue();
            if (curNum < romans.get(i + 1).getValue()) {
                sum -= curNum;
            } else {
                sum += curNum;
            }
        }
        sum += romans.get(romans.size() - 1).getValue();

        return sum;
    }
}
