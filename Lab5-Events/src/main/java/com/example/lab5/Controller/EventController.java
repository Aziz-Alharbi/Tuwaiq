package com.example.lab5.Controller;

import com.example.lab5.ApiResponses.ApiResponse;
import com.example.lab5.Model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/Events")

public class EventController {

    ArrayList<Event> events = new ArrayList<>();



    @PostMapping("/Event")
    public Event createEvent(@RequestBody Event event) {


        events.add(event);


        return event;
    }


    @GetMapping("/")
    public ArrayList<Event> getEvents() {

        return events;
    }


    @DeleteMapping("Deleting")
    public ApiResponse deleteEvent(@PathVariable int index) {

        events.remove(index);


        return
                new ApiResponse("Event deleted successfully !" , 200)

                ;    }

    @PutMapping("/Updating/{id}")
    public ApiResponse updateEvent(@RequestBody Event newEvent, @PathVariable String id) {


        for (Event event : events) {
            if (event.getId().equals(id)) {
                event.setTitle(newEvent.getTitle());
                event.setCapacity(newEvent.getCapacity());
                event.setEndDate(newEvent.getEndDate());
                event.setStartDate(newEvent.getStartDate());
                return
                        new ApiResponse("Event updated successfully !" , 200)

                        ;
        }
        }

        return
                new ApiResponse("Event not found !" , 200)

                ;    }


    @GetMapping("/project/search/{title}")
    public ApiResponse searching(@PathVariable String id){

        for(Event event : events){

            if (event.getTitle().equalsIgnoreCase(id)) {
                System.out.println("Event : " + event);
            }
        }


        return
                new ApiResponse("Event found successfully !" , 200)

                ;    }


    @PutMapping("/event/{id}/capacity")
    public ApiResponse capacityUpdate(@PathVariable String id, @RequestBody Event updatedEvent) {
        for (Event event : events) {
            if (event.getId().equals(id)) {
                event.setCapacity(updatedEvent.getCapacity());
                return
                        new ApiResponse("Capacity updated successfully !" , 200)

                        ;                }
        }
        return
                new ApiResponse("Event not found successfully !" , 200)

                ;    }




}
