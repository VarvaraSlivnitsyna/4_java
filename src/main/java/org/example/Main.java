package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;



public class Main {
    public static void main(String[] args) {
        try {
            URL url_1 = new URL("https://fake-json-api.mock.beeceptor.com/companies");
            try (InputStream in = url_1.openStream();
                 InputStreamReader byte_trans = new InputStreamReader(in);
                 BufferedReader reader = new BufferedReader(byte_trans)) {

                StringBuilder json_storage = new StringBuilder();
                String parse_line;
                while ((parse_line = reader.readLine()) != null) {
                    json_storage.append(parse_line);
                }

                ObjectMapper mapper = new ObjectMapper();
                Company[] companies = mapper.readValue(json_storage.toString(), Company[].class);

                for (Company company_info : companies) {
                    company_info.print();
                }
            }
            URL url_2 = new URL("https://dummy-json.mock.beeceptor.com/posts");
            try (InputStream in = url_2.openStream();
                 InputStreamReader byte_trans = new InputStreamReader(in);
                 BufferedReader reader = new BufferedReader(byte_trans)) {

                StringBuilder json_storage = new StringBuilder();
                String parse_line;
                while ((parse_line = reader.readLine()) != null) {
                    json_storage.append(parse_line);
                }

                ObjectMapper mapper = new ObjectMapper();
                Post[] posts = mapper.readValue(json_storage.toString(), Post[].class);
                for (Post post_stat : posts) {
                    post_stat.print();
                }
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

