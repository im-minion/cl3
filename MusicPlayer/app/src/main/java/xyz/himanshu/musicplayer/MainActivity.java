package xyz.himanshu.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private final String[] listContent = {
            "Bass Song",
            "Drum Song",
            "Bass Song 2",
            "Bass Song 3",
            "Drum Song 2"
    };
    private final int[] resID = {
            R.raw.bas_loop,
            R.raw.drumloop,
            R.raw.bas_loop,
            R.raw.drumloop
    };
    ListView songsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    private void bindView() {
        mediaPlayer = new MediaPlayer();
        songsList = (ListView) findViewById(R.id.list_view_songs);
        setupList(songsList);
    }

    private void setupList(ListView mainList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listContent);
        mainList.setAdapter(adapter);
        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                playSong(position);
            }
        });
    }

    public void playSong(int position) {
        mediaPlayer.reset();
        mediaPlayer = MediaPlayer.create(MainActivity.this, resID[position]);
        Toast.makeText(this, "Played song at position " + (position + 1), Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
        Toast.makeText(this, "Music Player Terminated", Toast.LENGTH_SHORT).show();

    }
}
