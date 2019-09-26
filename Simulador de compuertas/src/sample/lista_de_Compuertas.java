package sample;

public class lista_de_Compuertas {
    Puntero first;
    Puntero last;

    public lista_de_Compuertas() {
        first = null;
        last = null;
    }
    public void addfirst (int element) {
        if (this.first == null) {
            this.first = new Puntero(element);
            this.last = first;
        }else {
            Puntero n = new Puntero(element);
            n.next = this.first;
            this.first.prev = n;
            this.first = n;
        }
    }

    public void addlast (int element) {
        if (this.first == null) {
            this.first = new Puntero(element);  //si la lista está vacia, añade un nodo
            this.last = first;
        }else {
            Puntero n = new Puntero(element);
            n.prev = this.last;
            this.last.next = n;
            this.last = n;
        }
    }
}






