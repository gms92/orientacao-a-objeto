public class TesteSistema {



        public static void main(String[] args) {
            Gerente g  = new Gerente();
            g.setSenha(2222);

            Administrador adm = new Administrador();
            adm.setSenha(2222);

            Cliente cliente= new Cliente();
            cliente.setSenha(2222);

            SistemaInterno si = new SistemaInterno();
            si.autentica(g);                      //Agora é possivel autenticar as 3 classes através do contrato
            si.autentica(adm);                    //fazendo gerente e adm ainda serem um funcionario
            si.autentica(cliente);                 //mas não o cliente.
            g.setSalario(5000);
            adm.setSalario(3000);
            System.out.println(g.getSalario());
            System.out.println(adm.getSalario());
        }
    }


