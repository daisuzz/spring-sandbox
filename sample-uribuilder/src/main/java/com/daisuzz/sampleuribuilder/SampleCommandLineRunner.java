package com.daisuzz.sampleuribuilder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class SampleCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(final String... args) {

        // UriComponentsBuilder#encode()を利用した場合
        // URI変数として渡したreserved character → encodeされる
        // URIテンプレート内のreserved character → encodeされない
        String url1 = UriComponentsBuilder.fromUriString("http://localhost:8080/日;/{path}/")
                .query("query=日;")
                .query("query2={query}")
                .encode()
                .buildAndExpand("日;", "日;")
                .toUriString();

        System.out.println(url1);

        // UriComponents#encode()を利用した場合
        // URI変数として渡したreserved character → encodeされない
        // URIテンプレート内のreserved character → encodeされない
        String url2 = UriComponentsBuilder.fromUriString("http://localhost:8080/日;/{path}/")
                .query("query=日;")
                .query("query2={query}")
                .buildAndExpand("日;", "日;")
                .encode()
                .toUriString();

        System.out.println(url2);
    }
}
