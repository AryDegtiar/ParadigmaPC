package com.ary.paradigmapc.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mi nombre es Ary Degtiar, soy un estudiante de Ingenieria en Sistemas de Informacion en la UTN y como hobbie reparo pc, ante la problematica de muchas personas de " +
                "no saber que componentes tiene que llevar una pc para su necesidad y presupuesto decidi hacer esta aplicacion. \n" +
                "Para mas informacion dejo mi pagina personal: arydegriar.cf");
    }

    public LiveData<String> getText() {
        return mText;
    }
}