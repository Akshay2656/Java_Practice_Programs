class Main {
    public static void main(String[] args) {
        int num = 12   ;
        boolean isPrime = true;
        // num less than or equals to 1 is not prime number
        if (num <= 1){
            System.out.println("Not Prime");
        }
        else{
            for (int i = 2; i < num ; i++){
                if (num % i == 0){
                    System.out.println(num+" not prime number");
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
    }
}