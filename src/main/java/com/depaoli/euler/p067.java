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

    public static String MaxPathSum() {

        int[][] triangle = new int[100][100];

        readTriangle(triangle);
        //printTriangle(triangle);
       // System.out.println(Integer.toString(triangle.length));
       // System.out.println(Integer.toString(triangle[99].length));
    
        for (int i = triangle.length - 2; i >=0; --i) { // triangle.length gives me the number of rows //numero di somme che deve fare for esempio la prima riga ne avra solo una perchè la riga sotto hja solo due elementi da confrondqtar
			
            for (int j = 0; j < triangle[i].length - 1; ++j) {// triangle[i].length gives me the lenght of that row (number of columns)
                                                        
            triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]); 
            
            }
		}

		return Integer.toString(triangle[0][0]); //return the max path sum that is in the [0][0] position

    }

    public static void readTriangle(int[][] triangle) {

        try {
            // read in the data
            Scanner input = new Scanner (new File("/Users/alessiodepaoli/ProjectEuler-2022/txt-files/p067_triangle.txt"));
            int x=1;
            for(int a = 0; a < 100; a++)
            {
                for(int b = 0; b < x; b++)
                {
                    if(input.hasNextInt())
                    {
                        triangle[a][b] = input.nextInt();
                        //System.out.println(Integer.toString(triangle[i][j]));
                    }
                }
                x = x + 1;
                //System.out.println("/n");
                
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