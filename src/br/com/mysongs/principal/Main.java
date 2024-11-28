package br.com.mysongs.principal;

import br.com.mysongs.modelos.Music;
import br.com.mysongs.modelos.MyFavorites;
import br.com.mysongs.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Music mymusic = new Music();
        mymusic.setTitulo("Wonderwall");
        mymusic.setArtista("Oasis");

        for (int i = 0; i < 1000; i++) {
            mymusic.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            mymusic.curte();

        }

        Podcast mypodcast = new Podcast();
        mypodcast.setTitulo("PodcafeTI");
        mypodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 200; i++) {
            mypodcast.reproduz();
            
        }

        for (int i = 0; i < 1000; i++) {
            mypodcast.curte();

        }

        MyFavorites favorites = new MyFavorites();
        favorites.inclui(mypodcast);
        favorites.inclui(mymusic);

    }


}
