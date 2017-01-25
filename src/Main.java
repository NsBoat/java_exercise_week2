/**
 * Created by apple on 1/25/17.
 */
public class Main {
    private AddressBook addressBook = new AddressBook();
    private String name;
    private String phone;
    private String email;

    public void addEntry(String name, String phone, String email){
        AddressBookEntry newEntry = new AddressBookEntry(name, phone, email);
        addressBook.addAddress(newEntry);
    }

    public void searchByName(String name){
        addressBook.searchAddressByName(name);
    }

    private Integer inputSelection(){
        Input in = new Input();
        System.out.print("Please select: ");
        int i = in.nextInt();
        return i;
    }

    private void inputData(){
        Input in = new Input();
        System.out.print("Input name: ");
        name = in.nextLine();
        System.out.print("Input phone: ");
        phone = in.nextLine();
        System.out.print("Input email: ");
        email = in.nextLine();
    }

    private String inputSearchName(){
        System.out.print("input name: ");
        Input in = new Input();
        String newName = in.nextLine();
        return newName;
    }

    public static void main(String []args){
        Main object = new Main();
        while (true){
            int state = object.inputSelection();
            if (state == 1){
                object.inputData();
                object.addEntry(object.name, object.phone, object.email);
            }
            else if (state == 2){
                String searchName = object.inputSearchName();
                object.searchByName(searchName);
            }
            else {break;}

        }
    }

}
