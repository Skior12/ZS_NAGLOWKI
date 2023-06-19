package com.spring.project.ProjectSpring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/RequestHeader")
    public class Controller {




    @RequestMapping(
            produces = MediaType.TEXT_HTML_VALUE)
    public String ExampleRequestHeader(@RequestHeader("User-Agent") String klient,
                                       @RequestHeader("Accept-Language") String jezyk,
                                       @RequestHeader("Host") String host)
        throws Exception {
        return "<b>Przegląda/ klient HTTP:</b><br> " + klient
                + "<br><br><b>Język:</b><br> " + jezyk
                + "<br><br><b>Host:</b><br> " + host;
    }


    /*@RequestMapping("/")
    public String index() {
        return "Nasz pierwszy projekt i już działający serwer";
    }*/

    /*@RequestMapping("/tajne")
    public String metoda(){
        return "Tajny adres";
    }
    @RequestMapping("/lista")
    public ArrayList<String> metoda2(){
        ArrayList<String> kolekcja = new ArrayList<String>();
        kolekcja.add("element nr 1");
        kolekcja.add("element nr 2");
        kolekcja.add("element nr 3");

        return kolekcja;
    }*/


  //  @GetMapping(value ="/{imie}/{nazwisko}/{pesel}/{mail}/{telefon}")
    //    public String PrzykladZPath(@PathVariable String imie,@PathVariable
   //     String nazwisko,@PathVariable String pesel,@PathVariable String mail, @PathVariable String telefon
     //   )throws Exception{
   //
    //        return "Imie: "+imie+" Nazwisko: "+nazwisko+" Pesel: "+pesel+" E-Mail: "+mail+" Telefon: "+telefon;
    //    }
/*    @GetMapping(value = "/{dzialanie}/{liczba1}/{liczba2}")
    public Long PrzykladZPath(@PathVariable String dzialanie,@PathVariable
    Long liczba1,@PathVariable Long liczba2
    )throws Exception{
        Calc obj = new Calc();
        return obj.myMethod(dzialanie, liczba1, liczba2);
        //return dzialanie;
    }*/
   // public String PrzykladZPath(@RequestParam String dzialania, @RequestParam
    //Long liczba1, @RequestParam Long liczba2)

}