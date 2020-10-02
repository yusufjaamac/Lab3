import java.util.*;
//yj
public class AddressBook {
    private ArrayList<BuddyInfo>buds;


    public AddressBook(){
        buds = new ArrayList();
    }

     public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy!=null) {
            buds.add(aBuddy);

        }
    }

    public BuddyInfo removeBuddy(int index){

        if(index>=0 && index < buds.size()){
            return buds.remove(index);

        }
        return null;
    }


    public static void main(String[] args){
        //BuddyInfo buddy = new BuddyInfo("yusuf",612321,"carleton");
        System.out.println("Address Book");
    }
}
