package com.emst.cours.kaffeine.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.emst.cours.kaffeine.R;


public class CommandView extends RecyclerView.ViewHolder {

    public TextView userName ,userPhone ,userPrice ,userCity , userDateTime,btn_all_products;

    public CommandView(@NonNull View itemView) {
        super(itemView);

        userName = itemView.findViewById(R.id.command_user_name);
        userPhone = itemView.findViewById(R.id.command_phone_number);
        userPrice = itemView.findViewById(R.id.command_total_price);
        userDateTime = itemView.findViewById(R.id.command_date_time);
        userCity = itemView.findViewById(R.id.command_address_city);
        btn_all_products = itemView.findViewById(R.id.btn_all_product);
    }

}