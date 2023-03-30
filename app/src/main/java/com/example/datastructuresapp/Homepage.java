package com.example.datastructuresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button arrbutton = findViewById(R.id.array);
        Button llbtn = findViewById(R.id.llbtn);
        Button stkbtn = findViewById(R.id.stack);
        Button qu = findViewById(R.id.button7);
        Button tree = findViewById(R.id.button8);
        Button graph = findViewById(R.id.button9);
        Button hmp = findViewById(R.id.hashmap);
        Button search = findViewById(R.id.searching);
        Button sorting = findViewById(R.id.sorting);
        Button rec = findViewById(R.id.button4);
        Button dp = findViewById(R.id.button5);

        arrbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openArray();
            }
        });
        llbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openLL();
            }
        });

        stkbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openSTK();
            }
        });
        qu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openQ();
            }
        });
        tree.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openTree();
            }
        });
        graph.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openGraph();
            }
        });

        hmp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openMap();
            }
        });
        search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
        sorting.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openSorting();
            }
        });
        rec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openRec();
            }
        });
        dp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openDP();
            }
        });
    }

    private void openDP() {
        goToURL("https://www.geeksforgeeks.org/dynamic-programming/");
    }

    private void openRec() {
        goToURL("https://www.geeksforgeeks.org/introduction-to-recursion-data-structure-and-algorithm-tutorials/");
    }

    private void openSorting() {
        goToURL("https://www.geeksforgeeks.org/sorting-algorithms/");
    }

    private void openSearch() {
        goToURL("https://www.geeksforgeeks.org/searching-algorithms/");
    }

    private void openMap() {
        goToURL("https://www.geeksforgeeks.org/hashing-data-structure/");
    }

    private void openGraph() {
        goToURL("https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/");
    }

    private void openTree() {
        goToURL("https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/");
    }

    private void openQ() {
        goToURL("https://www.geeksforgeeks.org/queue-data-structure/");
    }

    private void openSTK() {
        goToURL("https://www.geeksforgeeks.org/stack-data-structure/");
    }

    private void openLL() {
        goToURL("https://www.geeksforgeeks.org/data-structures/linked-list/");
    }

    private void openArray() {
        goToURL("https://www.geeksforgeeks.org/array-data-structure/");
    }

    private void goToURL (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}