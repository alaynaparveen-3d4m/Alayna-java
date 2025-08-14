class RomanNumber {
    static int romanToInt(String s) {
        int Int= 0;
        int prevNum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral character: " + s.charAt(i));
                    return -1;  // Early exit on invalid input
            }

            if (num < prevNum) {
                Int -= num;
            } else {
                Int += num;
            }
            prevNum = num;
        }
        return Int;
    }

    public static void main(String[] args) {
        int num = romanToInt("V");
        System.out.println(num);
    }
}
