import java.util.ArrayList;

public class Classic {
    ArrayList<Shoes> running_shoes = new ArrayList<>();

    public ArrayList<Shoes> addClassicShoes() {
        running_shoes.add(new Shoes("", 0f, 38, "ruta1", false, 0));
        running_shoes.add(new Shoes("", 0f, 42, "ruta2", true, 0));
        running_shoes.add(new Shoes("", 0f, 43, "ruta3", false, 0));
        running_shoes.add(new Shoes("", 0f, 44, "ruta4", true, 0));

        return running_shoes;
    }

    public String showInformationShoes() {
        String Information = "";
        for (int i = 0; i < running_shoes.size(); i++) {
            Information += running_shoes.get(i).getReference() + "- Talla: " +
                    running_shoes.get(i).getsize() + " - Precio: " +
                    running_shoes.get(i).getPrice() + "- Fotos: " +
                    running_shoes.get(i).getphoto_route() + "- Envio a casa: " +
                    running_shoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    running_shoes.get(i).getcant_colours() + "\n________";

        }
        return Information;
    }
}