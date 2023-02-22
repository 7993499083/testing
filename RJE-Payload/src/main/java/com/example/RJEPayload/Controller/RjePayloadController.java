package com.example.RJEPayload.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RJEPayload.Entity.Rjepayload;
import com.example.RJEPayload.Model.RjePayloadRequest;
import com.example.RJEPayload.Model.RjepayloadResponse;
import com.example.RJEPayload.Service.RjePayloadService;

@RestController
public class RjePayloadController {

	@Autowired
	private RjePayloadService rjePayloadService;

	@PostMapping(path = "insert_rje_payload")
	public ResponseEntity<RjepayloadResponse> insertRjePayload(@RequestBody RjePayloadRequest rjePayloadRequest) {
		return rjePayloadService.saveRjePayload(rjePayloadRequest);
	}

	@GetMapping(path = "get_all_rje_payload")
	public ResponseEntity<List<Rjepayload>> getAll() {

		return rjePayloadService.getAll();

	}

	@GetMapping(path = "get_rje_payload")
	public ResponseEntity<RjepayloadResponse> getRjepayload(@RequestParam int id) {

		return rjePayloadService.getById(id);

	}

	@PutMapping(path = "update_rje_payload")
	public ResponseEntity<RjepayloadResponse> updateRjePayload(@RequestParam int id,
			@RequestBody RjePayloadRequest rjePayloadRequest) {

		return rjePayloadService.updateRjePayload(id, rjePayloadRequest);

	}

	@DeleteMapping(path = "delete_rje_payload")
	public ResponseEntity<RjepayloadResponse> deleteRjePayload(@RequestParam int id) {
		return rjePayloadService.deleteRjePayload(id);

	}
}
