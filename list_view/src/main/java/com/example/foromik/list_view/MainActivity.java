package com.example.foromik.list_view;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<String> oneToNineteen = new ArrayList<>();
    ArrayList<String> twentyToNinety = new ArrayList<>();
    ArrayList<String> onehundredToNinehundred = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1-19
        oneToNineteen.add("");
        oneToNineteen.add(" один");
        oneToNineteen.add(" два");
        oneToNineteen.add(" три");
        oneToNineteen.add(" четыре");
        oneToNineteen.add(" пять");
        oneToNineteen.add(" шесть");
        oneToNineteen.add(" семь");
        oneToNineteen.add(" восемь");
        oneToNineteen.add(" девять");
        oneToNineteen.add(" десять");
        oneToNineteen.add(" одиннадцать");
        oneToNineteen.add(" двенадцать");
        oneToNineteen.add(" тринадцать");
        oneToNineteen.add(" четырнадцать");
        oneToNineteen.add(" пятнадцать");
        oneToNineteen.add(" шестнадцать");
        oneToNineteen.add(" семнадцать");
        oneToNineteen.add(" восемнадцать");
        oneToNineteen.add(" девятнадцать");

        //20-90
        twentyToNinety.add("");
        twentyToNinety.add(" двадцать");
        twentyToNinety.add(" тридцать");
        twentyToNinety.add(" сорок");
        twentyToNinety.add(" пятьдесят");
        twentyToNinety.add(" шестьдесят");
        twentyToNinety.add(" семьдесят");
        twentyToNinety.add(" восемьдесят");
        twentyToNinety.add(" девяносто");

        //100-900
        onehundredToNinehundred.add("");
        onehundredToNinehundred.add("сто");
        onehundredToNinehundred.add("двести");
        onehundredToNinehundred.add("триста");
        onehundredToNinehundred.add("четыреста");
        onehundredToNinehundred.add("пятьсот");
        onehundredToNinehundred.add("шестьсот");
        onehundredToNinehundred.add("семьсот");
        onehundredToNinehundred.add("восемьсот");
        onehundredToNinehundred.add("девятсот");

        for(int i = 0; i < onehundredToNinehundred.size();i++){
            for(int j = 0; j < twentyToNinety.size();j++){
                for(int k = 0 ; k < oneToNineteen.size();k++){
                    if(twentyToNinety.get(j).equals("") && k <= oneToNineteen.size()-2){
                        numbers.add(onehundredToNinehundred.get(i) + oneToNineteen.get(k+1));
                    }
                    else if (k >= 0 && k <= 9){
                        numbers.add(onehundredToNinehundred.get(i) + twentyToNinety.get(j) + oneToNineteen.get(k));
                    }
                }
            }
        }
        //SET ADAPTER
        CustomAdapter adapter = new CustomAdapter(this,numbers);
        setListAdapter(adapter);
    }


}
