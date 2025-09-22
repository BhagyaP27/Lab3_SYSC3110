import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> friends;

    public AddressBook(){
        this.friends = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b){
        this.friends.add(b);
    }

    public void removeBuddy(BuddyInfo b){this.friends.remove(b);}

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", 20);
        AddressBook addressBook = new AddressBook();
        /* add another buddy */
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}


