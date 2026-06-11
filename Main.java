class Main {
    public static void main(String[] args) {
        int number = 12   ;
        boolean isPrime = true;
        
        if (number <= 1){
            System.out.println("Not Prime");
        }
        else{
            for (int i = 2; i < number ; i++){
                if (number % i == 0){
                    System.out.println(number+" not prime number");
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