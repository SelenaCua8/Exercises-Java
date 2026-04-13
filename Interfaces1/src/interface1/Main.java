package interface1;

public class Main {

    public static void main(String[] args) {
        
        // 1. Creamos la transacción "Sujeto"
        // Monto: 5000 | Cuenta Activa: true | Límite: 4000
        // (Fijate que acá el monto supera el límite, ¡debería fallar!)
        Transaccion miCompra = new Transaccion(5000.0, 4000.0, true);

        // 2. Creamos los "Inspectores" (Validadores)
        ValidarMonto vMonto = new ValidarMonto();
        ValidarCuentaActiva vCuenta = new ValidarCuentaActiva();
        ValidarLimiteDiario vLimite = new ValidarLimiteDiario();

        // 3. Probamos cada uno por separado para ver qué dicen
        System.out.println("--- Resultados del Banco ---");
        
        boolean montoOk = vMonto.validar(miCompra);
        System.out.println("¿Monto positivo?: " + (montoOk ? "SÍ ✅" : "NO ❌"));

        boolean cuentaOk = vCuenta.validar(miCompra);
        System.out.println("¿Cuenta activa?: " + (cuentaOk ? "SÍ ✅" : "NO ❌"));

        boolean limiteOk = vLimite.validar(miCompra);
        System.out.println("¿Dentro del límite?: " + (limiteOk ? "SÍ ✅" : "NO ❌"));

        // 4. Decisión Final
        if (montoOk && cuentaOk && limiteOk) {
            System.out.println("\n💰 RESULTADO: ¡TRANSACCIÓN APROBADA!");
        } else {
            System.out.println("\n🚫 RESULTADO: TRANSACCIÓN RECHAZADA.");
        }
    }
}