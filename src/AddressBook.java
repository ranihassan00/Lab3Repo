import java.util.ArrayList;
public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy){
        if (buddy!= null) {
            buddyList.add(buddy);
        }
    }
    public void removeBuddy(BuddyInfo buddy){
        buddyList.remove(buddy);
    }



    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo bud = new BuddyInfo("Rami");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(bud);
        addressBook.removeBuddy(bud);
        System.out.println(addressBook);
    }
}
