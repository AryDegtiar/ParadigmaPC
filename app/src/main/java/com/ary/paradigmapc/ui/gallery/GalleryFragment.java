package com.ary.paradigmapc.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ary.paradigmapc.R;

public class GalleryFragment extends Fragment {

    Button btn;
    CheckBox cbxGam,cbxArq,cbxProd,cbxEst,cbxOfi;

    private GalleryViewModel galleryViewModel;

    public void validar(View v){
        if (cbxProd.isChecked()){
            Intent intent = new Intent(v.getContext(), InfoPcProdu.class);
            startActivityForResult(intent, 0);
        }else if (cbxArq.isChecked()){
            Intent intent = new Intent(v.getContext(), InfoPcArqui.class);
            startActivityForResult(intent, 0);
        }else if (cbxGam.isChecked()){
            Intent intent = new Intent(v.getContext(), InfoPcGamming.class);
            startActivityForResult(intent, 0);
        }else if (cbxEst.isChecked()){
            Intent intent = new Intent(v.getContext(), InfoPcEstudio.class);
            startActivityForResult(intent, 0);
        }else if (cbxOfi.isChecked()){
            Intent intent = new Intent(v.getContext(), InfoPcOficina.class);
            startActivityForResult(intent, 0);
        }

    }

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        /*
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
         */

        cbxGam = root.findViewById(R.id.cbxGamming);
        cbxArq = root.findViewById(R.id.cbxArq);
        cbxProd = root.findViewById(R.id.cbxProd);
        cbxEst = root.findViewById(R.id.cbxEstudio);
        cbxOfi = root.findViewById(R.id.cbxOffice);

        btn = root.findViewById(R.id.btnSig);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar(v);
                /*
                Intent intent = new Intent(v.getContext(), InfoPcOficina.class);
                startActivityForResult(intent, 0);
                 */
            }
        });

        return root;
    }
}