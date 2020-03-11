package observer.youtube;

import observer.Observer;

class UserYouTube implements Observer {

    private String username;
    private int newVideosToWatch;

    UserYouTube(String username) {
        this.username = username;
        this.newVideosToWatch = 0;
    }

    @Override
    public void update(Object o) {
        newVideosToWatch++;
        System.out.println("Hey " + username + ". There is new video " + o.toString() + ". You have " + newVideosToWatch + " video to watch.");
    }
}
