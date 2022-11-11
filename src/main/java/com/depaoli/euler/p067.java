package com.depaoli.euler;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** https://projecteuler.net/problem=67
 * solution in Java
 * 
 * Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), 
 * a 15K text file containing a triangle with one-hundred rows.
 *  
 * if java is installed, then run by:
 * java ./p067.java
 * 
 * Answer:  7273
 */
class p067 {
    public static void main(String args[]) {

        System.out.println("Euler problem #067 solution");
		System.out.println("result from algorithm: " + MaxPathSum());
        
    }
    // function that calculates the maxpath
    public static String MaxPathSum() {

        int[][] triangle = new int[100][100];

        readTriangle(triangle); // after reading the triangle from the file we save it in the matrix. 
        
        for (int i = triangle.length - 2; i >=0; --i) { // number of sums it must do for example the first line will only have one because the line below has only two elements to compare
                                                        // triangle.length gives me the number of rows

            for (int j = 0; j < triangle[i].length - 1; ++j) { // triangle[i].length gives me the lenght of that row (number of columns)
                                                        
            triangle[i][j] = triangle[i][j] + Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]); // add the maximum between the two numbers that are touched below to the number taken into consideration
            
            }
		}
		return Integer.toString(triangle[0][0]); //return the max path sum that is in the triangle[0][0] position
    }

    // allows you to read the trinangle from a text file 
    public static void readTriangle(int[][] triangle) {

        try {
            // read in the data
            Scanner input = new Scanner (new File("/Users/alessiodepaoli/ProjectEuler-2022/txt-files/p067_triangle.txt"));
            int x=1; // x corresponds to the line you are reading
            for(int a = 0; a < 100; a++)
            {
                for(int b = 0; b < x; b++)
                {
                    if(input.hasNextInt())
                    {
                        triangle[a][b] = input.nextInt();
                    }
                }
                x = x + 1; // x goes up as you go to optimise the for loop
            }

        } catch (IOException e) {
            e.printStackTrace(); 
            // handle exception correctly.
        }
    
    }

    static int[][] triangle2 = { //first tried without read the triangle from the file and with a small one 
        {59},
        {73,41},
        {52,40,9},
        {26,53,6,34}
    };
}