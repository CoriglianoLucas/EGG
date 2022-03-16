package ejercicio9.entidades;

public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor(Matematica m){
        double mayor;
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();
        if (num1>num2){
            mayor = num1;
        }else if (num2>num1){
            mayor = num2;
        }else{
            System.out.println("Los numeros son iguales");
            mayor=num1;
        }
        return mayor;
    }
    
    public double calcularPotencia(Matematica m){
        double resultado;
        double num1 = Math.round(m.getNumero1());
        double num2 = Math.round(m.getNumero2());
        if (num1>num2){
            resultado = Math.pow(num1, num2);
        }else if (num2>num1){
            resultado = Math.pow(num2, num1);
        }else{
            System.out.println("Los numeros son iguales");
            resultado = Math.pow(num1, num2);
        }
        return resultado;
    }
    
    public double calculaRaiz(Matematica m){
        double resultado;
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();
        if (num1>num2){
            resultado = Math.sqrt(num2);
        }else if (num2>num1){
            resultado = Math.sqrt(num1);
        }else{
            System.out.println("Los numeros son iguales");
            resultado = Math.sqrt(num1);
        }
        return resultado;
    }

}
