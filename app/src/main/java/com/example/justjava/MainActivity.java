package com.example.justjava;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Handler mHandler = new Handler();
    TextView mainTextView;
    String temporaryText;
    String TextThatWillBeWrited;
    List text;
    List<String> story = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = (TextView) findViewById(R.id.mainTextView);

        String nameKitten = getIntent().getExtras().getString("name_cat1");
        int ageKitten = getIntent().getExtras().getInt("age_cat1");
        String namingDog1 = getIntent().getExtras().getString("name_dog1");
        int ageDog1 = getIntent().getExtras().getInt("age_dog1");
        String namingDog2 = getIntent().getExtras().getString("name_dog2");
        int ageDog2 = getIntent().getExtras().getInt("age_dog2");

        Animal c = new Cat(ageKitten,nameKitten);
        Animal d1 = new Dog(ageDog1,namingDog1);
        Animal d2= new Dog(ageDog2,namingDog2);

        story.add("А вот тепееееерь");
        story.add(c.Life());
        story.add(d1.Life());
        story.add(d2.Life());
        story.add("И начнем мы с того что как-то раз "+ namingDog1+ " и "+ namingDog2 +" игрались во дворе");
        story.add("в один момент они увидели кошака который бежал куда-то ");
        story.add("собсна они конечно-же побежали за ним");
        story.add("ну и они прибежали к дереву как и все нормальные собаки со всеми нормальными котами");
        story.add("ну а потом что-то пошло реально не так и они узнали что кошака зовут " + nameKitten+ " и это вообще-то котейка");
        story.add("потом они узнали её возраст "+ ageKitten+" ну и поняли что собаки по возроасту живут вроде дольше");
        story.add("но жизней же у котов больше, так что фиг его знает кто в выиграше");//+ я хочу спать + геомку ещё сделать надо +сейчас час ночи(когда доделал то уже 2), крч потом допишу эту сверх скучную или нет историю

    }

  private Runnable mUpdateTimeTask1 = new Runnable() {
      @Override
      public void run() {

              mainTextView.append( TextThatWillBeWrited );

      }// do what you need to do here after the delay

  };

    private Runnable mUpdateTimeTask2 = new Runnable() {

        @Override
        public void run() {
        for (int j = 0; j < temporaryText.length(); j++) {
            char a_char = temporaryText.charAt(j);
            TextThatWillBeWrited = String.valueOf(a_char);
            mHandler.postDelayed(mUpdateTimeTask1, 200);
        }
                TextThatWillBeWrited += System.getProperty ("line.separator");
                mainTextView.append(System.getProperty ("line.separator"));}// do what you need to do here after the delay

    };


  public void Timer(final List text){
      this.text=text;
      for (int i = 0; i < text.size(); i++) {
          temporaryText = text.get(i).toString();
          mHandler.postDelayed(mUpdateTimeTask2, 2000);
      }

  }

    @Override
    protected void onResume() {
        super.onResume();

        Timer(story);
    }
}
      /*
          public void run() {
              for (int i = 0; i < text.size(); i++) {

                      temporaryText = text.get(i).toString();
                      for (int j = 0; j < temporaryText.length(); j++) {
                          char a_char = temporaryText.charAt(j);
                          TextThatWillBeWrited += a_char;
                          mainTextView.setText(TextThatWillBeWrited);
                      }

              }//Do something after 100ms
          }
      }, 100);*/
      /* public void Timer(final List text){
            Thread run = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < text.size(); i++) {
                        try {
                            temporaryText = text.get(i).toString();
                            for (int j = 0; j < temporaryText.length(); j++){
                                char a_char = temporaryText.charAt(j);
                                TextThatWillBeWrited +=a_char;
                                mainTextView.setText( TextThatWillBeWrited );
                                Thread.sleep(200);
                            }
                            //ДЕЛАЕМ
                            Thread.sleep(2000); //1000 - 1 сек
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            });
            run.start(); // заводим
        }*/

  /* private final Runnable mUpdateUITimerTask = new Runnable() {
       public void run() {
           // do whatever you want to change here, like:
           mainTextView.setText("Second text to display!");
       }
   };
    /*mHandler.postDelayed(new Runnable() {
        @Override
        public void run() {
            //Do something after 100ms
        }
    }, 100);
    //run the mUpdateUITimerTask run() method in 10 seconds from now
    //mHandler.(mUpdateUITimerTask, 10 * 1000);

   new Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            // this code will be executed after 2 seconds
        }
    }, 2000);*/