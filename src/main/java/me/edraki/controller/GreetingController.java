package me.edraki.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import me.edraki.service.Greeting;

@RestController
@RequestMapping("/reservations")
public class GreetingController {


    final Logger logger = LoggerFactory.getLogger(this.getClass().toString());
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/lock", method = RequestMethod.POST)
    public String lock(@RequestBody String test) {
        // Putting the data into Mongo DB

        MongoClient mongoClient = new MongoClient("162.243.136.208", 32770);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("airbnb");
        MongoCollection<Document> dbCollection = mongoDatabase.getCollection("reservations");

        Document document = Document.parse(test);
        dbCollection.insertOne(document);
        mongoClient.close();
        logger.info("Test");
        logger.info("Done");
        return test;
    }
}

