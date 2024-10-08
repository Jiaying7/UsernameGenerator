/*
*LandscapeApp.java
*22/11/2022
*@Jiaying Yu
*/

import javax.swing.*;
public class Operation {
    public static void main(String[] args) {
        //declare variables
        String name;
        int time = 0;
        int first = 0;
        int last = 0;
        int day = 0;
        Landscape[] arr = new Landscape[7];

        //input
        do{
            day = Integer.parseInt(JOptionPane.showInputDialog(null,"Landscape Project - item type: time \n1 - Add an item\n2 - Display the details of the first entered item\n3 - Display the details of the last entered item\n4 - Calculate and display the average value of the mandatory state of all the items entered until that point\n5 - Calculate and display the item with the highest mandatory state\n6 - Exit application"));
        }while(day!=4);

        if (day == 4){
            do {
                first = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter in the first expected execution day"));
                last = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter in the second actual execution day"));
                System.out.println(first);
                System.out.println(last);
            }while (day < 2 || 42 < day);
            try {
                JOptionPane.showMessageDialog(null,"the average of the execution day is: " + (first+last)/2*1.0);
            }catch (Exception e){
                System.out.println("Exception");
            }
            day = Integer.parseInt(JOptionPane.showInputDialog(null,"show the highest mandatory state"));

        }if(day == 5){
            if (last>first){
                JOptionPane.showMessageDialog(null,last);
            }else if(last<first){
                JOptionPane.showMessageDialog(null,first);
            }else {
                JOptionPane.showMessageDialog(null,first);
            }
            time = Integer.parseInt(JOptionPane.showInputDialog(null,"Calculate and display the highest value of the last mandatory state"));
        }

        //output
        if (day == 6){
            JOptionPane.showMessageDialog(null,"Exit the app");
        }
     }
}
