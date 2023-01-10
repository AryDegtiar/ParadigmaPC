package com.ary.paradigmapc.ui.AprendePC;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ary.paradigmapc.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AprendePc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AprendePc extends Fragment {

    ImageView proce,ram,mother,alma,video,fuente,monitor,gabinete,extras;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AprendePc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AprendePc.
     */
    // TODO: Rename and change types and number of parameters
    public static AprendePc newInstance(String param1, String param2) {
        AprendePc fragment = new AprendePc();
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
        View root = inflater.inflate(R.layout.fragment_aprende_pc, container, false);

        proce = root.findViewById(R.id.imgProce);
        ram = root.findViewById(R.id.imgRam);
        mother = root.findViewById(R.id.imgMother);
        alma = root.findViewById(R.id.imgAlma);
        video = root.findViewById(R.id.imgVideo);
        fuente = root.findViewById(R.id.imgFuente);
        monitor = root.findViewById(R.id.imgMonitor);
        gabinete = root.findViewById(R.id.imgGabinete);
        extras = root.findViewById(R.id.imgExtras);

        proce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeProcesador.class);
                startActivityForResult(intent, 0);
            }
        });
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeRam.class);
                startActivityForResult(intent, 0);
            }
        });
        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeMother.class);
                startActivityForResult(intent, 0);
            }
        });
        alma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeAlmacenamiento.class);
                startActivityForResult(intent, 0);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendePlaVideo.class);
                startActivityForResult(intent, 0);
            }
        });
        fuente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeFuente.class);
                startActivityForResult(intent, 0);
            }
        });
        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeMonitor.class);
                startActivityForResult(intent, 0);
            }
        });
        gabinete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeGabinete.class);
                startActivityForResult(intent, 0);
            }
        });
        extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AprendeExtras.class);
                startActivityForResult(intent, 0);
            }
        });

        return root;
    }
}