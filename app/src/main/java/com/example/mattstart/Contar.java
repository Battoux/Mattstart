package com.example.mattstart;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mattstart.databinding.FragmentContarBinding;
import com.example.mattstart.databinding.FragmentMenuDivisionBinding;

import java.util.function.Function;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Contar#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Contar extends Fragment {
    private FragmentContarBinding binding;
    public int limitar=0;
    final Handler handler = new Handler();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Contar() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Contar.
     */
    // TODO: Rename and change types and number of parameters
    public static Contar newInstance(String param1, String param2) {
        Contar fragment = new Contar();
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
        binding = FragmentContarBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnComenzar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void onClick(View view) {

                    comenzar();

            }
        });
        binding.casac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCasaClicked(v);
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacksAndMessages(null);
    }

    public void buttonCasaClicked(View view) {
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

    @RequiresApi(api = Build.VERSION_CODES.P)
    public void comenzar() {
        if(limitar==0) {
            limitar=1;
            binding.car1.setVisibility(View.VISIBLE);
            binding.Numtxt.setText("1");
            MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz1);
            MainActivity.player.setOnPreparedListener(MediaPlayer::start);
            MainActivity.player.setOnCompletionListener(MediaPlayer::release);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car2.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("2");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz2);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 3000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car3.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("3");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz3);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 6000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car4.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("4");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz4);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 9000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car5.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("5");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz5);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 12000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car6.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("6");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz6);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 15000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car7.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("7");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz7);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 18000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car8.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("8");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz8);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 21000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car9.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("9");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz9);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 24000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car10.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("10");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz10);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 27000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car11.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("11");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz11);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 30000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car12.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("12");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz12);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 33000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car13.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("13");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz13);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 36000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car14.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("14");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz14);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 39000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car15.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("15");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz15);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 42000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car16.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("16");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz16);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 45000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car17.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("17");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz17);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 48000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car18.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("18");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz18);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 51000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car19.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("19");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz19);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 54000);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    binding.car20.setVisibility(View.VISIBLE);
                    binding.Numtxt.setText("20");
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.voz20);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                }
            }, 57000);
        }
    }
}