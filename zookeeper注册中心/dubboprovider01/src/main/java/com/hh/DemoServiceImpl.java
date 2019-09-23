package com.hh;

import com.hh.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: NinetyOne
 * Date: 2019/1/22
 * Time: 13:51
 * To change this template use File | Setting | File Template.
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say(String name) {
        return ("hello "+name);

    }
}
