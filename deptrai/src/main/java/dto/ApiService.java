package dto;

import java.io.IOException;
import java.util.List;

public interface ApiService {
    List<SearchResult> search(String keyword) throws IOException, InterruptedException;
    String trend(List<String> trendWord) throws IOException, InterruptedException;
}