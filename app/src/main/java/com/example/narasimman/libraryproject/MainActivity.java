package com.example.narasimman.libraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Here we are going to create our own library
Intially import new library project
File->new->new Module->android libarary
after creating the library one folder will be created
In that folder add some code to export your library as jar file


build.gradle
task deleteOldJar(type: Delete){
        delete 'release/AndroidPlugin2.jar'
    }

    task exportJar(type: Copy) {
        from ('build/intermediates/bundles/release/')
        into ('release/')
        include ('classes.jar')
        rename('classes.jar', 'AndroidPlugin2.jar')
    }
    exportJar.dependsOn(deleteOldJar, build)


 And in left corner of your android studio choose gradle tab
 inside that youll find your library project
 In that search for export jar and wait till the build is successfull

Once you see the build successful message in the run window, using normal file explorer go to exported jar
 using the path: C:\Users\name\AndroidStudioProjects\ProjectName\app\release you should see in this directory your jar file.(Inside your library project)

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
