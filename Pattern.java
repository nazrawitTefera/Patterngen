//nazrawit tefera
// october 30, 2025
//pattern generator
public class Pattern{
    //precondition-rows must be greater than zero
    //postcondition- prints stars with the given number of rows
    public static void stars(int rows){
        int row=1;
        int stars=1;
        while(row<=rows){
            int count=1;
            while(count<= stars){
                System.out.print("*");
                count++;
            }
            System.out.println();
            row++ ;
            stars+=2 ;
            
        }
    }
    //pre condition- the rows have to be greater than zero
    //postconditin- prints a triangle formed numbers 
    public static void triangle(int rows) {
    int row = 1;  

    while (row <= rows) {           
        int count = 1;              

        while (count <= row) {      
            System.out.print(row);  
            count++;
        }

        System.out.println();       
        row++;}                      
    }
    //pre-condition- start has to be an odd number greater than 0
    //post-condition- print an inverted triangle from 9
    public static void odds(int start){
        for(int num=start ;num>=1;num-=2){
            for(int count=1;count <= num;count++){
                System.out.print(num);
            }
            System.out.println();}
        }
    //pre-maxE > 0
    //post- prints letters in sideways triangle
    public static void eo(int maxE){
        for(int letter=1; letter<=maxE; letter++){
            for(int count=1;count<=letter;count++){
                if (letter % 2 == 0) {
                System.out.print("E");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();


    }
        for(int letter=maxE-1; letter>=1;letter--){
            for(int count = 1;count <= letter; count++){
                if(letter%2==0){
                    System.out.print("E");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println();}

    }
    public static void pyramid(int rows) {
    for (int row = 1; row <= rows; row++) {
        // Print leading spaces
        for (int space = 1; space < row; space++) {
            System.out.print(" ");
        }
        // Print numbers
        for (int num = 1; num <= (2 * (rows - row) + 1); num++) {
            System.out.print(row);
        }
        System.out.println(); // Move to next line
    }

    

    }





    public static void main(String[] args) {
        stars(5);
        System.out.println();
        triangle(9);
        System.out.println();
        odds(9);
        System.out.println();
        eo(6);
        System.out.println();
        pyramid(5);

    }
    }
