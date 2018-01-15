package com.example.views.data;

import android.provider.BaseColumns;
/**
 * Created by Дмитрий on 28.12.2017.
 */

public final class ToDoList {

    private ToDoList() {

    }
    public static final class ItemEntry implements BaseColumns {
        public final static String TABLE_NAME = "items";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "todo";

    }
}
