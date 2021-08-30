package ru.synergyitacademy.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class URLRunner {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = new URI("https://ya.ru/path?text=example#123");
        System.out.println("Fragment  : " + uri.getFragment());
        System.out.println("Host  : " + uri.getHost());
        System.out.println("Port  : " + uri.getPort());
        System.out.println("Query  : " + uri.getQuery());
        System.out.println("Path  : " + uri.getPath());
        System.out.println(uri.toString());

//        URL url = uri.toURL();

        URL url = new URL("https://www.vtb.ru/");

        URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36");
//        urlConnection.setRequestProperty("X-Real-IP", "192.168.0.1");
        urlConnection.setRequestProperty("Cookie", "yp=1624693264.ygu.1; yandexuid=4973669401622101263; yuidss=4973669401622101263; is_gdpr=0; is_gdpr_b=CL+0AhDqMCgC; i=rqxpy7Qs5WLV1rYlsbM9J2rQv/Ez7hCvK63IL+8PaxQBCdfK711JQ76eXbbyqnMonRIY4WU74KCQXNi0VozaRg0X2LM=; gdpr=0; _ym_uid=1630346113284926125; _ym_d=1630346114; _ym_isad=2; _yasc=fYwwY1WBp+kNmbGYX9mXcdMzfTSU/SXTj2Kd6QPEa42WSFiG");
        urlConnection.connect();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }

        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}
