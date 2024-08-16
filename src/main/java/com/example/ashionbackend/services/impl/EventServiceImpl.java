package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Event;
import com.example.ashionbackend.repositories.EventRepository;
import com.example.ashionbackend.services.EventService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
	private final EventRepository eventRepository;

	public EventServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	@Override
	public Event save(Event entity) {
		return eventRepository.save(entity);
	}

	@Override
	public Event findById(int id) {
		return eventRepository.findById(id);
	}

	@Override
	public List<Event> findAll() {
		return eventRepository.findAll();
	}

	@Override
	public Page<Event> findAll(Pageable pageable) {
		return eventRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return eventRepository.updateByIdAndStatus(id, status);
	}
}
