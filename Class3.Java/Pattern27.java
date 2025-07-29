import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int totalrows = scanner.nextInt();
        int currentrows =1;

while (currentrows<=totalrows) {
    //Step 1:- Print leading spaces first
    int spacecount =totalrows-currentrows;
    int space =0;
    while (space<spacecount) {
        System.out.print("  ");
        space++;        
    }
    //Step 2:- Print increasing numbers from 1 to current row 
    int number=1;
    int col=1;
    while (col<=currentrows) {System.out.print(number+" ");
        number++;
        col++;
    }
    //
    number= currentrows-1;
    col=0;
    while (col<currentrows-1){
        System.out.print(number+" ");
        number--;
        col++;
        
    }
    System.out.println();
    currentrows++;
}

    }
}
