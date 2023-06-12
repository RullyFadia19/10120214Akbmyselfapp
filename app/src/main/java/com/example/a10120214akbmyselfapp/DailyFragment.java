package com.example.a10120214akbmyselfapp;
//NIM : 10120214 Nama : Rully fadia Kelas: IF-6

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.a10120214akbmyselfapp.R;
import java.util.ArrayList;

public class DailyFragment extends Fragment {

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        //daily
        recyclerViewDaily = root.findViewById(R.id.recyclerView);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.sleeping, "Sleeping", "Istirahat");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.movie, "Watch a Movie", "Menonton Film");
        dailyModel.add(daily2);
        DailyModel daily4 = new DailyModel(R.drawable.belajar, "Study", "doing homework");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.makan, "Kuliner", "Makan-makan");
        dailyModel.add(daily5);

        recyclerViewDaily.setAdapter(new AdapterDaily(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.recyclerView2);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendModel fl1 = new FriendModel(R.drawable.diana, "Diana Rahmawati");
        friendlistModel.add(fl1);
        FriendModel fl2 = new FriendModel(R.drawable.mutia, "Mutia Aulia");
        friendlistModel.add(fl2);
        FriendModel fl3 = new FriendModel(R.drawable.rahma, "Rahma Yuniar");
        friendlistModel.add(fl3);
        FriendModel fl4 = new FriendModel(R.drawable.alya, "Alya Salsabila");
        friendlistModel.add(fl4);
        FriendModel fl5 = new FriendModel(R.drawable.sari, "Purnama Sari");
        friendlistModel.add(fl5);
        FriendModel fl6 = new FriendModel(R.drawable.opik, "Rofida Ayu Ningsih");
        friendlistModel.add(fl6);
        FriendModel fl7 = new FriendModel(R.drawable.dini, "Andini Agustin");
        friendlistModel.add(fl7);

        recyclerViewFriendlist.setAdapter(new AdapterFriend(friendlistModel));

        return root;
    }
}