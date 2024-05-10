package mediator;

public class ChatRoomImp implements ChatRoom{

    @Override
    public void sendmessage(String message, User user) {
        System.out.println(user.getName()+"send you a "+message);
    }
}
