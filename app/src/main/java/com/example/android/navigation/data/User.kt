package com.example.android.navigation.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
        @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nickName: String,
    val Email: String,
    val Tel: Int
)