package ru.dmitriev.simplenumber;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NumberController {

    public NumberController() {
    }


    @GetMapping("number/{value:\\d{1,18}}/simple")//регулярка для ограничения числел больше 10^18
    Number checkNumber(@PathVariable Long value){
        return new Number(value);
    }
}
