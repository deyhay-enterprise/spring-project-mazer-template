package com.deyhayenterprise.mazeradmintemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

    @GetMapping("/menu-horizontal")
    public String getMenuHorizontal(Model model) {
        return "fragments/menuh :: menuh";
    }

    @GetMapping("/menu-vertical")
    public String getMenuVertical(Model model) {
        return "fragments/menu :: menu";
    }

    @GetMapping("/bar-horizontal")
    public String getBarHorizontal(Model model) {
        return "fragments/barh :: barh";
    }

    @GetMapping("/bar-vertical")
    public String getBarVertical(Model model) {
        return "fragments/bar :: bar";
    }
}
