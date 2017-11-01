package me.iticket.android.singleton;

import android.content.Context;

import java.util.ArrayList;

import me.iticket.android.activity.MainActivity;
import me.iticket.android.dto.EventDTO;
import me.iticket.android.dto.TicketDTO;
import me.iticket.android.dto.TransactionDTO;
import me.iticket.android.util.Statics;

/**
 * Created by Vinicius Arruda on 09/12/2016.
 */

public class DataHolder {
    private static DataHolder dataHolder = new DataHolder();
    private Context context;
    private EventDTO event;
    private String employee = "DESCONHECIDO";
    private Object currentTicketOrTransaction = null;

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

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Object getCurrentTicketOrTransaction() {
        return currentTicketOrTransaction;
    }

    public void setCurrentTicketOrTransaction(Object currentTicketOrTransaction) {
        this.currentTicketOrTransaction = currentTicketOrTransaction;
    }

    public boolean saveTicket(final TicketDTO ticket){
        try {
            //Try to find an existent transaction
            for(TransactionDTO transaction:event.getTransactions()){
                if(transaction.getId().equals(ticket.getTransactionId())){
                    for(TicketDTO t : transaction.getTickets()){
                        if(t.getId().equals(ticket.getId())){
                            if(t.getStatus().equals(Statics.TicketStatus.PENDENT)) {
                                t.merge(ticket);
                                transaction.setUpdateServer(true);
                                transaction.setUpdateClient(true);
                                MainActivity.getInstance().saveOnDatabase("event", event);
                                return true;
                            }
                            //ticket already validated!
                            else
                                return false;
                        }
                    }
                    //Transaction was found but ticket not exist yet (just add):
                    transaction.addTicket(ticket);
                    transaction.setUpdateServer(true);
                    transaction.setUpdateClient(true);
                    MainActivity.getInstance().saveOnDatabase("event", event);
                    return true;
                }
            }
            //Transaction dont exist yet:
            event.addTransaction(new TransactionDTO(ticket.getTransactionId(), event.getSuper(), null /*user*/, null/*products*/, null /*date*/, null/*totalValue*/,
                                        null/*discount*/, null/*payment*/, new ArrayList<TicketDTO>(){{add(ticket);}}, null/*employee*/, true, true));
            MainActivity.getInstance().saveOnDatabase("event", event);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

}
