package dev.odes.fleet.core.base.controller;

import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.common.utils.IdUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/base/id")
public class IdController {
    @GetMapping(path = "")
    public ResponseData getId() {
        String id = IdUtils.getId();
        return new ResponseData(id);
    }

    @GetMapping(path = "/list")
    public ResponseData getIds() {
        List<String> idList = IdUtils.getIdList();
        return new ResponseData(idList);
    }

    @GetMapping(path = "/list/{num}")
    public ResponseData getIdList(@PathVariable int num) {
        List<String> idList = IdUtils.getIdList(num);
        return new ResponseData(idList);
    }

}
