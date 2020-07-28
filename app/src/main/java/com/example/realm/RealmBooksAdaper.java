package com.example.realm;

import android.content.Context;

import io.realm.RealmResults;

public class RealmBooksAdaper extends RealmModelAdapter<Book> {

    public RealmBooksAdaper(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}