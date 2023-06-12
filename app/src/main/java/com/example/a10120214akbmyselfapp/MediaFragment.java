package com.example.a10120214akbmyselfapp;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MediaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MediaFragment extends Fragment {

    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<MediaModel> favoriteModel;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MediaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MediaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MediaFragment newInstance(String param1, String param2) {
        MediaFragment fragment = new MediaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_media, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recyclerViewMusic);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        favoriteModel = new ArrayList<>();

        MediaModel music1 = new MediaModel(R.drawable.jeremy, "Oh, Mexico", "Jeremy Zucker");
        favoriteModel.add(music1);
        MediaModel music2 = new MediaModel(R.drawable.dodie, "Would You Be So Kind", "Dodie");
        favoriteModel.add(music2);
        MediaModel music3 = new MediaModel(R.drawable.alecbenjamin, "Let Me Down Slowly", "Alec Benjamin");
        favoriteModel.add(music3);
        MediaModel music4 = new MediaModel(R.drawable.ansonseabra, "Broken", "Anson Seabra");
        favoriteModel.add(music4);

        recyclerViewMusic.setAdapter(new AdapterMedia(favoriteModel));
        //video
        VideoView Videoview = root.findViewById(R.id.video_fav);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.jer_comethru;
        Uri uri = Uri.parse(videoPath);
        Videoview.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        Videoview.setMediaController(mediaController);
        mediaController.setAnchorView(Videoview);

        return root;
    }
}
