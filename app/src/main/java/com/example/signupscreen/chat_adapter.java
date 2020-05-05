package com.example.signupscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



    public class chat_adapter extends RecyclerView.Adapter<chat_adapter.myViewHolder> {
    ArrayList<data>usersList;
    Context contextList;

        public chat_adapter(ArrayList<data> usersList, Context contextList) {
            this.usersList = usersList;
            this.contextList = contextList;
        }

        @Override
        public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false);
            myViewHolder myViewHolder = new myViewHolder(view);

            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
            holder.username.setText(usersList.get(position).getName());
            holder.message.setText(usersList.get(position).getMessage());


        }

        @Override
        public int getItemCount() {
            return usersList.size();
        }

        class myViewHolder extends RecyclerView.ViewHolder {
            TextView username;
            TextView message;

            public myViewHolder(@NonNull View itemView) {
                super(itemView);
                username=itemView.findViewById(R.id.name);
                message=itemView.findViewById(R.id.password);

            }
        }
    }
