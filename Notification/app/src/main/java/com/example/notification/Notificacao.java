package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notificacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotificar1Prog = (Button) findViewById(R.id.btnNotificar1);

        btnNotificar1Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String mensagem = "50% de desconto.";
                String titulo = "Promoção!";
                notificarUsuario(mensagem, titulo);
            }
            //método notificarUsuario
            //Parâmetros do tipo texto: Mensagem e Título
            public void notificarUsuario(String mensagem, String titulo){
                //Verifica se o aplicativo está executando em um dispositivo com versão//superior a API
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    CharSequence nome = "promocao";
                    String descricao = "promocao";

                    //Construindo a prioridade da notificação
                    int importancia = NotificationManager.IMPORTANCE_DEFAULT;
                    NotificationChannel channel = new NotificationChannel("9000", nome, importancia);
                    channel.setDescription(descricao);
                    //Cria o notificationCompat com um canal, para as versoes mais novas do Android
                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext(),"9000");
                    //Construindo o título da notificação
                    notificacao.setContentTitle(titulo);
                    //Construindo a mensagem da notificação
                    notificacao.setContentText(mensagem);
                    //Construindo o ícone da notificação
                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                    //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                    notificacao.setAutoCancel(true);
                    //Construindo a intenção que chama a Activity promoção quando o usuário clicar na mensagem
                    Intent it = new Intent(getBaseContext(), Promocao.class);
                    //Utilizando o PendingIntent para que o Android consiga executar a Activity
                    //do seu projeto
                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                    //Atribuindo na notificação a intenção que será executada, quando o usuário
                    //clicar na notificação
                    notificacao.setContentIntent(pit);
                    //Criando o objeto para gerenciar e gerar a notificação no Android
                    NotificationManager notificar = getSystemService(NotificationManager.class);
                    //Atribuindo o canal
                    notificar.createNotificationChannel(channel);
                    //Executando a notificação com o id fixo: 9000
                    notificar.notify(9000, notificacao.build());
                }
                else {
                    //Objeto "notificacao" para receber os parâmetros e construir a estrutura da notificação
                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                    //Construindo o título da notificação
                    notificacao.setContentTitle(titulo);
                    //Construindo a mensagem da notificação
                    notificacao.setContentText(mensagem);
                    //Construindo a prioridade da notificação
                    notificacao.setPriority(Notification.PRIORITY_HIGH);
                    //Construindo o ícone da notificação
                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                    //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                    notificacao.setAutoCancel(true);
                    //Construindo a intenção que chama a Activity promoção
                    //quando o usuário clicar na mensagem
                    Intent it = new Intent(getBaseContext(), Promocao.class);
                    //Utilizando o PendingIntent para que o Android consiga executar a Activity
                    //do seu projeto
                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                    //Atribuindo na notificação a intenção que será executada, quando o usuário
                    //clicar na notificação
                    notificacao.setContentIntent(pit);
                    //Criando o objeto para gerenciar e gerar a notificação no Android
                    NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                    //Executando a notificação com o id fixo: 9000
                    notificar.notify(9000, notificacao.build());
                }
            }
        });
        Button btnNotificar2Prog = (Button) findViewById(R.id.btnNotificar2);
        btnNotificar2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String mensagem = "Confira a promoção do mascote mais queridinho da galera";
                String titulo = "Mascote Droid: Em promoção!";
                notificarUsuario(mensagem, titulo);
            }
            //método notificarUsuario
            //Parâmetros do tipo texto: Mensagem e Título
            public void notificarUsuario(String mensagem, String titulo){
                //Verifica se o aplicativo está executando em um dispositivo com versão
                //superior a API
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    CharSequence nome = "promocao";
                    String descricao = "promocao";

                    //Construindo a prioridade da notificação
                    int importancia = NotificationManager.IMPORTANCE_DEFAULT;
                    NotificationChannel channel = new NotificationChannel("9001", nome, importancia);
                    channel.setDescription(descricao);
                    //Cria o notificationCompat com um canal, para as versoes mais novas do Android
                    NotificationCompat.Builder notificacao = new
                            NotificationCompat.Builder(getBaseContext(),"9001");
                    //Construindo o título da notificação
                    notificacao.setContentTitle(titulo);
                    //Construindo a mensagem da notificação
                    notificacao.setContentText(mensagem);
                    //Construindo o ícone da notificação
                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                    //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                    notificacao.setAutoCancel(true);
                    //Construindo a intenção que chama a Activity promoção
                    //quando o usuário clicar na mensagem
                    Intent it = new Intent(getBaseContext(), Promocao2.class);
                    //Utilizando o PendingIntent para que o Android consiga executar a Activity
                    //do seu projeto
                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                    //Atribuindo na notificação a intenção que será executada, quando o usuário
                    //clicar na notificação
                    notificacao.setContentIntent(pit);
                    //Criando o objeto para gerenciar e gerar a notificação no Android
                    NotificationManager notificar = getSystemService(NotificationManager.class);
                    //Atribuindo o canal
                    notificar.createNotificationChannel(channel);
                    //Executando a notificação com o id 9001
                    notificar.notify(9001, notificacao.build());
                }
                else {
                    //Objeto "notificacao" para receber os parâmetros e construir a estrutura da notificação
                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                    //Construindo o título da notificação
                    notificacao.setContentTitle(titulo);
                    //Construindo a mensagem da notificação
                    notificacao.setContentText(mensagem);
                    //Construindo a prioridade da notificação
                    notificacao.setPriority(Notification.PRIORITY_HIGH);
                    //Construindo o ícone da notificação
                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                    //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                    notificacao.setAutoCancel(true);
                    //Construindo a intenção que chama a Activity promoção
                    //quando o usuário clicar na mensagem
                    Intent it = new Intent(getBaseContext(), Promocao2.class);
                    //Utilizando o PendingIntent para que o Android consiga executar a Activity
                    //do seu projeto
                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                    //Atribuindo na notificação a intenção que será executada, quando o usuário
                    //clicar na notificação
                    notificacao.setContentIntent(pit);
                    //Criando o objeto para gerenciar e gerar a notificação no Android
                    NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                    //Executando a notificação com o id fixo: 9000
                    notificar.notify(9001, notificacao.build());
                }
            }
        });
    }
}

