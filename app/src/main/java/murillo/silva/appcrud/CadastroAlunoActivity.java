 package murillo.silva.appcrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class CadastroAlunoActivity extends AppCompatActivity {
    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private AlunoDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.editNome);
                cpf = findViewById(R.id.editCPF);
                        telefone = findViewById(R.id.editTelefone);
                        dao = new AlunoDAO(this);

    }

    public void salvar(View view){
        Aluno a = new Aluno();
        a.setNome(nome.getText().toString());
        a.setCpf(cpf.getText().toString());
        a.setTelefone(telefone.getText().toString());
        long id = dao.inserir(a);
        Toast.makeText(this, "Sucess. ID number:" +id, Toast.LENGTH_SHORT).show();

    }

}