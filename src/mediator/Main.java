package mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom=new ChatRoomImp();
        User user1=new BasicUser("user1",chatRoom);
        User user2=new BasicUser("user2",chatRoom);
        user1.sendmessage("Salamm");
        user2.sendmessage("Aleykumm");

    }
    //Burada chatroom bizim mediatorumuz yeni vasitecimizdi,biz onun vasitesi ile 2 user arasinda elaqe yaratdiq

}
