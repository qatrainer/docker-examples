public class hello {
        public static void main(String[] args) {
                System.out.println("Hello World!");
                System.out.println("Look ma, I can code") ;
                System.out.println("2 + 2 is " + (2+2));

                int i = 0;
                for (int x = 0; x < 10; x++){

                  if (x % 2 == 0) {
                    System.out.println(x);
                  }

                  i += x;
                }

                System.out.println(i);
        }
}
