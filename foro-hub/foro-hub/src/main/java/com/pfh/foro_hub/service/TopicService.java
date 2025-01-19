package com.pfh.foro_hub.service;

import com.pfh.foro_hub.model.Topic;
import com.pfh.foro_hub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic) {
        // Verificar si ya existe un tópico con el mismo título y mensaje
        if (topicRepository.findByTitleAndMessage(topic.getTitle(), topic.getMessage()).isPresent()) {
            throw new IllegalArgumentException("Ya existe un tópico con el mismo título y mensaje.");
        }
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Page<Topic> getAllTopics(Pageable pageable) {
        return topicRepository.findAll(pageable);
    }

    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    public Topic updateTopic(Long id, Topic topic) {
        Optional<Topic> existingTopic = topicRepository.findById(id);
        if (existingTopic.isPresent()) {
            // Actualizar los campos del tópico existente
            Topic updatedTopic = existingTopic.get();
            updatedTopic.setTitle(topic.getTitle());
            updatedTopic.setMessage(topic.getMessage());
            updatedTopic.setStatus(topic.getStatus());
            updatedTopic.setAuthor(topic.getAuthor());
            updatedTopic.setCourse(topic.getCourse());
            return topicRepository.save(updatedTopic);
        }
        return null; // Si no se encuentra el tópico, devolver null
    }

    public boolean deleteTopic(Long id) {
        Optional<Topic> existingTopic = topicRepository.findById(id);
        if (existingTopic.isPresent()) {
            topicRepository.deleteById(id);
            return true; // Tópico eliminado
        }
        return false; // Tópico no encontrado
    }
}