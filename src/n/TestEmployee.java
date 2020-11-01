package n;

import javax.swing.*;

public class TestEmployee {
    public static void main(String[] args) {

        Insurance insurance1 = new Insurance("Irish Life Excel",5468292);

        Employee employee1 = new Employee("Joseph Bloggs III",
                536272, new Address("123 Hyde Road", "Ballydehob", "Cork","Ireland","R54HT7D"),
                insurance1);

        Insurance insurance2 = new Insurance("AXA Superlative Life", 9374633);

        Employee employee2 = new Employee("Marie O Connell", 982111, new Address("Boreen na dTonnta", "Connemara", "Galway", "Ireland", "PG52K3B"),insurance2);

        Insurance insurance3 = new Insurance("LA Brokers Golden Goose", 7372642);
        Employee allEmployees[] = new Employee[5];

        Employee employee3 = new Employee("Mark Mc Manus", 352723, new Address("87 Racecourse Lawn", "Tralee", "Kerry", "Ireland", "AH78P36"), insurance3);


        allEmployees[0]=employee1;
        allEmployees[1]=employee2;
        allEmployees[2]=employee3;


        for(int i=0; i< allEmployees.length;i++)
        {
            JOptionPane.showMessageDialog(null,
                 "Displaying the state of the 5 employee objects at this point\n" +
                          "Employee" + (i+1) + "\n\n" +
                        allEmployees[i] + "\n\n", "title",
                JOptionPane.INFORMATION_MESSAGE);
        }

        for(int i=0; i< allEmployees.length;i++)
        {
            if(i==0) {
                JOptionPane.showMessageDialog(null, "Now searching through the " +
                        "array of Employee objects to find any employees whose name contains the word " +
                        "'joseph' ", "title", JOptionPane.INFORMATION_MESSAGE);
            }
            if(allEmployees[i].getName().toLowerCase().contains("joseph"))
            {
                JOptionPane.showMessageDialog(null,allEmployees[i],"Joseph",
                        JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null, "Now changing the address of Joseph Bloggs III",
                    "title", JOptionPane.INFORMATION_MESSAGE);

                allEmployees[i].setAddress(new Address("56 Main Street", "Thurles", "Tipperary",
                        "Ireland", "B87JH5Q"));

                JOptionPane.showMessageDialog(null,allEmployees[i],"Joseph",
                        JOptionPane.INFORMATION_MESSAGE);


             }

            JOptionPane.showMessageDialog(null,"Now removing the insurance " +
                            "details completely for the second employee object", "title",
                    JOptionPane.INFORMATION_MESSAGE);

            allEmployees[1].setInsurance(null);

            JOptionPane.showMessageDialog(null, allEmployees[1],"Remove",JOptionPane.INFORMATION_MESSAGE
            );

            JOptionPane.showMessageDialog(null, "Displaying the state of the second employee insurance object now gives\n\n" + allEmployees[1].getInsurance() ,"Remove",JOptionPane.INFORMATION_MESSAGE
            );

        }

        for(int i=0; i< allEmployees.length;i++)
        if(allEmployees[i]!=null && allEmployees[i].getAddress().getCounty().toLowerCase().contains("Kerry"))

            JOptionPane.showMessageDialog(null, "Displaying the state of all employees who hail from county Kerry\n\n" + allEmployees[i] ,"Remove",JOptionPane.INFORMATION_MESSAGE
            );

        Insurance insurance4 = new Insurance("LA Brokers Golden Goose", 7372642);

        Employee employee4 = new Employee("Lara Conolly", 568554, new Address("12 Westbrook Drive ", "Trim", "Meath", "Ireland", "78TYMDS"), insurance4);

        Insurance insurance5 = new Insurance("LA Brokers Golden Goose", 7372642);

        Employee employee5 = new Employee("Mark Mc Manus", 352723, new Address("87 Racecourse Lawn", "Tralee", "Kerry","Ireland", "AH78P36"), insurance5);


    }
    private static void sortEmployeesByName(Employee[] allEmployees)
    {
        String SmallestName;
        int SmallestSub;
        Employee temp;

        for(int i=0; i< allEmployees.length-1; i++)
        {

        }



    }
}
