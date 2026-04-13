package validador;

public class Main {

    public static void main(String[] args) {
        
        // 1. Creamos un Formulario (Ejemplo: Campo NO marcado, Rango 150 (mal), Email sin @)
        Formulario miForm = new Formulario(false, 150, "correo-sin-arroba");

        // 2. Instanciamos los validadores
        ValidadorFormulario vReq = new ValidadorCampoRequerido();
        ValidadorFormulario vRan = new ValidadorRango();
        ValidadorFormulario vEmail = new ValidadorFormatoEmail();

        // 3. Validamos cada aspecto
        boolean reqOk = vReq.validar(miForm);
        boolean rangoOk = vRan.validar(miForm);
        boolean emailOk = vEmail.validar(miForm);

        // 4. Mostramos el reporte
        System.out.println("--- REPORTE DE FORMULARIO ---");
        System.out.println("¿Campo obligatorio marcado?: " + (reqOk ? "SÍ" : "NO ❌"));
        System.out.println("¿Rango (1-100) correcto?: " + (rangoOk ? "SÍ" : "NO ❌"));
        System.out.println("¿Formato de Email válido?: " + (emailOk ? "SÍ" : "NO ❌"));

        // 5. Decisión final (TRABAJO EN CONJUNTO)
        if (reqOk && rangoOk && emailOk) {
            System.out.println("\n✅ FORMULARIO ENVIADO CON ÉXITO");
        } else {
            System.out.println("\n⚠️ ERROR: Corrija los campos marcados con ❌");
        }
    }
}