import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> friends;

    public AddressBook(BuddyInfo b){
        this.friends = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b){
        this.friends.add(b);
    }

    public void removeBuddy(BuddyInfo b){this.friends.remove(b);}

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}

