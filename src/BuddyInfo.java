public class BuddyInfo {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }


    public static void main(String[] args){
        BuddyInfo dav = new BuddyInfo("dav",20);
        System.out.println("Hello world");
        System.out.println("my buddy " + dav.getName() + "is of age " + dav.getAge());

    }
}
