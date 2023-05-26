package dev.odes.fleet.core.base.controller;

import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.common.utils.IDUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/base/id")
public class IDController {
    @GetMapping(path = "")
    public ResponseData getId() {
        String id = IDUtils.getID();
        return new ResponseData(id);
    }

    @GetMapping(path = "/list")
    public ResponseData getIds() {
        List<String> idList = IDUtils.getIDList();
        return new ResponseData(idList);
    }

    @GetMapping(path = "/list/{num}")
    public ResponseData getIdList(@PathVariable int num) {
        List<String> idList = IDUtils.getIDList(num);
        return new ResponseData(idList);
    }

}
