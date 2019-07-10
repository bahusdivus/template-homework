package ru.bahusdivus.templatehomework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bahusdivus.templatehomework.entities.Item;
import ru.bahusdivus.templatehomework.entities.Order;
import ru.bahusdivus.templatehomework.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TemplateController {

    @RequestMapping("/")
    public String generatePage(Model model) {
        Map<Item, Integer> items = new HashMap<>();
        items.put(new Item("Cheap thing", 1), 1001);
        items.put(new Item("Expensive thing", 10000), 2);

        List<Item> promo = new ArrayList<>();
        promo.add(new Item("Bugatti Veyron", 1000000));
        promo.add(new Item("Doshirak", 1));

        model.addAttribute("user", new User("John Smith", false, 0));
        model.addAttribute("order", new Order(132132L, LocalDate.now(), items));
        model.addAttribute("promo", promo);

        return "email";
    }
}
