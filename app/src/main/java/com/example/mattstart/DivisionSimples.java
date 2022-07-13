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
import android.widget.Toast;

import com.example.mattstart.databinding.FragmentDivisionExplicacionBinding;
import com.example.mattstart.databinding.FragmentDivisionSimplesBinding;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DivisionSimples#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DivisionSimples extends Fragment {
    private FragmentDivisionSimplesBinding binding;
    public Random rnd = new Random();
    public int num1,num2,num3,num4,num5,num6;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DivisionSimples() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DivisionSimples.
     */
    // TODO: Rename and change types and number of parameters
    public static DivisionSimples newInstance(String param1, String param2) {
        DivisionSimples fragment = new DivisionSimples();
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
        binding = FragmentDivisionSimplesBinding.inflate(inflater,container,false);
        num1=rnd.nextInt(20-1)+1;
        num2=rnd.nextInt(20-1)+1;
        while(num1<num2){
            num2=rnd.nextInt(20-1)+1;
        }
        num3=rnd.nextInt(20-1)+1;
        num4=rnd.nextInt(20-1)+1;
        while(num3<num4){
            num4=rnd.nextInt(20-1)+1;
        }
        num5=rnd.nextInt(20-1)+1;
        num6=rnd.nextInt(20-1)+1;
        while(num5<num6){
            num6=rnd.nextInt(20-1)+1;
        }
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.textView10.setText(num1+"    ÷   "+num2+"=");
        binding.textView11.setText(num3+"   ÷   "+num4+"=");
        binding.textView12.setText(num5+"   ÷   "+num6+"=");
        binding.generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generar();
            }
        });
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado1();
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado2();
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado3();
            }
        });
        binding.casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttonCasaClicked(v); }
        });
        binding.minidivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttonminidiviClicked(v); }
        });
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
    public void buttonminidiviClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new MenuDivision();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
    public void resultado1(){
        int res=num1/num2;
        if(!binding.respuesta1.getText().toString().isEmpty()) {
            if (Integer.parseInt(binding.respuesta1.getText().toString()) == res) {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.correcto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Correcto!!,bien hecho", Toast.LENGTH_LONG).show();
            } else {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.incorrecto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Incorrecto,no te preocupes sigue intentando", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void resultado2(){
        int res=num3/num4;
        if(!binding.respuesta2.getText().toString().isEmpty()) {
            if (Integer.parseInt(binding.respuesta2.getText().toString()) == res) {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.correcto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Correcto!!,bien hecho", Toast.LENGTH_LONG).show();
            } else {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.incorrecto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Incorrecto,no te preocupes sigue intentando", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void resultado3(){
        int res=num5/num6;
        if(!binding.respuesta3.getText().toString().isEmpty()) {
            if (Integer.parseInt(binding.respuesta3.getText().toString()) == res) {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.correcto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Correcto!!,bien hecho", Toast.LENGTH_LONG).show();
            } else {
                MainActivity.player = MediaPlayer.create(getContext(), R.raw.incorrecto);
                MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getContext(), "Incorrecto,no te preocupes sigue intentando", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void generar(){
        // Create new fragment and transaction
        Fragment newFragment = new DivisionSimples();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        // Commit the transaction
        transaction.commit();
    }
}