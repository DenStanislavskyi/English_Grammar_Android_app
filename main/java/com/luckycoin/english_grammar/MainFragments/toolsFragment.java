package com.luckycoin.english_grammar.MainFragments;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.luckycoin.english_grammar.Main;
import com.luckycoin.english_grammar.R;
import java.util.Calendar;
public class toolsFragment extends Fragment implements View.OnClickListener {
    Button notif,cancel;
    Intent intent;
    Snackbar snackbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.toolsfragment, container, false);
        notif = (Button) view.findViewById(R.id.notif);
        notif.setOnClickListener(this);
        cancel = (Button) view.findViewById(R.id.cancel);
        cancel.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.notif:
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY,20);
        calendar.set(Calendar.MINUTE,23);
        Intent intent = new Intent(getActivity().getApplicationContext(),Notif_reciver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity().getApplicationContext(),20,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
     alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
                snackbar = Snackbar.make(view, "Notifications are set!",Snackbar.LENGTH_SHORT);
                snackbar.show();
                break;
            case R.id.cancel:
                 intent = new Intent(getActivity(), Notif_reciver.class);
                PendingIntent sender = PendingIntent.getBroadcast(getActivity().getApplicationContext(), 20, intent, PendingIntent.FLAG_CANCEL_CURRENT);
                 alarmManager = (AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
                alarmManager.cancel(sender);
                snackbar = Snackbar.make(view, "Notifications are canceled!",Snackbar.LENGTH_SHORT);
                snackbar.show();
                break;
            default:
                break;
    }
}

}