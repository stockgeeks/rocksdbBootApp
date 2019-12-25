package io.stockgeeks.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/rocks")
public class RocksApi {

  @PostMapping
  public ResponseEntity<String> save(String key, String value) {
    log.info("RocksApi.save");
    return ResponseEntity.ok(value);
  }

  @GetMapping
  public ResponseEntity<String> find(String key) {
    log.info("RocksApi.find");
    return ResponseEntity.ok(key);
  }

  @DeleteMapping
  public ResponseEntity<String> delete(String key) {
    log.info("RocksApi.delete");
    return ResponseEntity.ok(key);
  }
}
