package bol5;
/**
 *
 * @author jalvarezbarciela
 */
public class Conta {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;
    
    public Conta(){
        
    }   
    public Conta(String nomeCliente, String numeroConta, double saldo){
    this.nomeCliente=nomeCliente;
    this.numeroConta=numeroConta;
    this.saldo=saldo;
    }
    public void setNome(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    public void setNumero(String numeroConta){
        this.numeroConta=numeroConta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public String getNome(){
        return nomeCliente;
    }
    public String getNumero(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void Ingreso(double ingreso){
        if(ingreso<0)
            System.out.println("Non se poden ingresar cantidades negativas");
        else    
            this.saldo=saldo+ingreso;
    }
    public void Reintegro(double reintegro){
        if(saldo>reintegro)
            if(reintegro<0)
                System.out.println("Non se poden reintegrar cantidades negativas");
            else
                this.saldo=saldo-reintegro;
    }
        public void transferencia(Conta contaDestino,Double importe) {
        if(saldo>=importe){
        saldo=(saldo-importe);
        contaDestino.setSaldo((contaDestino.getSaldo())+importe);
        System.out.println("Realizouse a transferencia de "+importe+"€ a o número de conta "+(contaDestino.getNumero())+"\nO novo saldo e de"+saldo);
        }
        else 
        System.out.println("Non hai saldo suficiente para realizar a transferencia");
        }
        
    public void amosar(){
        System.out.println("Nome:"+nomeCliente+"\nNumero de conta:"+numeroConta+"\nSaldo:"+saldo);
    }
    }   
