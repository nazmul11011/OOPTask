package PracticeProblem06;

public class Publisher {
    int Id;
    String Name;
    String Address;
    int PhoneNo;

    public Publisher(int id, String name, String address, int phone) {
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.PhoneNo = phone;
    }

    public void AddPub() {
        System.out.println("Publisher added.");
    }

    public void ModifyPub() {
        System.out.println("Publisher details modified.");
    }

    public void DeletePub() {
        System.out.println("Publisher deleted.");
    }

    public void OrderStatus() {
        System.out.println("Order status checked.");
    }
}