package com.example.mattstart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mattstart.databinding.FragmentMenuDivisionBinding;
import com.example.mattstart.databinding.FragmentMenuMultiplicacionBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuDivision#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuDivision extends Fragment {
    private FragmentMenuDivisionBinding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuDivision() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuDivision.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuDivision newInstance(String param1, String param2) {
        MenuDivision fragment = new MenuDivision();
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
        binding = FragmentMenuDivisionBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttonCasaClicked(v); }
        });
        binding.exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttonexpClicked(v); }
        });
        binding.graficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttongraficosClicked(v); }
        });
        binding.simples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { buttonsimplesClicked(v); }
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
    public void buttonexpClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new DivisionExplicacion();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
    public void buttongraficosClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new DivisionGraficos();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
    public void buttonsimplesClicked(View view){
        // Create new fragment and transaction
        Fragment newFragment = new DivisionSimples();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.Menu, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
}