package dev.osmanthus.fleet.core.base.controller;

import dev.osmanthus.fleet.common.response.ResponseData;
import dev.osmanthus.fleet.common.utils.IdUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/base/id")
public class IdController {
    @GetMapping(path = "/one")
    public ResponseData getId() {
        String id = IdUtils.getId();
        return new ResponseData(id);
    }

    @GetMapping(path = "/many")
    public ResponseData getIds() {
        List<String> idList = IdUtils.getIdList();
        return new ResponseData(idList);
    }

    @GetMapping(path = "/many/{num}")
    public ResponseData getIdList(@PathVariable("num") int num) {
        List<String> idList = IdUtils.getIdList(num);
        return new ResponseData(idList);
    }

}
