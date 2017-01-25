/**
 * Created by apple on 1/24/17.
 */
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<AddressBookEntry> emailAddressBook;

    public AddressBook(){
        emailAddressBook = new ArrayList<AddressBookEntry>();
    }

    public void addAddress(AddressBookEntry entry){ emailAddressBook.add(entry); }

    public String searchAddressByName(String name){
        for (AddressBookEntry element : emailAddressBook){
            if (element.getName() == name){
                return element.getEmail();
            }
        }
    }

    private void removeEntry(String name){
        private AddressBook i = new AddressBook();
        for (AddressBookEntry element : emailAddressBook){
            if (element.getName() == name){
                emailAddressBook.remove(element);
            }
        }

    }
}
