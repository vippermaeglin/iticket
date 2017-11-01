package me.iticket.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

import me.iticket.android.R;
import me.iticket.android.dto.UserDTO;
import me.iticket.android.singleton.DataHolder;

/***
 * https://www.codexpedia.com/android/android-save-and-retrieve-object-in-couchbase-lite/
 * https://stackoverflow.com/a/39544594/6031284
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHolder.getInstance().setContext(getApplicationContext());
        DataHolder.getInstance().initializeDB();
        
        UserDTO user = createUser();
        boolean save = DataHolder.getInstance().saveOnDatabase("User", user);
        UserDTO getUser = (UserDTO) DataHolder.getInstance().getFromDatabase("User", UserDTO.class);
    }

    private UserDTO createUser(){
        UserDTO user = new UserDTO();
        user.setId("012345678901234567890123");
        user.setCreatedAt(new Date());
        user.setName("Jack");
        user.setBornDate(new Date());
        user.setGender("M");
        user.setCellphone("+55(31)99999-9999");
        user.setCpf("01234567890");
        user.setEmail("e@email.com");
        user.setDailyPoints(100);
        user.setDeviceType("ANDROID");
        user.setFacebookId("12345678912345678912345");
        user.setGplusId("12345678912345678912345");
        return user;
    }
}
