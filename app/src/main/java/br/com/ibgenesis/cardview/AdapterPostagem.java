package br.com.ibgenesis.cardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.ViewHolder> {


    @NonNull
    @Override //Responsável por criar as vizualizações(cardview) na memória RAM
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override //Responsável por criar as visualizações(cardview) na Tela do Celular
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override // Responsável pelo número de visulizações que irão aparecer
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
