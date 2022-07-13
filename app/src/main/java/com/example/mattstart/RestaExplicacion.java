package com.example.mattstart;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mattstart.databinding.FragmentMenuRestaBinding;
import com.example.mattstart.databinding.FragmentRestaExplicacionBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaExplicacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaExplicacion extends Fragment {
    private FragmentRestaExplicacionBinding binding;
    public int limite=0;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestaExplicacion() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaExplicacion.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaExplicacion newInstance(String param1, String param2) {
        RestaExplicacion fragment = new RestaExplicacion();
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
        binding = FragmentRestaExplicacionBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.sonido2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explicacion();
            }
        });
        binding.casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCasaClicked(v);
            }
        });
        binding.miniresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonminirestaClicked(v);
            }
        });
    }
    public void onPause() {
        super.onPause();
        if(limite==1)
        MainActivity.player.stop();
    }
    public void buttonCasaClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new Menu();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
    public void buttonminirestaClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new MenuResta();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
    public void explicacion(){
        if(limite==0) {
            MainActivity.player = MediaPlayer.create(getContext(), R.raw.restaexp);
            MainActivity.player.setOnPreparedListener(MediaPlayer::start);
            MainActivity.player.setOnCompletionListener(MediaPlayer::release);
            limite++;
        }
        MainActivity.player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                limite--;
            }
        });
    }
}