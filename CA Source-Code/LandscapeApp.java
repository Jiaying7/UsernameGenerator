/*
*LandscapeApp.java
*22/11/2022
*@Jiaying Yu
*/

import javax.swing.JOptionPane;

public class LandscapeApp {
    public static void main(String[] args) {
        //declare variables
        String name, show;
        int time = 0;
        int etime;
        String day = null;
        int counter = 0;

        //declare and create objects
        Landscape[] arr = new Landscape[7];
        int exe = arr.length;

        //input
        do{
            time = Integer.parseInt(JOptionPane.showInputDialog(null,"Landscape Project - item type: time \n1 - Add an item\n2 - Display the details of the first entered item\n3 - Display the details of the last entered item\n4 - Calculate and display the average value of the mandatory state of all the items entered until that point\n5 - Calculate and display the item with the highest mandatory state\n6 - Exit application"));
        }while (time < 1 || time > 6);
        JOptionPane.showMessageDialog(null,time);
        if (time == 1) {
            name = JOptionPane.showInputDialog(null, "Please enter the name of the landscape project");

            do {
                etime = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the estimated execution time"));
                System.out.println("Show the item1");
            } while (etime < 1 || etime > 6);
            day = JOptionPane.showInputDialog(null, "Please enter the actual execution day1");
            System.out.println("Show the item2");

            //process
            Landscape myL = new Landscape(name, etime, day);
            arr[counter] = myL;
            counter++;
        }

        //output
        if (day.equals("2")){
            JOptionPane.showMessageDialog(null,day);
            if (exe > 0)
            JOptionPane.showMessageDialog(null,"Invalid item! Please enter in the correct item!");
        }else{
            arr[0].show();
        }
        if(day.equals("3")){
            if(exe > 0)
            JOptionPane.showMessageDialog(null,"Invalid item! Please enter in the correct item!");
        }else{
            arr[counter - 1].show();
        }
        JOptionPane.showMessageDialog(null,"Please start to calculate the average of the execution time in 'Operation' ");

        Operation operation = new Operation();
        operation.main(null);
    }
}