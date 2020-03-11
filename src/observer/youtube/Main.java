package observer.youtube;

class Main {

    public static void main(String[] args) {

        ChannelYouTube channelMusic = new ChannelYouTube(1, "Music");
        UserYouTube user1 = new UserYouTube("John");
        channelMusic.register(user1);

        System.out.println("New video in " + channelMusic.getName() + " channel id=" + channelMusic.getId() );
        channelMusic.notifyAllObservers();

        UserYouTube user2 = new UserYouTube("Stefan");
        channelMusic.register(user2);

        System.out.println("New video in Music channel id=" + channelMusic.getId());
        channelMusic.notifyAllObservers();

        ChannelYouTube channelSport = new ChannelYouTube(2, "Sport");
        UserYouTube userSport1 = new UserYouTube("Kazik");
        UserYouTube userSport2 = new UserYouTube("Wacek");
        UserYouTube userSport3 = new UserYouTube("Jerzyk");
        channelSport.register(userSport1);
        channelSport.register(userSport2);
        channelSport.register(userSport3);

        System.out.println("New video in Sport Channel");
        channelSport.notifyAllObservers();
        System.out.println("New video in Sport Channel");
        channelSport.notifyAllObservers();

    }
}
