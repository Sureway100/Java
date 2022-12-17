public class methodOverLoading {
        public static void main(String[] args) {
            methodOne(1, "emeka", true, 'f');
            methodOne(2, "kate", false);
            methodOne(3, "joy");
        }
        public static void methodOne(int numb, String name, boolean isCorrect, char gender) {
            System.out.println("this has four " + numb + name + isCorrect + gender);
        }
        public static void methodOne(int numb, String name, boolean isCorrect) {
            System.out.println("this has four " + numb + name + isCorrect);
        }
        public static void methodOne(int numb, String name) {
            System.out.println("this has four " + numb + name);
        }
    
    }