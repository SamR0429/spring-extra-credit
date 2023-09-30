package com.codeup.extracredit.controllers;


import com.codeup.extracredit.models.Order;
import com.codeup.extracredit.repositories.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderDao;

    public OrderController(OrderRepository orderDao){
        this.orderDao = orderDao;
    }

    @GetMapping("/test")
    @ResponseBody
    public String returnTest() {
        return "Test";
    }


    @GetMapping("/{id}")
    @ResponseBody
    public Order returnOrder(@PathVariable Long id) {
        return orderDao.getOrderById(id);
    }



    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("order", new Order());
        return "orders/create";
    }

    @PostMapping("/create")
    public String saveOrderForm(@ModelAttribute Order order){

        Order orderToSave = new Order(
                order.getEmail(),
                order.getPrice()
        );

        orderDao.save(order);
        //this line might be very long, but basically we need to save the given order and i dont think this was the right way to do it
        return "redirect:/show";
    }

}
