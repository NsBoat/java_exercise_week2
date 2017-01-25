/**
 * Created by apple on 1/24/17.
 */
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<AddressBookEntry> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<AddressBookEntry>();
    }

    public void addAddress(AddressBookEntry entry){ addressBook.add(entry); }

    public String searchAddressByName(String name){
        for (AddressBookEntry element : addressBook){
            if (element.getName().equals(name)){
                System.out.println(element.getEmail());
                return element.getEmail();
            }
        }
        System.out.println("Object not found");
        return null;
    }

    private void removeEntry(String name){
        AddressBook i = new AddressBook();
        for (AddressBookEntry element : addressBook){
            if (element.getName() == name){
                addressBook.remove(element);
            }
        }

    }
}
