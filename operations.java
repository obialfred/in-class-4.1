import java.util.Scanner;

class Operations {

    public int sums(int sumAns) {
        int n;
        sumAns = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the amount of numbers you want summed: ");
        n = userInput = userInput.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + "numbers");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            a[i] = userInput.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum of " + n + "numbers is =" + sum);
    }

    public armstrongNum (){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();
        int originalNum = 0;
        int remainder = 0;
        int result = 0;
        int n = 0;

        originalNum = num;

        for (;originalNum != 0; originalNum /= 10)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

    public primeNum(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = userInput.nextInt();

        if (n <= 1)
        System.out.println("Not valid");
        
        
        for (int i = 2; i < n; i++)
            if (n % i == 0){
            System.out.println("It is a composite number");
            }

            System.out.println("Is a prime number");

    }

    public multiples(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();
        int n = 10;
        for (int i = 1; i < n; i++){
            System.out.print(" " + num*i);
        }

    }

    public int sumTotals() {
        int n, r, s, s2 = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();

        while (num > 0) {
            r = num % 10;
            if (r % 2 == 0) {
                s = s + r;
            }
            num = num / 10;
        }

        while (num > 0) {
            r = num % 10;
            if (r % 1 == 0) {
                s2 = s2 + r;
            }
            num = num / 10;
        }

        for (int i = 0; i <= num; i++) {
            int evenNum = 0;
            int oddNum = 0;
            if (i % 2 == 0) {
                evenNum++;
            } else if (i % 1 == 0) {
                oddNum++;
            }
        }

        System.out.print("The sum of even digits: " + s);
        System.out.print("The sum of odd digits: " + s2);
        System.out.print("Number of even digits: " + evenNum);
        System.out.print("Number of odd digits: " + oddNum);

    }

    public palindrome (){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();
        int reversedInt = 0;
        int remainder = 0;
        int originalInt = 0;

        originalInt = num;

        while (num!= 0)
        {
            remainder = num % 10;
            reversedInt = reversedInt * 10 + remainder;
            num /= 10;
        }

        if (originalInt == reversedInt)
            System.out.println(originalInt + " is a palindrome.");
            else
            System.out.println(originalInt + "is not a palindrome.");

    }

    public int factorial() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = userInput.nextInt();
        int fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + "is: " + fact);
    }

    public static void main(String[] args) {
        Operations o = new Operations();
        Scanner userInput = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
            o.sums(sumAns);
            break;
        case 2:
            o.armstrongNum();
            break;
        case 3:
            o.primeNum();
            break;
        case 4:
            o.multiples();
        case 5:
            o.sumTotals();
        case 6:
            o.palindrome();
        case 7:
            o.factorial();
        case 8:
        case 9:
            break;
        default:
            System.out.println("Not valid input");
        }
    }
}