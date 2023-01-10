package com.ary.paradigmapc.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido a Paradigma PC una aplicación creada para que todo el mundo pueda tener la mejor pc con el mejor rendimiento, " +
                "con ella podés saber que componentes necesita tu PC, hay muchas más combinaciones de PC pero estas son las elegidas "+
                "bajo nuestro criterio.\n" + "Todo lo que necesita una PC está en el apartado \"Elige tu PC\", es muy recomendable ir a la sección \"Aprende de las PCs\" para " +
                "entender que es lo que queres comprar");
    }

    public LiveData<String> getText() {
        return mText;
    }
}