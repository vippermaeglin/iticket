package me.iticket.android.singleton;

import android.content.Context;
import me.iticket.android.dto.EventDTO;

/**
 * Created by Vinicius Arruda on 09/12/2016.
 */

public class DataHolder {
    private static DataHolder dataHolder = new DataHolder();
    private Context context;
    private EventDTO event;

    public static DataHolder getInstance()
    {
        return dataHolder;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public EventDTO getEvent() {
        return event;
    }

    public void setEvent(EventDTO event) {
        this.event = event;
    }
}
