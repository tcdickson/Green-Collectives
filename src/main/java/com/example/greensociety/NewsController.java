package com.example.greensociety;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Callback;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class NewsController extends HomeApplication {
    @FXML
    private ListView<SyndEntry> rssListView;
    @FXML
    private ListView<SyndEntry> rssListView2;
    @FXML
    private ListView<SyndEntry> rssListView3;
    @FXML
    private ListView<SyndEntry> rssListView4;
    @FXML
    private ListView<SyndEntry> rssListView5;
    @FXML
    private ListView<SyndEntry> rssListView6;
    @FXML
    private ListView<SyndEntry> rssListView7;
    @FXML
    private ListView<SyndEntry> rssListView8;
    @FXML
    private WebView webView1;
    @FXML
    private WebView webView2;

    public NewsController() throws IOException, SAXException, ParserConfigurationException {
    }

    public void initialize() {
        try {
            loadRssFeeds("https://thehill.com/homenews/feed/", rssListView);
            loadRssFeeds("https://www.newsweek.com/rss", rssListView2);
            loadRssFeeds("https://www.rand.org/topics/national-security-and-terrorism.xml", rssListView3);
            loadRssFeeds("https://www.rand.org/topics/cyber-and-data-sciences.xml", rssListView4);
            loadRssFeeds("https://www.rand.org/topics/homeland-security-and-public-safety.xml", rssListView5);
            loadRssFeeds("https://www.armytimes.com/arc/outboundfeeds/rss/category/news/pentagon-congress/?outputType=xml", rssListView6);
            loadRssFeeds("https://www.armytimes.com/arc/outboundfeeds/rss/category/education-transition/?outputType=xml", rssListView7);
            loadRssFeeds("https://www.armytimes.com/arc/outboundfeeds/rss/category/pay-benefits/?outputType=xml", rssListView8);

            loadWebContent("https://newsletter.theatlasnews.co/", webView1);
            loadWebContent("https://www.whitehouse.gov/briefing-room/", webView2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadRssFeeds(String rssFeedURL, ListView<SyndEntry> listView) throws Exception {
        URL feedURL = new URL(rssFeedURL);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(feedURL));

        List<SyndEntry> entries = feed.getEntries();
        listView.setCellFactory(new Callback<>() {
            @Override
            public ListCell<SyndEntry> call(ListView<SyndEntry> listView) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(SyndEntry entry, boolean empty) {
                        super.updateItem(entry, empty);

                        if (empty || entry == null) {
                            setText(null);
                            setGraphic(null);
                        } else {
                            Hyperlink hyperlink = new Hyperlink(entry.getTitle());
                            hyperlink.setStyle(" -fx-font-family: Arial Black;" + "-fx-text-fill: #5A5A5A; " +
                                    "-fx-effect: dropshadow(gaussian, rgba(255,255,255,0.5), 0, 0, 0, 1);" +
                                    "-fx-effect: innershadow(three-pass-box, rgba(0,0,0,0.7), 6, 0.0, 0, 2); " +
                                    "-fx-font-weight: bold; ");
                            hyperlink.setOnAction(event -> {
                                String articleLink = entry.getLink();
                                getHostServices().showDocument(articleLink);
                            });
                            setGraphic(hyperlink);
                        }
                    }
                };
            }
        });
        listView.getItems().addAll(entries);
    }

    private void loadWebContent(String url, WebView webView) {
        WebEngine webEngine = webView.getEngine();
        webEngine.load(url);
        }
    }
