/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystringlist;

/**
 *
 * @author mena
 */
public class MyStringList {

    private final int Il = 4;
    private String[] strArray;
    private int size;

    public MyStringList() // constructor
    {
        strArray = new String[Il];  // create the array  
        size = 0;
    }

    public void add(String s) {
        strArray[size] = new String(s);
        size++;
    }

    public void get(int index) {     // find specified value
        for (int j = 0; j < size; j++) // for each element,
        {
            if (index >= 0 && index < size) // gone to end?
            {
                System.out.println(strArray[size]);
            } else {
                System.out.println("null"); // no, found it
            }              // end find()
        }
    }

    public boolean find(String s) {
        int j;
        for (j = 0; j < size; j++) // for each element,
        {
            if (strArray[j].equals(s)) // found item?
            {
                return true;
            }
        }
        return false;
    }

    public void insert(String s, int pos) {
        for (int i = (size - 1); i >= (pos - 1); i--) {
            strArray[i + 1] = strArray[i];
        }
        strArray[pos - 1] = s;
        size++;
    }

    public boolean remove(String s) {
        int j;
        for (j = 0; j < size; j++) // look for it
        {
            if (strArray[j].equals(s)) {
                break;
            }
        }
        if (j == size) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < size; k++) // shift down
            {
                strArray[k] = strArray[k + 1];
            }
            size--;                       // decrement size
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < size; j++) // for each element,
        {
            System.out.print(strArray[j] + " ");
        }
    } // Display all the elements in the array

    public static void main(String args[]) {
        MyStringList obj = new MyStringList();
        obj.add("menna");
        obj.add("hello");
        obj.insert("hi", 1);
        obj.display();
        obj.remove("menna");
        obj.display();
       String searchKey = "Stimson"; 
      if(obj.find(searchKey) != false)
          System.out.println("Found ");   
      else
         System.out.println("Can't find " + searchKey);

    }

}
