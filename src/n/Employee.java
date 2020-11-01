package n;

public class Employee {
    private String name;
    private int id;
    private Address address;
    private Insurance insurance;

    public Employee(String name, int id, Address address, Insurance insurance) {
        setName(name);
        setId(id);
        setAddress(address);
        setInsurance(insurance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

  /*  private static void selectionSort(double weights[])
    {
        double smallest, temp;
        int sub;

        for (int i = 0; i<weights.length-1;i++)
        {//loop to find the smallest of weights[i],.. weights[9] and note its subscript
            smallest = weight[i];
            sub = i;

            for(int j =i+1; j<weights.length;j++)
                if(weights[j] < smallest)
                {
                    smallest = weights[j];
                    sub = j;
                }
            temp = weights[i];
                weights[i] = weights[sub];
                weights[sub]=temp;
        }
    }*/


    public String toString() {
        String Ins="";
        if(getInsurance()==null)
           Ins += "No insurance details";
        else
            Ins += getInsurance();

        return   "Name : " + getName() +
                " Id: " + getId() + "\n"+
                " Address : " + getAddress() + "\n" +
                " Insurance : " + Ins;


    }
}
