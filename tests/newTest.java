package tests;
import java.util.*;
public class newTest {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     char a[][] = new char[n][m];
     String s = "";
     int charPos = 0;
        int startx = 0;
        int starty = 0;
        int reachx = 0;
        int reachy = 0;
     
     for(int j = 0;j<n;j++) {
         s = sc.next();
         charPos = 0;
         for(int k =0;k<m;k++) {
             
             a[j][k] = s.charAt(charPos);
             charPos++;
             if(a[j][k] == 'S') {
                 startx = j;
                 starty = k;
             }
             if(a[j][k] == 'T') {
                 reachx = j;
                 reachy = k;
             }
            }
        }
     int result = shortestPath(a, startx, starty, reachx, reachy);   
        if(result >= 10000) {
            System.out.println("DOOMED");
        }
        else
            System.out.println(result);
    }
    
    public static int shortestPath(char a[][], int i, int j, int x, int y) {
        int rows = a.length;
        int cols = a[0].length;
        
        boolean visited[][]  = new boolean[rows][cols];
        
        return shortestPath(a, i, j, x, y, visited);
        
    }
    static int count = 0;
    public static boolean pathValid(char a[][], int i, int j, boolean visited[][]) {
        int rows = a.length;
        int cols = a[0].length;
        
        if(i >= 0 && j >= 0 && i < rows && j < cols && !visited[i][j]) {
            if(count == 0 && a[i][j] == 'S') {
                count++;
                return true;
                
            }
            if(a[i][j] == '.') {
                return true;
            }
        }
            
        return false;
    }
    

    public static int shortestPath(char a[][], int i, int j, int x, int y, boolean visited[][]) {
        
        if(!pathValid(a, i, j, visited)) {
            return 10000;
        }
        
        if( i == x && j == y) {
            return 10000;
        }
        
        visited[i][j] = true;
        
        int left = shortestPath(a, i, j-1, x, y, visited)+1;
        int bottom = shortestPath(a, i+1, j, x, y, visited)+1;
        int right = shortestPath(a, i, j+1, x, y, visited)+1;
        int top = shortestPath(a, i-1, j, x, y, visited)+1;
        
        visited[i][j] = false;
        
        return Math.min(Math.min(left, bottom), Math.min(right, top));
        
    }
    
 }

