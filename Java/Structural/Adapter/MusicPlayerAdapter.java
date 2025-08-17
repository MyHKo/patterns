class MusicPlayerAdapter implements MusicPlayer {
    AdvancedMediaPlayer player = new AdvancedMediaPlayer();

    @Override
    public void play(String fileName) {
        player.playMP3(fileName);
    }
}