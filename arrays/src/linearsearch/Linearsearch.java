package linearsearch;
//Algorithm:

//Step 1: Tra verse the array
//Step 2: Match the key element with array element
//Step 3: If key element is found, return the index position of the array element
//Step 4: If key element is not found, return -1
public class Linearsearch 
{
	public static int linearSearch(int[] a, int key){    
        for(int i=0;i<a.length;i++){    
            if(a[i] == key){    
                return i;    
            }    
        }    
        return 0 ;    
    }    
    public static void main(String a[]){    
        int[] a1= {100,200,300,450,789,790};    
        int key1 = 300; 
        int key2 = 200;
        System.out.println(key1+" is found at index: "+linearSearch(a1, key1));
        System.out.println(key2+" is found at index: "+linearSearch(a1, key2));
    }    
}
