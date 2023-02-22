package com.example.RJEPayload.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.RJEPayload.Entity.Rjepayload;
import com.example.RJEPayload.Model.RjePayloadRequest;
import com.example.RJEPayload.Model.RjepayloadResponse;
import com.example.RJEPayload.Repository.RjePayloadRepository;

@Service
public class RjePayloadService {

	@Autowired
	private RjePayloadRepository rjePayloadRepository;

	public ResponseEntity<List<Rjepayload>> getAll() {
		List<Rjepayload> rjepayload = rjePayloadRepository.findAll();
		return new ResponseEntity<>(rjepayload, HttpStatus.OK);
	}

	public ResponseEntity<RjepayloadResponse> saveRjePayload(RjePayloadRequest request) {
		Rjepayload rjepayload = new Rjepayload();

		rjepayload.setRjePayldId(request.getRjePayldId());
		rjepayload.setMsgMastId(request.getMsgMastId());
		rjepayload.setCreationDate(request.getCreationDate());
		rjepayload.setRjeBlk1(request.getRjeBlk1());
		rjepayload.setRjeBlk2(request.getRjeBlk2());
		rjepayload.setRjeBlk3(request.getRjeBlk3());
		rjepayload.setRjeBlk4(request.getRjeBlk4());
		rjepayload.setRjeBlk5(request.getRjeBlk5());

		Rjepayload rjepayloads = rjePayloadRepository.save(rjepayload);
		RjepayloadResponse rjepayloadResponse = new RjepayloadResponse();
		{
			if (rjepayloads != null) {
				rjepayloadResponse.setResponseCode(200);
				rjepayloadResponse.setResponseMessage("add successfully");

			}

			return new ResponseEntity<>(rjepayloadResponse, HttpStatus.OK);

		}
	}

	public ResponseEntity<RjepayloadResponse> updateRjePayload(int id, RjePayloadRequest request) {

		Rjepayload rjePayload = rjePayloadRepository.findById(id).get();
		RjepayloadResponse rjepayloadResponse = new RjepayloadResponse();
		if (rjePayload == null) {

			rjepayloadResponse.setResponseCode(401);
			rjepayloadResponse.setResponseMessage("not found existValue");
		} else {

			Rjepayload rjepayload = new Rjepayload();
			rjepayload.setRjePayldId(id);
			rjepayload.setMsgMastId(request.getMsgMastId());
			rjepayload.setCreationDate(request.getCreationDate());
			rjepayload.setRjeBlk1(request.getRjeBlk1());
			rjepayload.setRjeBlk2(request.getRjeBlk2());
			rjepayload.setRjeBlk3(request.getRjeBlk3());
			rjepayload.setRjeBlk4(request.getRjeBlk4());
			rjepayload.setRjeBlk5(request.getRjeBlk5());
			Rjepayload rjepayloads = rjePayloadRepository.save(rjepayload);
			rjepayloadResponse.setResponseCode(200);
			rjepayloadResponse.setResponseMessage("update successfully");
		}
		return new ResponseEntity<>(rjepayloadResponse, HttpStatus.OK);

	}

	public ResponseEntity<RjepayloadResponse> deleteRjePayload(int id) {

		Rjepayload rjePayload = rjePayloadRepository.findById(id).get();
		RjepayloadResponse rjepayloadResponse = new RjepayloadResponse();

		if (null == rjePayload) {

			rjepayloadResponse.setResponseCode(401);
			rjepayloadResponse.setResponseMessage("not found");
		}

		else {
			rjePayloadRepository.deleteById(id);
			rjepayloadResponse.setResponseCode(200);
			rjepayloadResponse.setResponseMessage("delete successfully");

		}

		return new ResponseEntity<>(rjepayloadResponse, HttpStatus.OK);

	}

	public ResponseEntity<RjepayloadResponse> getById(int id) {

		Rjepayload rjePayload = rjePayloadRepository.findById(id).get();
		RjepayloadResponse rjepayloadResponse = new RjepayloadResponse();

		if (null == rjePayload) {

			rjepayloadResponse.setResponseCode(401);
			rjepayloadResponse.setResponseMessage("id not found");

		} else {

			rjepayloadResponse.setRjepayload(rjePayload);
			rjepayloadResponse.setResponseCode(200);
			rjepayloadResponse.setResponseMessage("found ID");

		}

		return new ResponseEntity<>(rjepayloadResponse, HttpStatus.OK);
	}
}
