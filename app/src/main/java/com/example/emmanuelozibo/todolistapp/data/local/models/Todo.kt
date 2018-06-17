package com.example.emmanuelozibo.todolistapp.data.local.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "todo")
class Todo(
        @ColumnInfo(name = "todo_title")
        var title:String = "",
        @ColumnInfo(name = "todo_priority")
        var priority: Int = 0,
        @PrimaryKey(autoGenerate = true) var tId: Int = 0){
    var detail: String = ""
}