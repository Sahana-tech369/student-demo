interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
}

class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}
